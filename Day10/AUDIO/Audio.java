package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Audio extends AppCompatActivity implements View.OnClickListener {

    Button btnStart,btnPause,btnStop;

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        btnStart=findViewById(R.id.btnStart);
        btnPause=findViewById(R.id.btnPause);
        btnStop=findViewById(R.id.btnStop);

        mediaPlayer = MediaPlayer.create(this,R.raw.sanamre);

        btnStart.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnStart:
                mediaPlayer.start();
                break;

            case R.id.btnPause:
                mediaPlayer.pause();
                break;

            case R.id.btnStop:
                mediaPlayer.stop();
                break;

        }

    }
}