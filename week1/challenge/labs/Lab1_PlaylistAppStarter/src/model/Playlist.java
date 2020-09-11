/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author ruslan
 */
public class Playlist {
    
private String  playlistName;
private String playlistAuthor;
private ArrayList <Track> playlistTracks;


// Default Constructor
public Playlist()
{
            
}

public Playlist(String playlistName, String playlistAuthor)
{
    this.playlistName   = playlistName;
    this.playlistAuthor = playlistAuthor;
            
}

public Playlist(String playlistName, String playlistAuthor, ArrayList <Track> playlistTracks)
{
    this.playlistName   = playlistName;
    this.playlistAuthor = playlistAuthor;
    this.playlistTracks = playlistTracks;
            
}

   /////////////////////////////////////////////////////////////////////////////
    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getPlaylistAuthor() {
        return playlistAuthor;
    }

    public void setPlaylistAuthor(String playlistAuthor) {
        this.playlistAuthor = playlistAuthor;
    }

    public ArrayList<Track> getPlaylistTracks() {
        return playlistTracks;
    }

    public void setPlaylistTracks(ArrayList<Track> playlistTracks) {
        this.playlistTracks = playlistTracks;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    private String getNumberedTracks() {
    String numberedTracks = "\n";
    int number = 1;
    for (Track track : this.playlistTracks) {
        numberedTracks += Integer.toString(number++) + ": " +
                          track.toString() + "\n";
    }
    return numberedTracks;
}
    
    public void addTrackToPlaylist(Track track) {
    this.playlistTracks.add(track);
}
    
    public void removeTrackFromPlaylist(int trackId) {
        Predicate<Track> trackPredicate = t-> t.getTrackId() == trackId;       
        this.playlistTracks.removeIf(trackPredicate);
    }



    
}
