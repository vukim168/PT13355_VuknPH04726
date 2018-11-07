package com.pro1.vukn.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class TransportActivity extends AppCompatActivity {
    ImageView imvBike, imvBus, imvCar, imvMotobike, imvTruck, imvTrain, imvPlane, imvHelicoter, imvShip;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        initView();
        addEvent();
    }

    private void addEvent() {
        imvBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_bike);
            }
        });
        imvBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_bus);
            }
        });
        imvCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_car);
            }
        });
        imvMotobike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_cruisebike);
            }
        });
        imvTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_truck);
            }
        });
        imvTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_train);
            }
        });
        imvPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_plane);
            }
        });
        imvHelicoter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_helicopter);
            }
        });
        imvShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_ship);
            }
        });
    }

    private void initView() {
        imvBike = (ImageView) findViewById(R.id.imvBike);
        imvBus = (ImageView) findViewById(R.id.imvBus);
        imvCar = (ImageView) findViewById(R.id.imvCar);
        imvMotobike = (ImageView) findViewById(R.id.imvMotobike);
        imvTruck = (ImageView) findViewById(R.id.imvTruck);
        imvTrain = (ImageView) findViewById(R.id.imvTrain);
        imvPlane = (ImageView) findViewById(R.id.imvPlane);
        imvHelicoter = (ImageView) findViewById(R.id.imvHelicoter);
        imvShip = (ImageView) findViewById(R.id.imvShip);
    }

    private void playAudio(int sound) {

        if (audio != null && audio.isPlaying()) {
            audio.reset();
        }
        audio = MediaPlayer.create(TransportActivity.this, sound);
        audio.start();
    }
}
