package com.example.kod11varian2clock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kod11varian2clock.databinding.ActivityPifagorBinding;

public class PifagorActivity extends Activity {

    private ActivityPifagorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPifagorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}