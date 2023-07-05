package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS

    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitios=findViewById(R.id.botonsitios);

        //DETECTANDO EVENTOS
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Play Click", Toast.LENGTH_SHORT).show();
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Play Click", Toast.LENGTH_SHORT).show();
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Play Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case (R.id.opcion1):
                break;
            case (R.id.opcion2):
                break;
            case (R.id.opcion3):
                break;
            case (R.id.opcion4):
                break;
        }
    }

    return super.onOptionsItemSelected(item);
}