package com.pro1.vukn.englishforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnLearn,btnVideo,btnMiniGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        innitView();
        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,LearnActivity.class));
            }
        });
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,VideoActivity.class));
            }
        });
        btnMiniGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,GameActivity.class));
            }
        });
    }

    private void innitView() {
        btnLearn = (Button)findViewById(R.id.btnLearn);
        btnMiniGame =(Button)findViewById(R.id.btnGame);
        btnVideo = (Button)findViewById(R.id.btnVideo);
    }
}
