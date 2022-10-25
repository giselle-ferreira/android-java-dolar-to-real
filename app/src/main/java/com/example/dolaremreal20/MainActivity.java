package com.example.dolaremreal20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText cotacao, valorDolar;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cotacao = findViewById(R.id.cotacao);
        valorDolar = findViewById(R.id.valorDolar);
        result = findViewById(R.id.result);

    }

    public void convertDolarToReal(View view){
        double quantDolar = Double.parseDouble(valorDolar.getText().toString());
        double cotacaoDolar = Double.parseDouble(cotacao.getText().toString());
        double valorConvertido = quantDolar * cotacaoDolar;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(valorConvertido);

        result.setText("R$: " + valorFormatado);

    }
}