package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("BELAJAR MEMBACA");

    }


    public void bt_datahuruf(View view){
        Toast.makeText(MainActivity.this,"Mengenal Huruf",
               Toast.LENGTH_SHORT).show();
    }

    public void bt_hurufa(View view) {
        Intent i = new Intent(MainActivity.this,hurufa.class);
        startActivity(i);
    }
    public void bt_hurufb(View view) {
        Intent i = new Intent(MainActivity.this,hurufb.class);
        startActivity(i);
    }
    public void bt_hurufc(View view) {
        Intent i = new Intent(MainActivity.this,hurufc.class);
        startActivity(i);
    }
    public void bt_hurufd(View view) {
        Intent i = new Intent(MainActivity.this,hurufd.class);
        startActivity(i);
    }
    public void bt_hurufe(View view) {
        Intent i = new Intent(MainActivity.this,hurufe.class);
        startActivity(i);
    }
    public void bt_huruff(View view) {
        Intent i = new Intent(MainActivity.this,huruff.class);
        startActivity(i);
    }
    public void bt_hurufg(View view) {
        Intent i = new Intent(MainActivity.this,hurufg.class);
        startActivity(i);
    }
    public void bt_hurufh(View view) {
        Intent i = new Intent(MainActivity.this,hurufh.class);
        startActivity(i);
    }
    public void bt_hurufi(View view) {
        Intent i = new Intent(MainActivity.this,hurufi.class);
        startActivity(i);
    }
    public void bt_hurufj(View view) {
        Intent i = new Intent(MainActivity.this,hurufj.class);
        startActivity(i);
    }
}

