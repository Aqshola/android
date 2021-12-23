package com.example.hitung;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.hitung.databinding.ActivityHitungBalokBinding;

public class hitungBalok extends AppCompatActivity implements View.OnClickListener {


    EditText Panjang;
    EditText Lebar;
    EditText Tinggi;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_balok);
        Panjang=findViewById( R.id.balok_panjang);
        Lebar=findViewById( R.id.balok_lebar);
        Tinggi=findViewById( R.id.balok_tinggi);

         hasil=findViewById(R.id.hasil);
        Button hitung=findViewById(R.id.hitung_balok);
        hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.hitung_balok){
            float panjang=Float.parseFloat(Panjang.getText().toString());
            float lebar=Float.parseFloat(Lebar.getText().toString());
            float tinggi=Float.parseFloat(Tinggi.getText().toString());

            float volume= panjang*lebar*tinggi;
            hasil.setText(panjang +" x "+lebar +" x "+tinggi+" = "+ volume);

            Panjang.setText("");
            Lebar.setText("");
            Tinggi.setText("");
            Tinggi.onEditorAction(EditorInfo.IME_ACTION_DONE);


        }
    }
}