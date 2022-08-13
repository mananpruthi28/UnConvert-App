package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private static DecimalFormat df = new DecimalFormat("0.000");
    //private static DecimalFormat df = new DecimalFormat("0.000");
    private Button button;
    private TextView textView3;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                double pound1 = Math.round(pound*1000.00) / 1000.00;
//                df.format(pound);
//                df.setRoundingMode(RoundingMode.UP);
//                df.format(pound);
                textView3.setText("The corresponding value in Pounds is " + pound1 );
                Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();

            }
        });
    }
//    Alternative for OnClickListener
//    public void calculate(View view){
//        String s = editText.getText().toString();
//        int kg = Integer.parseInt(s);
//        double pound = 2.205 * kg;
//        textView3.setText("The corresponding value in Pounds is " + pound );
    }
