package com.unify.application.api;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.unify.application.controllers.SongController;
import com.unify.domain.Song;
import com.unify.utilities.InvalidActionException;
import com.unify.utilities.InvalidParamException;
import com.unify.utilities.NoSongToPlayException;
import com.unify.utilities.ResourceNotFoundException;
import com.unify.utilities.UniversityAlreadyExistsException;


@RestController
@RequestMapping("/universities/{uniId}/songs")
public class SongRestController {

	@RequestMapping(value="/current",method=RequestMethod.GET)	
	public String getCurrentSong(@PathVariable String uniId) throws UniversityAlreadyExistsException, NoSongToPlayException, InvalidParamException, ResourceNotFoundException{		
		
		Song song=new SongController().getCurrentSong(uniId);
		
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(song);
	}
	
	@RequestMapping(value="/current",method=RequestMethod.PUT)
	public void playSong(@PathVariable String uniId,@RequestBody String song) throws InvalidParamException, ResourceNotFoundException, JsonSyntaxException, InvalidActionException{				
		new SongController().setCurrentSong(uniId, new Gson().fromJson(song,Song.class));
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void addSongsInUniversity(@PathVariable String uniId,@RequestBody String allSong) throws InvalidParamException, ResourceNotFoundException{				
		
		JsonParser parser = new JsonParser();
		JsonArray jArray = parser.parse(allSong).getAsJsonArray();
		List<Song> list = new ArrayList<Song>();
		Gson gson = new GsonBuilder().create();
		for (JsonElement obj : jArray) {
			Song item = gson.fromJson(obj, Song.class);
			list.add(item);
		}
		
		new SongController().addSongsToUniversity(uniId, list);
	}
	
	@RequestMapping(method=RequestMethod.GET)	
	public String getAllSongs(@PathVariable String uniId) throws UniversityAlreadyExistsException, NoSongToPlayException, InvalidParamException, ResourceNotFoundException{		
		
		List<Song> songs=new SongController().getAllSongs(uniId);
		
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(songs);
	}
	
}
