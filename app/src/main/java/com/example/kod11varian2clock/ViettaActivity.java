package com.example.kod11varian2clock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityViettaBinding;

public class ViettaActivity extends Activity {

    private Button butt_back;
    private ActivityViettaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViettaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        butt_back = binding.buttBack;

        butt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViettaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}