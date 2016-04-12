package com.unify.domain;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.unify.utilities.InvalidParamException;

@Entity("songsStores")
public class SongsStore {

	@Id
	private ObjectId id=new ObjectId();
	
	@Embedded
	private List<Song> allSongs=new ArrayList<Song>();
	
	public SongsStore(){
		
	}
	
	public boolean containsSong(Song song){
		return allSongs.contains(song);
	}
	
	public void addSong(Song song) throws InvalidParamException{
		if(song==null) throw new InvalidParamException();
		allSongs.add(song);
	}
	
	public void addAllSongs(List<Song> songs) throws InvalidParamException{
		if(songs==null) throw new InvalidParamException();
		allSongs.addAll(songs);
	}

	public List<Song> getAllSongs() {
		return new ArrayList<Song>(allSongs);
	}
}
