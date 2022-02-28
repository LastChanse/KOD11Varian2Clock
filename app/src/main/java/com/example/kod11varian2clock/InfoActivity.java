package com.example.kod11varian2clock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityInfoBinding;

public class InfoActivity extends Activity {

    private ActivityInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}