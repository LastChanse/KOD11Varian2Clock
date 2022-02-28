package com.example.kod11varian2clock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView txtTrigonomic;
    private TextView txtVietta;
    private TextView txtPifagor;
    private TextView txtInfo;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        txtTrigonomic = binding.txtTrigonomic;
        txtVietta = binding.txtVietta;
        txtPifagor = binding.txtPifagor;
        txtInfo = binding.txtInfo;

        txtTrigonomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrigonometryActivity.class);
                startActivity(intent);
            }
        });

        txtVietta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViettaActivity.class);
                startActivity(intent);
            }
        });

        txtPifagor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PifagorActivity.class);
                startActivity(intent);
            }
        });

        txtInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });
    }
}