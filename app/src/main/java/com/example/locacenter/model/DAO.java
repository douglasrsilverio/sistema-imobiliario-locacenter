package com.example.locacenter.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.locacenter.controller.MainActivity;

public class DAO extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "locacenter.db";
    private static final int VERSAO_BANCO = 1;

    public DAO(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("teste", "onCreate");

        String sqlConfiguracoes = "CREATE TABLE IF NOT EXISTS CASA ("  +
                "_id INTEGER PRIMARY KEY," +
                "RUA VARCHAR(255)," +
                "NUMERO INTEGER(255)," +
                "CEP INTEGER(255)," +
                "HIDROMETRO VARCHAR(255)," +
                "MATRICULA VARCHAR(255));";

        db.execSQL(sqlConfiguracoes);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("teste", "onUpgrade");

        switch (oldVersion){
            case 1:
                Log.d("teste", "atualização para versão 2");
            case 2:
                Log.d("teste", "atualização para versão 3");
            case 3:
                Log.d("teste", "atualização para versão 4");
            case 4:
                Log.d("teste", "atualização para versão 5");
        }
    }
}
