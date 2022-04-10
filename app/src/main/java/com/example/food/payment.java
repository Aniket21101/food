package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.food.databinding.ActivityPaymentBinding;

public class payment extends AppCompatActivity {
ActivityPaymentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button2.setOnClickListener(view -> {
            Toast.makeText(this, "YOUR PAYMENT IS SUCCESFULLY DONE", Toast.LENGTH_SHORT).show();
        });

    }
}