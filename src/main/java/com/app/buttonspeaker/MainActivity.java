package com.app.buttonspeaker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity  {

    Intent intent;
    int pos;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void play(View v) throws InterruptedException {

        switch (v.getId()) {

            case R.id.imageButton0:
                intent = new Intent (v.getContext(), btn0.class);
                startActivityForResult(intent, 0);
                break;
                case R.id.imageButton1:
                intent = new Intent (v.getContext(), btn1.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton2:
                intent = new Intent (v.getContext(), btn2.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton3:
                intent = new Intent (v.getContext(), btn03.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton4:
                intent = new Intent (v.getContext(), btn04.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton5:
                intent = new Intent (v.getContext(), btn05.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton6:
                intent = new Intent (v.getContext(), btn06.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton7:
                intent = new Intent (v.getContext(), btn07.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton8:
                intent = new Intent (v.getContext(), btn08.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton9:
                intent = new Intent (v.getContext(), btn09.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton10:
                intent = new Intent (v.getContext(), btn10.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton11:
                intent = new Intent (v.getContext(), btn11.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton12:
                intent = new Intent (v.getContext(), btn12.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton13:
                intent = new Intent (v.getContext(), btn13.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton14:
                intent = new Intent (v.getContext(), btn14.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton15:
                intent = new Intent (v.getContext(), btn15.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton16:
                intent = new Intent (v.getContext(), btn16.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton17:
                intent = new Intent (v.getContext(), btn17.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton18:
                intent = new Intent (v.getContext(), btn18.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton19:
                intent = new Intent (v.getContext(), btn19.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton20:
                intent = new Intent (v.getContext(), btn20.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.imageButton21:
                intent = new Intent (v.getContext(), btn21.class);
                startActivityForResult(intent, 0);
                break;
    }
    }

        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            // TODO Auto-generated method stub
            if (keyCode == event.KEYCODE_BACK) {
                finishAffinity();
            }
            return super.onKeyDown(keyCode, event);

    }

}





