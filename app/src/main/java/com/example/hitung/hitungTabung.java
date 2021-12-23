package com.example.hitung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitungTabung extends AppCompatActivity implements View.OnClickListener{

    EditText Tinggi;
    EditText Jari;
    TextView hasil;
    final float PHI= (float) 3.14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tabung);
        Tinggi=findViewById(R.id.tabung_tinggi);
        Jari=findViewById(R.id.tabung_jari);
        hasil=findViewById(R.id.hasil_tabung);

        Button hitung=findViewById(R.id.hitung_tabung);
        hitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.hitung_tabung){
            float tinggi= Float.parseFloat( Tinggi.getText().toString());
            float jari=Float.parseFloat( Jari.getText().toString());

            float volume= tinggi * PHI *jari*jari;
            hasil.setText(PHI+" x "+jari+" x "+jari+" x "+tinggi+" = "+volume);


            Tinggi.setText("");
            Jari.setText("");
            Jari.onEditorAction(EditorInfo.IME_ACTION_DONE);
        }
    }
}