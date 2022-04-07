
package com.example.rhyme.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PrimaryGenres {

    @SerializedName("music_genre_list")
    @Expose
    private List<MusicGenre> musicGenreList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrimaryGenres() {
    }

    /**
     * 
     * @param musicGenreList
     */
    public PrimaryGenres(List<MusicGenre> musicGenreList) {
        super();
        this.musicGenreList = musicGenreList;
    }

    public List<MusicGenre> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<MusicGenre> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
