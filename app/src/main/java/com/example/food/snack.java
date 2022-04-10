package com.example.food;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.food.databinding.ActivitySnackBinding;

import java.util.ArrayList;

public class snack extends AppCompatActivity implements View.OnClickListener{

    String name="",price="";
    int netprice=0,cal=0;
    int count[]={0,0,0,0,0,0,0};
    ArrayList<String> arrayList;
    ActivitySnackBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySnackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList=new ArrayList<>();

        binding.chilli.setOnClickListener(this);
        binding.vegmomo.setOnClickListener(this);
        binding.roll.setOnClickListener(this);
        binding.chowmein.setOnClickListener(this);
        binding.frencch.setOnClickListener(this);
        binding.aloo.setOnClickListener(this);
        binding.man.setOnClickListener(this);


        binding.button3.setOnClickListener(view -> {
            Intent intent=new Intent(snack.this,place.class);
            intent.putExtra("data",arrayList);
            intent.putExtra("price",String.valueOf(netprice));
            intent.putExtra("quantity",count);
            binding.chilli.setEnabled(true);
            binding.vegmomo.setEnabled(true);
            binding.roll.setEnabled(true);
            binding.chowmein.setEnabled(true);
            binding.frencch.setEnabled(true);
            binding.aloo.setEnabled(true);
            binding.man.setEnabled(true);

            startActivity(intent);
        });
    }


    public  void dec( View view){
        switch (view.getId()){
            case R.id.min:
                count[0]--;
                binding.t1.setText(String.valueOf(count[0]));
                break;
            case R.id.min1:
                count[1]--;
                binding.t2.setText(String.valueOf(count[1]));
                break;
            case R.id.min2:
                count[2]--;
                binding.t3.setText(String.valueOf(count[2]));
                break;
            case R.id.min3:
                count[3]--;
                binding.t4.setText(String.valueOf(count[3]));
                break;
            case R.id.min4:
                count[4]--;
                binding.t5.setText(String.valueOf(count[4]));
                break;
            case R.id.min5:
                count[5]--;
                binding.t6.setText(String.valueOf(count[5]));
                break;
            case R.id.min6:
                count[6]--;
                binding.t7.setText(String.valueOf(count[6]));
                break;
        }
    }

    public  void inc( View view){
        switch (view.getId()){
            case R.id.plus:
                count[0]++;
                binding.t1.setText(String.valueOf(count[0]));
                break;
            case R.id.plus1:
                count[1]++;
                binding.t2.setText(String.valueOf(count[1]));
                break;
            case R.id.plus2:
                count[2]++;
                binding.t3.setText(String.valueOf(count[2]));
                break;
            case R.id.plus3:
                count[3]++;
                binding.t4.setText(String.valueOf(count[3]));
                break;
            case R.id.plus4:
                count[4]++;
                binding.t5.setText(String.valueOf(count[4]));
                break;
            case R.id.plus5:
                count[5]++;
                binding.t6.setText(String.valueOf(count[5]));
                break;
            case R.id.plus6:
                count[6]++;
                binding.t7.setText(String.valueOf(count[6]));
                break;
        }

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.chilli:
                if(count[0]>0) {
                    binding.chilli.setEnabled(false);
                    name = binding.chiliid.getText().toString();
                    cal = Integer.parseInt(binding.chilirup.getText().toString()) * count[0];
                    netprice = cal + netprice;
                    price = name + "\t\t\t\t\t\t\t\tRs " + binding.chilirup.getText().toString() + "\t\t\t\t\t\t\t\t" + count[0] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else{
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.vegmomo:
                if(count[1]>0) {
                    binding.vegmomo.setEnabled(false);
                    name = binding.textView6.getText().toString();
                    cal = Integer.parseInt(binding.textView7.getText().toString()) * count[1];
                    netprice = netprice + cal;
                    price = name + "    \t\t\t\t\t\t\t\tRs " + binding.textView7.getText().toString() + "\t\t\t\t\t\t\t\t" + count[1] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else {
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.frencch:
                if(count[3]>0) {
                    binding.frencch.setEnabled(false);
                    name = binding.textView1.getText().toString();
                    cal = Integer.parseInt(binding.textView3.getText().toString()) * count[3];
                    netprice = netprice + cal;
                    price = name + " \t\t\t\t\t\t\t\tRs " + binding.textView3.getText().toString() + "\t\t\t\t\t\t\t\t" + count[3] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else {
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.roll:
                if (count[4]>0) {
                    binding.roll.setEnabled(false);
                    name = binding.textView18.getText().toString();
                    cal = Integer.parseInt(binding.textView19.getText().toString()) * count[4];

                    netprice = netprice + cal;
                    price = name + "   \t\t\t\t\t\t\t\tRs " + binding.textView19.getText().toString() + "\t\t\t\t\t\t\t\t" + count[4] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else {
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.aloo:
                if (count[2]>0) {
                    binding.aloo.setEnabled(false);
                    name = binding.textView13.getText().toString();
                    cal = Integer.parseInt(binding.textView15.getText().toString()) * count[2];

                    netprice = netprice + cal;
                    price = name + "     \t\t\t\t\t\t\t\tRs " + binding.textView15.getText().toString() + "\t\t\t\t\t\t\t\t" + count[2] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else {
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.chowmein:
                if (count[5]>0) {
                    binding.chowmein.setEnabled(false);
                    name = binding.textViews18.getText().toString();
                    cal = Integer.parseInt(binding.textViews19.getText().toString()) * count[5];
                    netprice = netprice + cal;
                    price = name + "      \t\t\t\t\t\t\t\tRs " + binding.textViews19.getText().toString() + "\t\t\t\t\t\t\t\t" + count[5] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else {
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.man:
                if(count[6]>0) {
                    binding.man.setEnabled(false);
                    name = binding.textView16.getText().toString();
                    cal = Integer.parseInt(binding.textView14.getText().toString()) * count[6];
                    netprice = netprice + cal;
                    price = name + "  \t\t\t\t\t\t\t\tRs " + binding.textView14.getText().toString() + "\t\t\t\t\t\t\t\t" + count[6] + "\t\t\t\tRs " + cal;
                    arrayList.add(price);
                }
                else {
                    Toast.makeText(this, "Select Quantity of item", Toast.LENGTH_SHORT).show();
                }

                break;



        }

    }

}