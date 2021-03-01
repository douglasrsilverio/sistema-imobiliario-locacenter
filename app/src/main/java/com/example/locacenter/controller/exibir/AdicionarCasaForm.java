package com.example.locacenter.controller.exibir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.locacenter.R;
import com.example.locacenter.model.CidadeDao;
import com.example.locacenter.model.entidades.Casa;

public class AdicionarCasaForm extends AppCompatActivity {

    Casa casa = new Casa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_adicionar_casa);
    }

    public void populaObjetoCasa(){
        //rua
        EditText textRua = findViewById(R.id.rua);
        String rua = textRua.getText().toString();
        casa.setRua(rua);

        //numero
        EditText textNumero = findViewById(R.id.numero);
        int numero = Integer.parseInt(String.valueOf(textNumero.getText()));
        casa.setNumero(numero);

        //cep
        EditText cepText = findViewById(R.id.cep);
        int cep = Integer.parseInt(String.valueOf(cepText.getText()));
        casa.setCep(cep);

        //hidrometro
        EditText hidrometroText = findViewById(R.id.hidrometro);
        String hidrometro = hidrometroText.getText().toString();
        casa.setHidrometro(hidrometro);

        //matricula
        EditText matriculaText = findViewById(R.id.matricula);
        String matricula = matriculaText.getText().toString();
        casa.setMatricula(matricula);
    }

    public void Cadastrar(View v){
        CidadeDao cidadeDao = new CidadeDao(getBaseContext());
        populaObjetoCasa();
        cidadeDao.insereDado(casa);
    }
}
