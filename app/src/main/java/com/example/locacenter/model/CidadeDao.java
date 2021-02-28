package com.example.locacenter.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.locacenter.model.entidades.Casa;

import java.util.ArrayList;
import java.util.List;

public class CidadeDao extends AppCompatActivity {

    private SQLiteDatabase db;
    private DAO banco;

    public CidadeDao(Context context){
        banco = new DAO(context);
    }

    public void insereDado(Casa casa){

        ContentValues valores;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put("RUA", casa.getRua());
        valores.put("NUMERO", casa.getNumero());
        valores.put("CEP", casa.getCep());
        valores.put("HIDROMETRO", casa.getHidrometro());
        valores.put("MATRICULA", casa.getMatricula());

        db.insert("CASA", null, valores);
        db.close();
    }

    public List<Casa> selectTabelaCasa(){
        String rua = "";
        List<Casa> listaCasas = new ArrayList<>();
        String queryString = "SELECT * FROM CASA";
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do{
                Casa casa = new Casa();
                casa.setRua(cursor.getString(1));
                casa.setNumero(cursor.getInt(2));
                casa.setCep(cursor.getInt(3));
                casa.setHidrometro(cursor.getString(4));
                casa.setMatricula(cursor.getString(5));
                listaCasas.add(casa);
            }while (cursor.moveToNext());
        }
        return listaCasas;
    }
}