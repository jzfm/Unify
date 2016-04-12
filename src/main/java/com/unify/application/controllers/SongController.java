package com.unify.application.controllers;

import java.util.List;

import com.unify.domain.Song;
import com.unify.domain.SongsStore;
import com.unify.domain.University;
import com.unify.utilities.InvalidActionException;
import com.unify.utilities.InvalidParamException;
import com.unify.utilities.NoSongToPlayException;
import com.unify.utilities.ResourceNotFoundException;

public class SongController {

	private UniversityController uniController=new UniversityController();
	
	
	public Song getCurrentSong(String uniId) throws NoSongToPlayException, InvalidParamException, ResourceNotFoundException {
		University uni=uniController.getUniversity(uniId);
		return uni.getCurrentSong();
		
	}

	public synchronized void setCurrentSong(String uniId, Song currentSong) throws InvalidParamException, ResourceNotFoundException, InvalidActionException{
		University uni=uniController.getUniversity(uniId);
		checkValidSong(currentSong,uni);
		uni.setCurrentSong(currentSong);
		uniController.saveUniversity(uni);
		
	}

	private void checkValidSong(Song currentSong,University university) throws InvalidParamException, ResourceNotFoundException {
		if(currentSong==null) throw new InvalidParamException();
		if(!university.containsSong(currentSong)) throw new ResourceNotFoundException();
	}

	public void addSongsToUniversity(String uniId, List<Song> songs) throws InvalidParamException, ResourceNotFoundException {
		University uni=uniController.getUniversity(uniId);
		uni.addAllSongs(songs);
		uniController.saveUniversity(uni);		
	}

	public List<Song> getAllSongs(String uniId) throws InvalidParamException, ResourceNotFoundException {
		University uni=uniController.getUniversity(uniId);
		return uni.getAllSongs();
	}
}
