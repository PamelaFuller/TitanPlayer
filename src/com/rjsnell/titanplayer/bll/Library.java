/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsnell.titanplayer.bll;

import java.util.*;

public class Library {
    
    private ArrayList<Song> songs;
    
    public Library() {
	songs = new ArrayList<>();
    }
    
    public Song getSongByIndex(int index) {
        return songs.get(index);
    }
    
   public int songCount() {
	return songs.size();
    }

    public void addSong(Song songToAdd) {
	songs.add(songToAdd);
    }
    
    public void removeSong(Song songToRemove) {
	songs.remove(songToRemove);
    }
    
    public void sortLibraryByTitle() {
            Collections.sort(songs, new SongTitleComparator());
    }

    public void sortLibraryByArtist() {
            Collections.sort(songs, new SongArtistComparator());
    }
    
    

}
