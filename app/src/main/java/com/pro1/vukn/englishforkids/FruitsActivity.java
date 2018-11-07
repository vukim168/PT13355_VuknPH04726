package com.pro1.vukn.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FruitsActivity extends AppCompatActivity {
    private MediaPlayer audio;
    ImageView imvApple, imvOrange, imvPineapple, imvBanana, imvCherry,
            imvGrapes, imvTomato, imvStrawberry, imvWatermelon, imvLemon, imvPear, imvCoconut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        initView();
        addEvent();
    }

    private void addEvent() {
        imvApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_apple);
            }
        });
        imvOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_orange);
            }
        });
        imvPineapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_pineapple);
            }
        });
        imvBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_banana);
            }
        });
        imvCherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_cherry);
            }
        });
        imvGrapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_grapes);
            }
        });
        imvTomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_tomato);
            }
        });
        imvStrawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_strawberry);
            }
        });
        imvWatermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_watermelon);
            }
        });
        imvLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_lemon);
            }
        });
        imvPear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_paer);
            }
        });
        imvCoconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_coconut);
            }
        });

    }

    private void initView() {
        imvApple = (ImageView) findViewById(R.id.imvApple);
        imvOrange = (ImageView) findViewById(R.id.imvOrange);
        imvPineapple = (ImageView) findViewById(R.id.imvPineapple);
        imvBanana = (ImageView) findViewById(R.id.imvBanana);
        imvCherry = (ImageView) findViewById(R.id.imvCherry);
        imvGrapes = (ImageView) findViewById(R.id.imvGrapes);
        imvTomato = (ImageView) findViewById(R.id.imvTomato);
        imvStrawberry = (ImageView) findViewById(R.id.imvStrawberry);
        imvWatermelon = (ImageView) findViewById(R.id.imvWatermelon);
        imvLemon = (ImageView) findViewById(R.id.imvLemon);
        imvPear = (ImageView) findViewById(R.id.imvPear);
        imvCoconut = (ImageView) findViewById(R.id.imvCoconut);
    }


    private void playAudio(int sound) {

        if (audio != null && audio.isPlaying()) {
            audio.reset();
        }
        audio = MediaPlayer.create(FruitsActivity.this, sound);
        audio.start();
    }
}
