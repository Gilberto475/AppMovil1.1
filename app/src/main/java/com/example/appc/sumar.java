package com.example.appc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sumar extends AppCatActivity {

    private TextView resultado;
    private EditText valor1;
    private EditText valor2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=findViewById(R.id.textView);
        valor1=findViewById(R.id.editTextNumber2);
        valor2=findViewById(R.id.editTextNumber3);

    }

    public void calcular(View view) {
        int suma = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
        resultado.setText(suma+ "");
    }

    public void restar(View view) {
        int resta = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
        resultado.setText(resta+"");
    }

    public void multiplicar(View view) {
        int multiplo = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
        resultado.setText(multiplo+"");
    }
    public void dividir (View view) {
        int division = Integer.parseInt(valor1.getText().toString()) / Integer.parseInt(valor2.getText().toString());
        resultado.setText(division+ "");
    }

    private void calcularFactorial(View view) {
        String EditText = valor1.getText().toString();

        if (!EditText.isEmpty()) {
            int numero = Integer.parseInt(EditText);
            int factorial = calcularFactorial(numero);

            // Mostrar el resultado donde desees (puedes utilizar un TextView, por ejemplo)
            // Ejemplo:
            // resultado.setText("Factorial de " + numero + " es: " + factorial);
        }
    }

    private int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}










