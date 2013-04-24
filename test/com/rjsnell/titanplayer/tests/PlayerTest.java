package com.rjsnell.titanplayer.tests;

import com.rjsnell.titanplayer.bll.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javafx.scene.media.*;

public class PlayerTest {
    
        Playlist testPlaylist;
        Player testPlayer;
        Song furElise = new Song("Fur Elise", "Beethoven", "test/com/rjsnell/titanplayer/tests/FurElise.mp3");
        Song heronBlue = new Song("Heron Blue", "Sun Kil Moon", "test/com/rjsnell/titanplayer/tests/HeronBlue.mp3");
        Song rightInTheNight = new Song("Right In The Night", "Jam & Spoon", "test/com/rjsnell/titanplayer/tests/RightInTheNight.mp3");

    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testPlaylist = new Playlist("Test Playlist");
        testPlaylist.addSong(furElise);
        testPlaylist.addSong(heronBlue);
        testPlaylist.addSong(rightInTheNight);
        testPlayer = new Player();
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void loadNextSongFromListTest() {
        testPlayer.setWorkingPlaylist(testPlaylist);
        testPlayer.loadNextSongFromList();
        assertEquals("Fur Elise", testPlayer.getWorkingSong().getTitle());
    }
    
    @Test
    public void skipSongTest() {   
        testPlayer.setWorkingPlaylist(testPlaylist);
        testPlayer.loadNextSongFromList(); // Loads first song in the list as the working song
        testPlayer.loadNextSongFromList(); // Replaces working song with second song in list essentially skipping the first
        assertEquals("Heron Blue", testPlayer.getWorkingSong().getTitle()); // Checks working song is now second song in playlist
    }
    
    @Test
    public void playSongTest() {
        testPlayer.setWorkingPlaylist(testPlaylist);
        testPlayer.loadNextSongFromList();
        // Pause to allow MediaPlayer object to complete startup
        try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        testPlayer.playWorkingSong();
        // Pause to allow MediaPlayer object to play
        try {Thread.sleep(500);} catch (InterruptedException ex) {}
        assertEquals(MediaPlayer.Status.PLAYING, testPlayer.getMediaControllerStatus());
    }
    
    @Test
    public void stopSongTest() {
        testPlayer.setWorkingPlaylist(testPlaylist);
        testPlayer.loadNextSongFromList();
        // Pause to allow MediaPlayer object to complete startup
        try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        testPlayer.playWorkingSong();
        testPlayer.stopWorkingSong();
        // Pause to allow MediaPlayer object to play and stop
        try {Thread.sleep(500);} catch (InterruptedException ex) {}
        assertEquals(MediaPlayer.Status.STOPPED, testPlayer.getMediaControllerStatus());
    }
}