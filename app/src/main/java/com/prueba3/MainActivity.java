package com.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CheckBox nulo ,gabr,kast;
    Button Resultados , votar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nulo = (CheckBox) findViewById(R.id.chb_nulo);
        gabr = (CheckBox) findViewById(R.id.chb_gb);
        kast = (CheckBox) findViewById(R.id.chb_ja);
        Resultados = (Button) findViewById(R.id.btn_Result);
        votar= (Button)findViewById(R.id.btn_votar);


        votar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nul =0;
                int gaa =0;
                int kaa=0;
                int bla=0;
                if (nulo.isChecked()== true){
                    nul=1;
                }
                if(nulo.isChecked()== true){
                    gaa=1;
                }
                if(kast.isChecked()==true){
                    kaa=1;
                }
                if(nulo.isChecked()== false &&  nulo.isChecked()== false &&  kast.isChecked()==false){
                    bla=1;
                }
                SQLiteDatabase db;
                Dbhelper agregar =  new Dbhelper(getApplicationContext());
                db=agregar.getWritableDatabase();
                ContentValues cv = new ContentValues();
                cv.put("voto_nulo",nul);
                cv.put("voto_boric",gaa);
                cv.put("voto_kast",kaa);
                cv.put("voto_blanco",bla);
                db.insert("voto",null,cv);
                Toast.makeText(getApplicationContext(),"Voto Insertado",Toast.LENGTH_SHORT).show();
            }
        });


    }
}