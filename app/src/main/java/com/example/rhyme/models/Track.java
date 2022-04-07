
package com.example.rhyme.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Track {

    @SerializedName("track")
    @Expose
    private topTrack track;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }

    /**
     * 
     * @param track
     */
    public Track(topTrack track) {
        super();
        this.track = track;
    }

    public topTrack getTrack() {
        return track;
    }

    public void setTrack(topTrack track) {
        this.track = track;
    }

}
