package com.example.guia4dms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class segundaactividad extends AppCompatActivity {

    //::::::: Declarando variables globales
    private TextView tvNombre;
    private TextView tvHORAS;
    private TextView tvBruto;
    private TextView tvNeto;
    private TextView tvISSS;
    private TextView tvRENTA;
    private TextView tvAFP;
    double isss=0,renta=0,afp=0,bruto=0,neto=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundaactividad);
        //::::::::::: Inicializando las variables
        tvNombre=(TextView)findViewById(R.id.textViewNombre);
        tvHORAS =(TextView)findViewById(R.id.textViewHORAS);
        tvBruto =(TextView)findViewById(R.id.textViewBruto);
        tvNeto  =(TextView)findViewById(R.id.textViewNETO);
        tvISSS  =(TextView)findViewById(R.id.textViewISSS);
        tvRENTA =(TextView)findViewById(R.id.textViewRENTA);
        tvAFP   =(TextView)findViewById(R.id.textViewAFP);
        /*Bundle : Los paquetes se utilizan generalmente para pasar datos entre varias actividades de Android*/
        Bundle bundle = getIntent().getExtras();//creando un objeto bundle para traer los datos de la actividad mendiante Intent
        String nombre=bundle.getString("txtNombre");
        String horastrabajadas=bundle.getString("txtEdad");
        //Luego convierto la variable String y la paso a un valor entero
        int horas = Integer.parseInt(horastrabajadas);
        bruto   = horas*8.50;
        isss    = (bruto*0.02);
        afp     = (bruto*0.03);
        renta   = (bruto*0.04);
        neto    = bruto- (isss+afp+renta);
        //:::::::::::::::: Convierto nuevamente las variables double a string
        String salariobruto     = valueOf(bruto);
        String salarioneto      = valueOf(neto);
        String descuentoisss    = valueOf(isss);
        String descuentoafp     = valueOf(afp);
        String descuentorenta   = valueOf(renta);
        tvNombre.setText(nombre);
        tvHORAS.setText(horastrabajadas);
        tvBruto.setText(salariobruto);
        tvNeto.setText(salarioneto);
        tvISSS.setText(descuentoisss);
        tvAFP.setText(descuentoafp);
        tvRENTA.setText(descuentorenta);
    }
    public void finalizar(View view)
    {
        finish();
    }
}
