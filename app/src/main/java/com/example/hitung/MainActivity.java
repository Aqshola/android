package com.example.hitung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button balok=findViewById(R.id.link_balok);
        balok.setOnClickListener(this);
        Button tabung=findViewById(R.id.link_tabung);
        tabung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.link_balok){
            Intent bukaBalok=new Intent(MainActivity.this, hitungBalok.class);
            startActivity(bukaBalok);
        }else if(view.getId()== R.id.link_tabung){
            Intent bukaTabung=new Intent(MainActivity.this, hitungTabung.class);
            startActivity(bukaTabung);
        }
    }
}