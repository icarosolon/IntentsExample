package com.sti.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView tvTexto2 = findViewById(R.id.tv_texto2);
        Button btnVoltarTela = findViewById(R.id.voltar_tela);

        final Intent intent = getIntent();

        tvTexto2.setText(intent.getStringExtra("textoActivity"));

        tvTexto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTexto2.setText(getIntent().getStringExtra("textoActivity"));

            }
        });

        btnVoltarTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "74988170986"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    finish();
                }
            }


        });
    }
}
