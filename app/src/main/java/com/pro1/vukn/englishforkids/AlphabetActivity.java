package com.pro1.vukn.englishforkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AlphabetActivity extends AppCompatActivity {
    ImageView imvA, imvB, imvC, imvD, imvE, imvF, imvG, imvH, imvI,
            imvJ, imvK, imvL, imvM, imvN, imvO, imvP, imvQ, imvR,
            imvS, imvT, imvU, imvV, imvW, imvX, imvY, imvZ;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        innitView();
        addEvent();
    }

    private void addEvent() {
        imvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_a);

            }
        });
        imvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_b);
            }
        });
        imvC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_c);
            }
        });
        imvD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_d);
            }
        });
        imvE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_e);
            }
        });
        imvF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_f);
            }
        });
        imvG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_g);
            }
        });
        imvH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_h);
            }
        });
        imvI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_i);
            }
        });
        imvJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_j);
            }
        });
        imvK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_k);
            }
        });
        imvL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_l);
            }
        });
        imvM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_m);
            }
        });
        imvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_n);
            }
        });
        imvO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_o);
            }
        });
        imvP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_p);
            }
        });
        imvQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_q);
            }
        });
        imvR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_r);
            }
        });
        imvS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_s);
            }
        });
        imvT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_t);
            }
        });
        imvU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_u);
            }
        });
        imvV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_v);
            }
        });
        imvW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_w);
            }
        });
        imvX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_x);
            }
        });
        imvY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_y);
            }
        });
        imvZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(R.raw.au_y);
            }
        });

    }

    private void playAudio(int sound) {
        if(audio != null && audio.isPlaying()){
            audio.reset();
        }
        audio = MediaPlayer.create(AlphabetActivity.this, sound);
        audio.start();
    }

    private void innitView() {
        imvA = (ImageView) findViewById(R.id.imvA);
        imvB = (ImageView) findViewById(R.id.imvB);
        imvC = (ImageView) findViewById(R.id.imvC);
        imvD = (ImageView) findViewById(R.id.imvD);
        imvE = (ImageView) findViewById(R.id.imvE);
        imvF = (ImageView) findViewById(R.id.imvF);
        imvG = (ImageView) findViewById(R.id.imvG);
        imvH = (ImageView) findViewById(R.id.imvH);
        imvI = (ImageView) findViewById(R.id.imvI);
        imvJ = (ImageView) findViewById(R.id.imvJ);
        imvK = (ImageView) findViewById(R.id.imvK);
        imvL = (ImageView) findViewById(R.id.imvL);
        imvM = (ImageView) findViewById(R.id.imvM);
        imvN = (ImageView) findViewById(R.id.imvN);
        imvO = (ImageView) findViewById(R.id.imvO);
        imvP = (ImageView) findViewById(R.id.imvP);
        imvQ = (ImageView) findViewById(R.id.imvQ);
        imvR = (ImageView) findViewById(R.id.imvR);
        imvS = (ImageView) findViewById(R.id.imvS);
        imvT = (ImageView) findViewById(R.id.imvT);
        imvU = (ImageView) findViewById(R.id.imvU);
        imvV = (ImageView) findViewById(R.id.imvV);
        imvW = (ImageView) findViewById(R.id.imvW);
        imvX = (ImageView) findViewById(R.id.imvX);
        imvY = (ImageView) findViewById(R.id.imvY);
        imvZ = (ImageView) findViewById(R.id.imvZ);
    }
}
