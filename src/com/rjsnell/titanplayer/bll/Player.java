package com.rjsnell.titanplayer.bll;

import javafx.scene.media.*;
import java.io.*;
import javafx.embed.swing.JFXPanel;

public class Player {
    
    JFXPanel fxPanel = new JFXPanel(); //Object required for JavaFX components
    private Playlist workingPlaylist;
    private Song workingSong;
    private Media mediaResource;
    private MediaPlayer mediaController;
    
    public Player() {}
    
    public Song getWorkingSong() {
        return workingSong;
    }
    
    public MediaPlayer.Status getMediaControllerStatus() {
        return mediaController.getStatus();
    }
    
    public void setWorkingPlaylist(Playlist playlistToAdd) {
        workingPlaylist = playlistToAdd;
    }
    
    public void loadNextSongFromList () {
        workingSong = workingPlaylist.nextSongInList();
        mediaResource = new Media(new File(workingSong.getFileLocation()).toURI().toString());
        mediaController = new MediaPlayer(mediaResource);        
    }

    public void playWorkingSong() {
        mediaController.play();   
    }
    
    public void stopWorkingSong() {
        mediaController.stop();
    }
    

    
}
