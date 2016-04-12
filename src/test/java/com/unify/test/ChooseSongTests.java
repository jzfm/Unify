package com.unify.test;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import com.unify.domain.Song;
import com.unify.domain.University;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChooseSongTests extends AbstractTests {
	// FEATURE: As a user, when there is no current song in the university, I
	// want to choose a new song so all other users can listen to it.

	public ChooseSongTests() {
		super();
	}

	private University university;

	@Given("^\"([^\"]*)\" isn't playing any song$")
	public void isn_t_playing_any_song(String uniId) throws Throwable {
		clearBBDD();

		university = tryToCreateUniversity(uniId);
	}

	@Given("^have these songs on its store:$")
	public void have_these_songs_on_its_store(List<Song> songs) throws Throwable {

		service.addSongsInUniversity(songs, university.getId());
	}

	private List<Song> allSongs;

	@When("^user searches for all songs of university \"([^\"]*)\"$")
	public void user_searches_for_all_songs_of_university(String uniId) throws Throwable {
		allSongs = getAllSongsUniversity(uniId);
	}


	@Then("^will return next songs:$")
	public void will_return_next_songs(List<Song> songs) throws Throwable {
		for (Song s : songs) {
			assertThat("Error on getAllSongs", allSongs.contains(s));
		}
	}

	
	//SCENARIO 2
	

	@Given("^that \"([^\"]*)\" is not playing any song$")
	public void that_is_not_playing_any_song(String uniId) throws Throwable {
		clearBBDD();

		university = tryToCreateUniversity(uniId);

	}

	@Given("^has this list of songs:$")
	public void has_list_of_songs(List<Song> songs) throws Throwable {
		service.addSongsInUniversity(songs, university.getId());
	}


	@When("^user selects:$")
	public void user_selects(List<Song> songs) throws Throwable {
		playSong(university, songs.get(0));
	}

	@Then("^\"([^\"]*)\" must be playing:$")
	public void must_be_playing(String uniId, List<Song> songs) throws Throwable {
		Song currentSong=searchForCurrentSong(uniId);
		assertThat("Incorrect song playing", songs.get(0).equals(currentSong));
		
		clearBBDD();
	}

}
