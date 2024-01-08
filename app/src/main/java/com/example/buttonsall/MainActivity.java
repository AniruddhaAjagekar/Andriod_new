package com.example.buttonsall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstnum = (EditText) findViewById(R.id.firstnum);
        final EditText secnum = (EditText) findViewById(R.id.secnum);
        Button addbtn = (Button) findViewById(R.id.addbtn);

        addbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                if(firstnum.getText().toString().isEmpty()|| secnum.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "please fill all fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    int num1  = Integer.parseInt(firstnum.getText().toString());
                     int num2  = Integer.parseInt(secnum.getText().toString());
                    Toast.makeText(getApplicationContext(), "sum =" +(num1 + num2), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}