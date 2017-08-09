package com.example.pipe.fibonacci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;

import static android.support.v7.appcompat.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    EditText  text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text =(EditText) findViewById( R.id.textoInicio);


        Button botonCambio = (Button) findViewById(R.id.botonCalcular);
        botonCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("Cantidad",text.getText().toString());
                startActivity(intent);
            }
        });
    }
}
