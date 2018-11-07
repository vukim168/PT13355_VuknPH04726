package com.pro1.vukn.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NumberActivity extends AppCompatActivity {
    ImageView imvNum1, imvNum2, imvNum3, imvNum4, imvNum5, imvNum6, imvNum7, imvNum8, imvNum9, imvNum10;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        initView();
        addEvent();
    }

    private void addEvent() {
        imvNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_1);
            }
        });
        imvNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_2);
            }
        });
        imvNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_3);
            }
        });
        imvNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_4);
            }
        });
        imvNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_5);
            }
        });
        imvNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_6);
            }
        });
        imvNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_7);
            }
        });
        imvNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_8);
            }
        });
        imvNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_9);
            }
        });
        imvNum10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_10);
            }
        });
    }

    private void initView() {
        imvNum1 = (ImageView) findViewById(R.id.imvNum1);
        imvNum2 = (ImageView) findViewById(R.id.imvNum2);
        imvNum3 = (ImageView) findViewById(R.id.imvNum3);
        imvNum4 = (ImageView) findViewById(R.id.imvNum4);
        imvNum5 = (ImageView) findViewById(R.id.imvNum5);
        imvNum6 = (ImageView) findViewById(R.id.imvNum6);
        imvNum7 = (ImageView) findViewById(R.id.imvNum7);
        imvNum8 = (ImageView) findViewById(R.id.imvNum8);
        imvNum9 = (ImageView) findViewById(R.id.imvNum9);
        imvNum10 = (ImageView) findViewById(R.id.imvNum10);
    }

    private void playAudio(int sound) {


        if (audio != null && audio.isPlaying()) {
            audio.reset();
        }
        audio = MediaPlayer.create(NumberActivity.this, sound);
        audio.start();
    }
}
