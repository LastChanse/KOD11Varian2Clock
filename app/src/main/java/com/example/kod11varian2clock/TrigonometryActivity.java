package com.example.kod11varian2clock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityTrigonometryBinding;

public class TrigonometryActivity extends Activity {

    private ActivityTrigonometryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTrigonometryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}