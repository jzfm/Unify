package com.unify.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.json.simple.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unify.domain.Song;
import com.unify.domain.University;

@Service
public class LookupServiceTesting {

	RestTemplate restTemplate = new RestTemplate();
	private static String urlEndpoint = "http://localhost:8080/universities/";

	
	@Async
	public Future<Song> getCurrentSong(String uniId) {
		Map<String,String> params=new HashMap<String,String>();
		params.put("uniId",uniId);
		String result = restTemplate.getForObject(urlEndpoint+"{uniId}/songs/current/", String.class,params);
		Gson gson=new GsonBuilder().create();		
		return new AsyncResult<Song>(gson.fromJson(result,Song.class));
	}
	
	@Async
	public void playSong(String uniId, Song song) {
		Map<String,String> params=new HashMap<String,String>();
		params.put("uniId",uniId);
		restTemplate.put(urlEndpoint+"{uniId}/songs/current", toJson(song),params);
	}

	
	@Async
	public int getCurrentSongResponseCode(String uniId) {
		Map<String,String> params=new HashMap<String,String>();
		params.put("uniId",uniId);
		removeErrorHandlerRestTemplate();
		
		ResponseEntity<String> response= restTemplate.exchange(urlEndpoint+"{uniId}/songs/current/", HttpMethod.GET, null, String.class, params);
		restTemplate=new RestTemplate();
		return response.getStatusCode().value();
	}
	
	private void removeErrorHandlerRestTemplate(){
		restTemplate.setErrorHandler(new ResponseErrorHandler() {
			
			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
				// TODO Auto-generated method stub
				
			}
		});
	}
	@Async
	public Future<University> createUniversity(String uniId) {		
		JSONObject json=new JSONObject();
		json.put("uniId", uniId);
		String result = restTemplate.postForObject(urlEndpoint, json,String.class);				
		return new AsyncResult<University>(new Gson().fromJson(result,University.class));
	}
	
	private String toJson(Object o){
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(o);
	}

	public Future<List<Song>> getAllSongs(String uniId) {
		Map<String,String> params=new HashMap<String,String>();
		params.put("uniId",uniId);
		String result = restTemplate.getForObject(urlEndpoint+"{uniId}/songs/", String.class,params);
		Gson gson=new GsonBuilder().create();
		List<Song> songs=Arrays.asList(gson.fromJson(result,Song[].class));
		return new AsyncResult<List<Song>>(songs);
	}

	public void addSongsInUniversity(List<Song> songs, String uniId) {
		Map<String,String> params=new HashMap<String,String>();
		params.put("uniId",uniId);		
		restTemplate.put(urlEndpoint+"{uniId}/songs/", toJson(songs),params);				
		
	}
	
	
}
