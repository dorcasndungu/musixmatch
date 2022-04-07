
package com.example.rhyme.models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class trackList {

    @SerializedName("track_list")
    @Expose
    private List<Track> trackList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public trackList() {
    }

    /**
     * 
     * @param trackList
     */
    public trackList(List<Track> trackList) {
        super();
        this.trackList = trackList;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

}
