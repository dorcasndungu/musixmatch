package com.example.rhyme.ui;

import static com.example.rhyme.constants.constants.mm_API_KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.rhyme.R;
import com.example.rhyme.models.Lyrics;
import com.example.rhyme.network.tracksApi;
import com.example.rhyme.network.tracksClient;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LyricsActivity extends AppCompatActivity {
    @BindView(R.id.lyricsText)
    TextView mLyricsText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyricsactivity);


        Intent intent = getIntent();
        String singerName= intent.getStringExtra("singerName");
        String trackName = intent.getStringExtra("trackName");


        tracksApi client = tracksClient.getClient();
        Call<Lyrics> call = client.getTopTracks();
        call.enqueue(new Callback<Lyrics>() {
            @Override
            public void onResponse(Call<Lyrics> call, Response<Lyrics> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    String lyrics= response.body().getLyricsBody();
                    mLyricsText.setText(lyrics);
                }
            }

            @Override
            public void onFailure(Call<Lyrics> call, Throwable t) {
                Log.e("Error Message", "onFailure: ",t );
            }



        });
    }

}