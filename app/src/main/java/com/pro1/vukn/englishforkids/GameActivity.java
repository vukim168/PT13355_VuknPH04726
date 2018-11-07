package com.pro1.vukn.englishforkids;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pro1.vukn.englishforkids.model.Game;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {
    Button btnDapAnA, btnDapAnB, btnDapAnC, btnDapAnD;
    ImageView imvCauHoi;
    TextView tvCauHoi, tvSoCauHoi;
    String dapAnDung = "";
    ArrayList<Game> arrGame;
    int i = 0;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initView();
        arrGame = new ArrayList<Game>();
        addArrayList();
        setView();
        addEvent();
    }

    private void addEvent() {
        btnDapAnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnDapAnA.getText().toString() == dapAnDung.toString()) {
                    diaLogTrue();
                    if (i < arrGame.size() - 1) {
                        i++;
                        setView();
                    }
                } else {
                    diaLogFail();
                }
            }
        });
        btnDapAnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnDapAnB.getText().toString() == dapAnDung.toString()) {
                    diaLogTrue();
                    if (i < arrGame.size() - 1) {
                        i++;
                        setView();
                    }
                } else {
                    diaLogFail();
                }
            }
        });
        btnDapAnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnDapAnC.getText().toString() == dapAnDung.toString()) {
                    diaLogTrue();
                    if (i < arrGame.size() - 1) {
                        i++;
                        setView();
                    }
                } else {
                    diaLogFail();
                }
            }
        });
        btnDapAnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnDapAnD.getText().toString() == dapAnDung.toString()) {
                    diaLogTrue();
                    if (i < arrGame.size() - 1) {
                        i++;
                        setView();
                    }
                } else {
                    diaLogFail();
                }
            }
        });
    }

    private void diaLogDone() {
        final Dialog dialog = new Dialog(GameActivity.this);
        dialog.setContentView(R.layout.dialog_done);
        dialog.show();
        Button btnBacktoHome = dialog.findViewById(R.id.btnBacktoHome);
        btnBacktoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity.this, HomeActivity.class));
            }
        });
    }

    private void diaLogTrue() {
        final Dialog dialog = new Dialog(GameActivity.this);
        playAudio(R.raw.au_dung);
        dialog.setContentView(R.layout.dialog_true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
    }

    private void diaLogFail() {
        playAudio(R.raw.au_falseee);
        final Dialog dialog = new Dialog(GameActivity.this);
        dialog.setContentView(R.layout.dialog_fail);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
    }

    private void playAudio(int sound) {


        if (audio != null && audio.isPlaying()) {
            audio.reset();
        }
        audio = MediaPlayer.create(GameActivity.this, sound);
        audio.start();
    }

    private void addArrayList() {
        arrGame.add(new Game(R.drawable.car, "What is this?", "Bike", "Car", "Bus", "Apple", "Car"));
        arrGame.add(new Game(R.drawable.bike, "What is this?", "Plane", "Ship", "Bike", "Truck", "Bike"));
        arrGame.add(new Game(R.drawable.apple, "What is this fruit?", "Apple", "Orange", "Cherry", "Strawberry", "Apple"));
        arrGame.add(new Game(R.drawable.dog, "What is this animal?", "Duck", "Chicken", "Lion", "Dog", "Dog"));
        arrGame.add(new Game(R.drawable.lemonn, "What is this fruit?", "Grapes", "Watermelon", "Lemon", "Banana", "Lemon"));
        arrGame.add(new Game(R.drawable.train, "What is this?", "Bike", "Car", "Bus", "Train", "Train"));
        arrGame.add(new Game(R.drawable.truck, "What is this?", "Truck", "Ship", "Bike", "Car", "Truck"));
        arrGame.add(new Game(R.drawable.pineapple, "What is this fruit?", "Apple", "Pineapple", "Cherry", "Strawberry", "Pineapple"));
        arrGame.add(new Game(R.drawable.elephant, "What is this animal?", "Elephant", "Chicken", "Lion", "Dog", "Elephant"));
        arrGame.add(new Game(R.drawable.pear, "What is this fruit?", "Grapes", "Watermelon", "Lemon", "Pear", "Pear"));

    }

    private void initView() {
        tvCauHoi = (TextView) findViewById(R.id.tvCauHoi);
        tvSoCauHoi = (TextView) findViewById(R.id.tvSoCauHoi);
        btnDapAnA = (Button) findViewById(R.id.btnDapAnA);
        btnDapAnB = (Button) findViewById(R.id.btnDapAnB);
        btnDapAnC = (Button) findViewById(R.id.btnDapAnC);
        btnDapAnD = (Button) findViewById(R.id.btnDapAnD);
        imvCauHoi = (ImageView) findViewById(R.id.imvCauHoi);
    }

    public void setView() {
        int soCauHoi = i + 1;
        imvCauHoi.setImageResource(arrGame.get(i).getId());
        tvCauHoi.setText(arrGame.get(i).getCauHoi());
        btnDapAnA.setText(arrGame.get(i).getA().toString());
        btnDapAnB.setText(arrGame.get(i).getB().toString());
        btnDapAnC.setText(arrGame.get(i).getC().toString());
        btnDapAnD.setText(arrGame.get(i).getD().toString());
        dapAnDung = arrGame.get(i).getDapanDung().toString();
        tvSoCauHoi.setText(soCauHoi + "");
    }
}
