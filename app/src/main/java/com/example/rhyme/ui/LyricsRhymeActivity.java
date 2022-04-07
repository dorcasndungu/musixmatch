package com.example.rhyme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rhyme.R;
import com.example.rhyme.network.tracksApi;
import com.example.rhyme.network.tracksClient;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LyricsRhymeActivity extends AppCompatActivity {
    @BindView(R.id.lyricsText)
    TextView mLyricsText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyricsactivity);


        Intent intent = getIntent();
        String singerName= intent.getStringExtra("singerName");
        String trackName = intent.getStringExtra("trackName");


//        tracksApi client = tracksClient.getClient();
//        Call<lyricResponse> call = client.getLyrics_body(trackName,singerName);
//        call.enqueue(new Callback<lyricResponse>() {
//            @Override
//            public void onResponse(Call<lyricResponse> call, Response<lyricResponse> response) {
//                if (response.isSuccessful()) {
//                    assert response.body() != null;
//                    String lyrics= response.body().getLyrics().getLyricsBody();
//                    mLyricsText.setText(lyrics);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<lyricResponse> call, Throwable t) {
//                Log.e("Error Message", "onFailure: ",t );
//            }
//
//
//
//        });
    }

}