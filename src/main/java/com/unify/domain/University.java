package com.unify.domain;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.springframework.context.annotation.Lazy;

import com.google.gson.annotations.Expose;
import com.unify.utilities.InvalidActionException;
import com.unify.utilities.InvalidParamException;
import com.unify.utilities.NoSongToPlayException;

@Entity("universities")
public class University {

	
	@Id
	@Expose
	private String id;
	@Embedded
	@Expose
	private Song currentSong;	
	
	@Reference
	@Lazy
	private SongsStore songsStore=new SongsStore();
	
	public University(){
		
	}
	
	public University(String uniId) {
		this.id=uniId;
	}

	public void setCurrentSong(Song song) throws InvalidParamException, InvalidActionException{
		if(song==null) throw new InvalidParamException();
		if(currentSong!=null && currentSong.hasTimeLeft()) throw new InvalidActionException();
		this.currentSong=song;
		currentSong.nowPlaying();		
	}
	public String getId() {
		return id;
	}

	public Song getCurrentSong() throws NoSongToPlayException {
		if(currentSong==null) throw new NoSongToPlayException();
		if(!currentSong.hasTimeLeft()) throw new NoSongToPlayException();
		return currentSong;
	}
	
	public boolean containsSong(Song song) {
		return songsStore.containsSong(song);
	}
	public void addAllSongs(List<Song> songs) throws InvalidParamException {
		songsStore.addAllSongs(songs);
	}
	public List<Song> getAllSongs() {
		return songsStore.getAllSongs();
	}

	public SongsStore getSongsStore() {
		return songsStore;
	}

}
