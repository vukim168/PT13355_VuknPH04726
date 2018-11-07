package com.pro1.vukn.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AnimalActivity extends AppCompatActivity {
    ImageView imvDog, imvCat, imvChicken, imvPig, imvDuck, imvCow,
            imvElephant, imvLion, imvMonkey, imvSheep, imvPenguin, imvZebra;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        initView();
        addEvent();
    }

    private void addEvent() {
        imvDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_dog);
            }
        });
        imvCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_cat);
            }
        });
        imvChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_chicken);
            }
        });
        imvPig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_pig);
            }
        });
        imvDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_duck);
            }
        });
        imvCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_cow);
            }
        });
        imvElephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_elephant);
            }
        });
        imvLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_lion);
            }
        });
        imvMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_monkey);
            }
        });
        imvSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_sheep);
            }
        });
        imvPenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_penguin);
            }
        });
        imvZebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_zebra);
            }
        });
    }

    private void initView() {
        imvDog = (ImageView) findViewById(R.id.imvDog);
        imvCat = (ImageView) findViewById(R.id.imvCat);
        imvChicken = (ImageView) findViewById(R.id.imvChicken);
        imvPig = (ImageView) findViewById(R.id.imvPig);
        imvDuck = (ImageView) findViewById(R.id.imvDuck);
        imvCow = (ImageView) findViewById(R.id.imvCow);
        imvElephant = (ImageView) findViewById(R.id.imvElephant);
        imvLion = (ImageView) findViewById(R.id.imvLion);
        imvMonkey = (ImageView) findViewById(R.id.imvMonkey);
        imvSheep = (ImageView) findViewById(R.id.imvSheep);
        imvPenguin = (ImageView) findViewById(R.id.imvPenguin);
        imvZebra = (ImageView) findViewById(R.id.imvZebra);
    }

    private void playAudio(int sound) {

        if (audio != null && audio.isPlaying()) {
            audio.reset();
        }
        audio = MediaPlayer.create(AnimalActivity.this, sound);
        audio.start();
    }
}
