package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText weight, height ;
TextView resultText;
String calculation, BMIresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resultText = findViewById(R.id.result);

    }

    public void calculate(View view) {
        String s1 = weight.getText().toString();
        String s2 = height.getText().toString();

        float weightValue = Float.parseFloat(s1);
        float heightValue = Float.parseFloat(s2)/100;
        float bmi = weightValue/(heightValue*heightValue);
        if (bmi < 16) {
           BMIresult="Severely underweight";
        } else if (bmi< 18.5) {

            BMIresult="Underweight";
        } else if (bmi < 25) {

            BMIresult= "Normal";
        } else if (bmi < 30) {

            BMIresult="Overweight";
        } else {
            BMIresult="Obese";
        }
        calculation = bmi +"\n"+ BMIresult;
        resultText.setText(calculation);
    }
}
