package com.pro1.vukn.englishforkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {
    ImageView imvNumber, imvColor, imvAnimal, imvFruits, imvTransport;
    TextView tvTransport, tvAlphabet, tvNumber, tvColor, tvAnimal, tvFruits;
    ImageButton imvAlphabet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        innitView();
        addEvent();
    }

    private void addEvent() {
        imvAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, AlphabetActivity.class));

            }
        });
        tvAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, AlphabetActivity.class));
            }
        });
        imvNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, NumberActivity.class));
            }
        });
        tvNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, NumberActivity.class));
            }
        });
        // color
        imvColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, ColorActivity.class));
            }
        });
        tvColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, ColorActivity.class));

            }
        });
        //transport
        imvTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, TransportActivity.class));
            }
        });
        tvTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, TransportActivity.class));
            }
        });
        imvFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, FruitsActivity.class));
            }
        });
        tvFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, FruitsActivity.class));
            }
        });
        tvAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, AnimalActivity.class));
            }
        });
        imvAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this, AnimalActivity.class));
            }
        });
    }

    private void innitView() {
        imvAlphabet = (ImageButton) findViewById(R.id.imvAlphabet);
        imvNumber = (ImageView) findViewById(R.id.imvNumber);
        imvColor = (ImageView) findViewById(R.id.imvColor);
        imvFruits = (ImageView) findViewById(R.id.imvFruits);
        imvTransport = (ImageView) findViewById(R.id.imvTransport);
        imvAnimal = (ImageView) findViewById(R.id.imvAnimal);
        tvAlphabet = (TextView) findViewById(R.id.tvAlphabet);
        tvAnimal = (TextView) findViewById(R.id.tvAnimal);
        tvColor = (TextView) findViewById(R.id.tvColor);
        tvFruits = (TextView) findViewById(R.id.tvFruits);
        tvTransport = (TextView) findViewById(R.id.tvTransport);
        tvNumber = (TextView) findViewById(R.id.tvNumber);
    }
}
