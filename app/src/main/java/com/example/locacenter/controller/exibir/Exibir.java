package com.example.locacenter.controller.exibir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.locacenter.R;
import com.example.locacenter.model.CidadeDao;
import com.example.locacenter.model.entidades.Casa;

import java.util.List;

public class Exibir extends AppCompatActivity {
    List<Casa> casa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir);
        populaBotoesScrollViewCasa();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populaBotoesScrollViewCasa();
    }

    public void populaBotoesScrollViewCasa(){
        CidadeDao cidadeDao = new CidadeDao(getBaseContext());
        LinearLayout llCasa = findViewById(R.id.llCasas);

        llCasa.removeAllViews();
        casa = cidadeDao.selectTabelaCasa();

        for(Casa casa: casa) {
            try {
                String rua = casa.getRua();
                int numero = casa.getNumero();
                int cep = casa.getCep();
                String hidrometro = casa.getHidrometro();
                String matricula = casa.getMatricula();

                criaBotoesScrollViewCasa(rua, "a");

            } catch (Exception e) {
                Log.i("teste", "Sem dados para fazer o select.");
            }
        }
    }

    public void adicionar(View v){
        Intent myIntent = new Intent(this, AddCasaOuInquelino.class);
        startActivity(myIntent);
    }

    public void criaBotoesScrollViewCasa(String rua, String hidrometro){
        Button myButton = new Button(this);
        myButton.setText(rua);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        LinearLayout ll = findViewById(R.id.llCasas);
        LinearLayout.LayoutParams lp =  new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        ll.addView(myButton, lp);
    }
}