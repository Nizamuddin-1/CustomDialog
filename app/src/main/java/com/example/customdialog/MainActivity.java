package com.example.customdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //for creating custom dialog we use dialog class not AlertDialog class
        Dialog a = new Dialog(this);
        a.setContentView(R.layout.dialog_layout);
        //a.setCancelable(false);
        button = findViewById(R.id.btn);
        Button okay = a.findViewById(R.id.b);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.show();
            }
        });
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Successful Transaction", Toast.LENGTH_SHORT).show();
                a.dismiss();
            }
        });
    }
}