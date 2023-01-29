package com.app.buttonspeaker;

import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class Inicio extends AppCompatActivity {
    private ProgressBar progreso;
    Intent intent;
    int miProgreso = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        getSupportActionBar().hide();
        progreso = findViewById(R.id.progreso1);
        progreso.getIndeterminateDrawable().setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);
        new Thread(myThread).start();

        intent = new Intent (this.getApplicationContext(), MainActivity.class);



    }
    public void esperarYCerrar(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                startActivityForResult(intent, 0);
            }
        }, milisegundos);
    }
    private Runnable myThread = new Runnable(){

        public void run() {
            while (miProgreso<100){
                try{
                    myHandle.sendMessage(myHandle.obtainMessage());
                    Thread.sleep(20);
                } catch(Throwable t){}
            }
        }

        Handler myHandle = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                miProgreso=miProgreso+1;
                progreso.setProgress(miProgreso);
                if(miProgreso==100){
                    esperarYCerrar(200);
                }
            }
        };

    };

}