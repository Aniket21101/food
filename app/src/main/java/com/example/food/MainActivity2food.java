package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.food.databinding.ActivityMainActivity2foodBinding;

public class MainActivity2food extends AppCompatActivity implements View.OnClickListener {
ActivityMainActivity2foodBinding binding;
Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainActivity2foodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView2.setOnClickListener(this);
        binding.textView3.setOnClickListener(this);
        binding.textView4.setOnClickListener(this);
        binding.textView8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView2:
                in=new Intent(getApplicationContext(),snack.class);
                startActivity(in);
                break;
            case R.id.textView3:
                in=new Intent(getApplicationContext(),maincourse.class);
                startActivity(in);

                break;
            case R.id.textView4:
                in=new Intent(getApplicationContext(),beverage.class);
                startActivity(in);
                break;
            case R.id.textView8:
                in=new Intent(getApplicationContext(),dessert.class);
                startActivity(in);
                break;
        }
    }
}