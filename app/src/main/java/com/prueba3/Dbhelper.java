package com.prueba3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {

    public static String  Nombre_db = "contador.db";
    public static int Version_db=1;
    public static String Tabla_voto="create table voto(id_voto integer  primary key autoincrement, voto_blanco integer, voto_nulo integer, voto_boric integer, voto_kast integer)";


    public Dbhelper(Context context) {
        super(context,Nombre_db, null,Version_db);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Tabla_voto);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
