package com.chocola.chococalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plus = (Button)findViewById(R.id.buttonPlus);
        Button minus = (Button)findViewById(R.id.buttonMinus);
        Button multiply = (Button)findViewById(R.id.buttonMultiply);
        Button divide = (Button)findViewById(R.id.buttonDivide);
        Button exit = (Button)findViewById(R.id.buttonExit);
        EditText num1 = (EditText)findViewById(R.id.numberOneEditText);
        EditText num2 = (EditText)findViewById(R.id.numberTwoEditText);
        TextView result = (TextView) findViewById(R.id.textViewResultado);

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().trim().length() == 0
                        || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.fillNumbers), Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        int numeroUno = Integer.parseInt(num1.getText().toString());
                        int numeroDos = Integer.parseInt(num2.getText().toString());
                        result.setText(String.format("%d", numeroUno + numeroDos));
                    }
                    catch(Exception e){
                        throw e;
                    }
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().trim().length() == 0
                        || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.fillNumbers), Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        int numeroUno = Integer.parseInt(num1.getText().toString());
                        int numeroDos = Integer.parseInt(num2.getText().toString());
                        result.setText(String.format("%d", numeroUno - numeroDos));
                    }
                    catch(Exception e){
                        throw e;
                    }
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().trim().length() == 0
                        || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.fillNumbers), Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        int numeroUno = Integer.parseInt(num1.getText().toString());
                        int numeroDos = Integer.parseInt(num2.getText().toString());
                        result.setText(String.format("%d", numeroUno * numeroDos));
                    }
                    catch(Exception e){
                        throw e;
                    }
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().trim().length() == 0
                        || num2.getText().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.fillNumbers), Toast.LENGTH_SHORT).show();

                }
                else if(num2.getText().toString().trim().equals("0")){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.divideByZero), Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        int numeroUno = Integer.parseInt(num1.getText().toString());
                        int numeroDos = Integer.parseInt(num2.getText().toString());
                        result.setText(String.format("%d", numeroUno / numeroDos));
                    }
                    catch(Exception e){
                        throw e;
                    }
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}