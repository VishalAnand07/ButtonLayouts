package com.example.buttonlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"button 1" ,Toast.LENGTH_SHORT).show();
//            }
//        });
        btn1.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }

//    public void button3(View view) {
//
//    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button1)
             Toast.makeText(this,"button1 click",Toast.LENGTH_SHORT).show();
    }

    public void button1(View view) {
    }

//    public void button1(View view) {
//    }
}
