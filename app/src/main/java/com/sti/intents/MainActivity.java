package com.sti.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tvTexto = findViewById(R.id.tv_texto);
        Button btnTrocaTela = findViewById(R.id.trocar_tela);

        final String texto = tvTexto.getText().toString();

        btnTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("textoActivity", texto);
                startActivity(intent);
                finish();
            }
        });

    }
}
