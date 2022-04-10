package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class place extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        String netprice=getIntent().getStringExtra("price");

        TextView textView=findViewById(R.id.textView32);
        TextView textView1=findViewById(R.id.textView33);
        TextView textView2=findViewById(R.id.textView34);

        Button button=findViewById(R.id.button4);

        int arr[]=getIntent().getIntArrayExtra("quantity");
        double tax= Float.parseFloat(netprice)*0.05;
        double total=Float.parseFloat(netprice)+tax;

        textView.setText(netprice);
        textView1.setText(String.valueOf(tax));
        textView2.setText(String.valueOf(total));

        ArrayList<String> list=new ArrayList();
        list=getIntent().getStringArrayListExtra("data");

        button.setOnClickListener(view -> {
            Intent intent=new Intent(place.this,payment.class);
            startActivity(intent);
        });

        ListView listView=findViewById(R.id.l);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list);
        listView.setAdapter(arrayAdapter);
    }

}