package com.example.batool_cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText, editText1;
    private Button button;
    private TextView textView1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editText1 = (EditText)findViewById(R.id.editText1);
        textView1 = findViewById(R.id.textView1);

        button = findViewById(R.id.button);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(editText.getText().toString());
                int number2 = Integer.parseInt(editText1.getText().toString());
                //try🦧
                System.out.println("🐹");
                //Calculate btn
                int  calculate = number1 + number2;
                textView1.setText(String.valueOf(calculate));
            }
        });
    }
}