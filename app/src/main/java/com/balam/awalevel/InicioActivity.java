package com.balam.awalevel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.anastr.speedviewlib.PointerSpeedometer;
import com.github.anastr.speedviewlib.SpeedView;
import com.skydoves.elasticviews.ElasticButton;

public class InicioActivity extends AppCompatActivity {

    //Declaración de variables
    ElasticButton btnSalir, btnCargar ;
    PointerSpeedometer speedometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        cargarControles();
        //Inicializamos el indicador y seteamos las unidades en porcentaje
        speedometer.setUnit(" %");

        //Eventos de Botones
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(InicioActivity.this, "Nos vemos pronto.", Toast.LENGTH_SHORT).show();
            }
        });

        btnCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speedometer.speedTo((float) (Math.random()*100));
                Toast.makeText(InicioActivity.this, "¡Actualizado!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void cargarControles() {
        //Botones
        btnSalir = findViewById(R.id.btnSalir);
        btnCargar = findViewById(R.id.btnCargar);
        //Indicador
        speedometer = findViewById(R.id.speedView);
    }
}