package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
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
        Button calc = (Button) findViewById(R.id.btn_calc);
        EditText ed_tall = (EditText) findViewById(R.id.ed_tall);
        EditText ed_weight = (EditText) findViewById(R.id.ed_weight);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_tall.getText().toString().equals("") || ed_weight.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,"empty",Toast.LENGTH_SHORT).show();
                }else{
                    float h = Float.parseFloat(ed_tall.getText().toString())/100;
                    float w = Float.parseFloat(ed_weight.getText().toString());
                    float result =Math.round(w / (h*h)) ;
                    Toast tos = Toast.makeText(MainActivity.this,String.valueOf(result),Toast.LENGTH_SHORT);
                    tos.setGravity(Gravity.CENTER,0,0);
                    tos.show();
                    Log.d("MainActivity", String.valueOf(result));
                }

            }
        });
    }
}