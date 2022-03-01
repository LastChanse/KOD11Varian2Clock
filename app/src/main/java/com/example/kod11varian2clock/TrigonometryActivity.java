package com.example.kod11varian2clock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityTrigonometryBinding;

public class TrigonometryActivity extends Activity {

    private Button butt_back;
    private ActivityTrigonometryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTrigonometryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        butt_back = binding.buttBack;

        butt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrigonometryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}