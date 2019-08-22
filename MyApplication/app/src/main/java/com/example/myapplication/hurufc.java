package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.media.MediaPlayer;


public class hurufc extends AppCompatActivity {
    Button proses;
    private static final String isPlaying ="Media is Playing";
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurufc);

        proses = (Button) findViewById(R.id.bt_proses);
        proses.setOnClickListener((arg0) -> {playSound(1);});

        getSupportActionBar().setTitle("BELAJAR MEMBACA");
        getSupportActionBar().setSubtitle("Huruf A-J");

    }

    public void onPause(){
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }
    private void playSound(int arg){
        try{
            if(player.isPlaying()){
                player.stop();
                player.release();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Membaca Huruf C ", Toast.LENGTH_LONG).show();
        }
        if (arg==1){
            Toast.makeText(this, isPlaying+"Huruf C", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.hurufc);
        }
        //player.setLooping();
        player.start();
    }



    public void bt_datahuruf(View view){
        Toast.makeText(hurufc.this,"Mengenal Huruf",
                Toast.LENGTH_SHORT).show();
    }


}
