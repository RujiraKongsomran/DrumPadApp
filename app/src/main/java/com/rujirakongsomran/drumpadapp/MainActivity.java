package com.rujirakongsomran.drumpadapp;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SoundPool soundPool;
    int soundId1, soundId2, soundId3, soundId4, soundId5, soundId6, soundId7, soundId8, soundId9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool.Builder()
                .setMaxStreams(10)
                .build();

        soundId1 = soundPool.load(getApplicationContext(), R.raw.sound1, 1);
        soundId2 = soundPool.load(getApplicationContext(), R.raw.sound2, 1);
        soundId3 = soundPool.load(getApplicationContext(), R.raw.sound3, 1);
        soundId4 = soundPool.load(getApplicationContext(), R.raw.sound4, 1);
        soundId5 = soundPool.load(getApplicationContext(), R.raw.sound5, 1);
        soundId6 = soundPool.load(getApplicationContext(), R.raw.sound6, 1);
        soundId7 = soundPool.load(getApplicationContext(), R.raw.sound7, 1);
        soundId8 = soundPool.load(getApplicationContext(), R.raw.sound8, 1);
        soundId9 = soundPool.load(getApplicationContext(), R.raw.sound9, 1);
    }

    public void playSound1(View v) {
        soundPool.play(soundId1, 1, 1, 0, 0, 1);
    }

    public void playSound2(View v) {
        soundPool.play(soundId2, 1, 1, 0, 0, 1);
    }

    public void playSound3(View v) {
        soundPool.play(soundId3, 1, 1, 0, 0, 1);
    }

    public void playSound4(View v) {
        soundPool.play(soundId4, 1, 1, 0, 0, 1);
    }

    public void playSound5(View v) {
        soundPool.play(soundId5, 1, 1, 0, 0, 1);
    }

    public void playSound6(View v) {
        soundPool.play(soundId6, 1, 1, 0, 0, 1);
    }

    public void playSound7(View v) {
        soundPool.play(soundId7, 1, 1, 0, 0, 1);
    }

    public void playSound8(View v) {
        soundPool.play(soundId8, 1, 1, 0, 0, 1);
    }

    public void playSound9(View v) {
        soundPool.play(soundId9, 1, 1, 0, 0, 1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        soundPool.release();
        soundPool = null;
    }
}