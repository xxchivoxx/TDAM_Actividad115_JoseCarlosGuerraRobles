package com.example.carlos.tdam_actividad115_josecarlosguerrarobles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ciclo_Vida extends AppCompatActivity {
ListView lstCiclo;
ArrayAdapter<String> adaptador;
String[] item = {"onCreate() \n Se utiliza para realizar todo tipo de inicializaciones, como la creación de la interfaz de usuario o la inicialización de estructuras de datos.",
                 "onStart() \n Nos indica que la actividad está a punto de ser mostrada al usuario.",
                 "onResume() \n Se llama cuando la actividad va a comenzar a interactuar con el usuario." ,
                 "onPause() \n Indica que la actividad está a punto de ser lanzada a segundo plano, normalmente porque otra actividad es lanzada.",
                 "onStop() \n La actividad ya no va a ser visible para el usuario.",
                 "onDestroy \n Se llama antes de que la actividad sea totalmente destruida."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo__vida);
        lstCiclo = findViewById(R.id.lstCiclo);
        adaptador = new ArrayAdapter<String>(
                this,R.layout.support_simple_spinner_dropdown_item,item);
        lstCiclo.setAdapter(adaptador);

    }
}
