package com.rjsnell.titanplayer.bll;

public class Song {
    
    private String artist;
    private String title;
    private String fileLocation;
    
    public Song(String title, String artist, String fileLocation) {
        this.artist = artist;
        this.title = title;
        this.fileLocation = fileLocation;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getFileLocation() {
        return fileLocation;
    }
}
