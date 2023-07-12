package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.MenuItem;


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
                Intent intentHoteles=new Intent(Home.this,Hoteles.class);
                startActivity(intentHoteles);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRestaurantes=new Intent(Home.this,Restaurantes.class);
                startActivity(intentRestaurantes);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSitios=new Intent(Home.this,Sitios.class);
                startActivity(intentSitios);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();


            if(itemSeleccionado==R.id.opcion1){

            }else if(itemSeleccionado==R.id.opcion2){

            }else if(itemSeleccionado==R.id.opcion3){

            }else if(itemSeleccionado==R.id.opcion4){

            }





        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma(String idioma){

    }
}

