package com.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class part2 extends AppCompatActivity {
    ListView result;
    ArrayList<Integer> arr_votos;
    Button vovlerrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);

        result = (ListView) findViewById(R.id.list_result);



    }



    }


