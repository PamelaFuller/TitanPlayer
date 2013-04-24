package com.rjsnell.titanplayer.tests;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.rjsnell.titanplayer.bll.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Rich
 */
public class LibraryTests {
    
        Library testLibrary;
        Song furElise = new Song("Fur Elise", "Beethoven", "test/com/rjsnell/titanplayer/tests/FurElise.mp3");
        Song heronBlue = new Song("Heron Blue", "Sun Kil Moon", "test/com/rjsnell/titanplayer/tests/HeronBlue.mp3");
        Song rightInTheNight = new Song("Right In The Night", "Jam & Spoon", "test/com/rjsnell/titanplayer/tests/RightInTheNight.mp3");
    
    public LibraryTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testLibrary = new Library();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void emptyLibraryTest() {
	assertEquals(0, testLibrary.songCount());
    }
    
    @Test
    public void addSongTest() {
	testLibrary.addSong(furElise);
	testLibrary.addSong(heronBlue);
	assertEquals(2, testLibrary.songCount());	
    }
    
    @Test
    public void removeSongTest() {
	testLibrary.addSong(furElise);
	testLibrary.addSong(heronBlue);
	testLibrary.removeSong(furElise);
	assertEquals(1, testLibrary.songCount());
    }
    
    @Test
    public void sortLibraryByTitleTest() {
        testLibrary.addSong(heronBlue);
        testLibrary.addSong(rightInTheNight);
	testLibrary.addSong(furElise);
        
        testLibrary.sortLibraryByTitle();
        assertEquals("Fur Elise", testLibrary.getSongByIndex(0).getTitle());
        assertEquals("Heron Blue", testLibrary.getSongByIndex(1).getTitle());
        assertEquals("Right In The Night", testLibrary.getSongByIndex(2).getTitle());
    }
    
    @Test
    public void sortLibraryByArtistTest() {
        testLibrary.addSong(heronBlue);
        testLibrary.addSong(rightInTheNight);
	testLibrary.addSong(furElise);
        
        testLibrary.sortLibraryByArtist();
        assertEquals("Fur Elise", testLibrary.getSongByIndex(0).getTitle());
        assertEquals("Right In The Night", testLibrary.getSongByIndex(1).getTitle());
        assertEquals("Heron Blue", testLibrary.getSongByIndex(2).getTitle());
    }
}