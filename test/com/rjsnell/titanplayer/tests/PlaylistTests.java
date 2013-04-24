package com.rjsnell.titanplayer.tests;

import com.rjsnell.titanplayer.bll.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PlaylistTests {
    
        Playlist testPlaylist;
        Song furElise = new Song("Fur Elise", "Beethoven", "test/com/rjsnell/titanplayer/tests/FurElise.mp3");
        Song heronBlue = new Song("Heron Blue", "Sun Kil Moon", "test/com/rjsnell/titanplayer/tests/HeronBlue.mp3");
        Song rightInTheNight = new Song("Right In The Night", "Jam & Spoon", "test/com/rjsnell/titanplayer/tests/RightInTheNight.mp3");

    
    public PlaylistTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testPlaylist = new Playlist("New Playlist");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void emptyPlaylistTest() {
	assertEquals(0, testPlaylist.songCount());
    }

    @Test
    public void playlistNameTest() {
	assertEquals("New Playlist", testPlaylist.getPlaylistName());
    }
    
    @Test
    public void addSongTest() {
	testPlaylist.addSong(furElise);
	testPlaylist.addSong(heronBlue);
	assertEquals(2, testPlaylist.songCount());	
    }
    
    @Test
    public void nextSongInListTest() {
        testPlaylist.addSong(furElise);
	testPlaylist.addSong(heronBlue);
        testPlaylist.nextSongInList();
        Song nextSong = testPlaylist.nextSongInList();
	assertEquals("Heron Blue", nextSong.getTitle());
    }
    
}