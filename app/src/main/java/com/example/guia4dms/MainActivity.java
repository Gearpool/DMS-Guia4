package com.example.guia4dms;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //::::::::::::: Declarando las variables globales
    private EditText etNombre;
    private EditText etEdad;
    double isss=0,renta=0,afp=0,bruto=0,neto=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //:::::::: Inicializando las variables y asignandoles el id de los input
        etNombre=(EditText)findViewById(R.id.txtNombre);
        etEdad=(EditText)findViewById(R.id.txtEdad);
    }
    public void segundaactividad (View view)
    {
        /*Intent : es un objeto de mensajería que puedes usar para solicitar una acción de otro componente de una app.
        Si bien las intents facilitan la comunicación entre componentes de varias formas*/
        Intent i = new Intent(this,segundaactividad.class);
        i.putExtra("txtNombre",etNombre.getText().toString());
        i.putExtra("txtEdad",etEdad.getText().toString());
        startActivity(i);
    }
}
