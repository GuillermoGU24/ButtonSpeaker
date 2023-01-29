package com.app.buttonspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

public class btn16 extends AppCompatActivity {
    MediaPlayer player = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn16);
        getSupportActionBar().hide();
        player =  MediaPlayer.create(this, R.raw.tallocerebral);
        esperarYCerrar(500);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            if(player.isPlaying()){
                player.stop();
                player.pause();
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    public void esperarYCerrar(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                player.start();
            }
        }, milisegundos);
    }

}