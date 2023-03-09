package com.example.androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // on below line creating a variables for edit text, button and text views.
    private EditText numberOneEdt, numberTwoEdt;
    private Button addBtn;
    private TextView sumTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOneEdt = findViewById(R.id.idEdtNumber1);
        numberTwoEdt = findViewById(R.id.idEdtNumber2);
        addBtn = findViewById(R.id.idBtnAdd);
        sumTV = findViewById(R.id.idTVSum);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!numberOneEdt.getText().toString().isEmpty() && !numberTwoEdt.getText().toString().isEmpty()) {
                       int num1 = Integer.parseInt(numberOneEdt.getText().toString());
                    int num2 = Integer.parseInt(numberTwoEdt.getText().toString());

                    int sum = num1 + num2;

                    sumTV.setText(String.valueOf(sum));
                } else {

                    Toast.makeText(MainActivity.this, "Please enter both numbers..", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}