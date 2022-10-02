package com.example.statefarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.petbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pet.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.hospitalbutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hospital.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.medicarebutton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Medicare.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.businessbutton);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Business.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) findViewById(R.id.jakebutton);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Jake.class);
                startActivity(intent);
            }
        });
    }
}