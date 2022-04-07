package com.example.rhyme.network;

import com.example.rhyme.models.Lyrics;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface lyricsApi {
    @GET("matcher.lyrics.get")
    Call<Lyrics> getLyrics_body(
            @Query("apikey") String key,
            @Query("q_track") String q_track,
            @Query("q_artist") String q_artist
);


}
