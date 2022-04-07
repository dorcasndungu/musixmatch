package com.example.rhyme.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.rhyme.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.idBtnLyrics)
    Button Lyrics;
    @BindView(R.id.songName)
    EditText mSongName;

    @BindView(R.id.singerName)
    EditText mSingerName;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Lyrics.setOnClickListener(this) ;

    }
    @Override
    public void onClick(View v) {
        if(v == Lyrics){
            String singerName = mSingerName.getText().toString();
            String songName=mSongName.getText().toString();
            Intent intent = new Intent(MainActivity.this, LyricsActivity.class);
            intent.putExtra("singerName", singerName);
            intent.putExtra("songName", songName);

            startActivity(intent);
        }

    }
}