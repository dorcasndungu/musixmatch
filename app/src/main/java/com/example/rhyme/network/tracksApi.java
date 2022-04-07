package com.example.rhyme.network;

import com.example.rhyme.models.TopTracksResponse;
import com.example.rhyme.models.trackList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface tracksApi {

    @GET("chart.tracks.get")
    Call<TopTracksResponse> getTopTracks(
            @Query("apikey") String key,
            @Query("chart_name") String chart_name,
            @Query("page") int page,
            @Query("page_size") int page_size,
            @Query("country") String country,
            @Query("_f_has_lyrics") int f_has_lyrics

    );

}
//?chart_name=hot&page=1&page_size=50&country=xw&f_has_lyrics=1