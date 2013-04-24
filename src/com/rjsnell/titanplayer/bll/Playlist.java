package com.rjsnell.titanplayer.bll;

import java.util.*;

public class Playlist {
    
    private ArrayList<Song> songs;
    
    private String playlistName;
    private int position = -1;
    
    public Playlist(String name) {
	songs = new ArrayList<>();
	this.playlistName = name;
    }
    
    public String getPlaylistName() {
	return playlistName;
    }
    
    public int songCount() {
	return songs.size();
    }
    
   public void addSong(Song songToAdd) {
	songs.add(songToAdd);
    }
   
   public Song nextSongInList() {
       position ++;
       return songs.get(position);
   }
    
}