package com.pro1.vukn.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity {
    Button btnRed, btnYellow, btnOrange, btnGreen, btnBlue, btnBlack, btnPurple, btnPink, btnWhite, btnGray, btnBrown;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        innitView();
        appEvent();
    }

    private void appEvent() {
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_yellow);
            }
        });
        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_white);
            }
        });
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_red);
            }
        });
        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_purple);
            }
        });
        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_black);
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_blue);
            }
        });
        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_brown);
            }
        });
        btnGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_gray);
            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_orange);
            }
        });
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_pink);
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_green);
            }
        });
    }

    private void innitView() {
        btnBlack = (Button) findViewById(R.id.btnBlack);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnBrown = (Button) findViewById(R.id.btnBrown);
        btnGray = (Button) findViewById(R.id.btnGray);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnOrange = (Button) findViewById(R.id.btnOrange);
        btnPink = (Button) findViewById(R.id.btnPink);
        btnPurple = (Button) findViewById(R.id.btnPurple);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnWhite = (Button) findViewById(R.id.btnWhite);
        btnYellow = (Button) findViewById(R.id.btnYellow);
    }

    private void playAudio(int sound) {
        if (audio != null && audio.isPlaying()) {
            audio.reset();
        }
        audio = MediaPlayer.create(ColorActivity.this, sound);
        audio.start();
    }
}
