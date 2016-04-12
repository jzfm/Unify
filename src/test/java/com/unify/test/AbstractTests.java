package com.unify.test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unify.application.api.UnifyApplication;
import com.unify.domain.Song;
import com.unify.domain.University;
import com.unify.persistence.DatastoreManager;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UnifyApplication.class)
@WebIntegrationTest
@EnableAsync
public class AbstractTests {
	
	public AbstractTests(){
		
	}
	
	protected LookupServiceTesting service = new LookupServiceTesting();
	
	protected void clearBBDD(){
		DatastoreManager.getInstance().clearBBDD();
	}

	protected University tryToCreateUniversity(String uniId) throws InterruptedException, ExecutionException {	
		
		Future<University>result=service.createUniversity(uniId);
		return result.get(); 
	}
		
	protected Song searchForCurrentSong(String uniId) throws InterruptedException, ExecutionException {	
		return service.getCurrentSong(uniId).get();
	}
		
	protected void playSong(University uni, Song song) {
		service.playSong(uni.getId(),song);
	}

	protected List<Song> getAllSongsUniversity(String uniId) throws InterruptedException, ExecutionException {
		Future<List<Song>> result=service.getAllSongs(uniId);
		return result.get();
	}
}

