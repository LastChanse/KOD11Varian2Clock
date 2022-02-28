package com.example.kod11varian2clock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityViettaBinding;

public class ViettaActivity extends Activity {

    private ActivityViettaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViettaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}