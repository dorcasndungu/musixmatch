
package com.example.rhyme.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LyricsResponse {

    @SerializedName("message")
    @Expose
    private Message message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LyricsResponse() {
    }

    /**
     * 
     * @param message
     */
    public LyricsResponse(Message message) {
        super();
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
