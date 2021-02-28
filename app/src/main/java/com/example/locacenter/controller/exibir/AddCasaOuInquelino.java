package com.example.locacenter.controller.exibir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.locacenter.R;

public class AddCasaOuInquelino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_casa_ou_inquelino);
    }

    public void addCasa(View v) {
        Intent myIntent = new Intent(this, AdicionarCasaForm.class);
        startActivity(myIntent);
    }

    public void addInquelino(View v){
        Intent myIntent = new Intent(this, AdicionarInquelinoForm.class);
        startActivity(myIntent);
    }
}