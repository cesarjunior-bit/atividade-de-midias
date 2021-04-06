package com.example.atividademidias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView meuvideo = (VideoView)findViewById(R.id.videoview);
        String uri ="android.resource://" +  getPackageName() + "/" + R.raw.video;
        if(meuvideo != null){
            meuvideo.setVideoURI(Uri.parse(url));
            meuvideo.start();
            meuvideo.setMediaController(new MediaController(context this));

        }
    }
}