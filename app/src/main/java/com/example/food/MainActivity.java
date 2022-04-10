package com.example.food;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

import com.example.food.databinding.ActivityMainBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int count=0;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<EditText> arrayList=new ArrayList();
        arrayList.add(binding.editTextTextPersonName);
        arrayList.add(binding.editTextTextPersonName2);
        arrayList.add(binding.editTextTextEmailAddress);
        arrayList.add(binding.editTextPhone);
        firebaseDatabase=FirebaseDatabase.getInstance();


        reference=firebaseDatabase.getReference("user");
        binding.button.setOnClickListener(view -> {

            for(EditText e:arrayList){

                String text=e.getText().toString().trim();
                if(text.length()==0){
                    Toast.makeText(this, "Data required in all field", Toast.LENGTH_SHORT).show();
                    count++;
                }

                else if(binding.editTextPhone.getId()==e.getId()){

                    if(text.length()!=10){
                        count++;
                        e.setError("Invalid number");
                    }
                }
                 else if(binding.editTextTextEmailAddress.getId()==e.getId()){

                     if(!Patterns.EMAIL_ADDRESS.matcher(e.getText()).matches()){
                        e.setError("Invalid email address");
                         count++;
                    }
                }else {
                     count=0;
                }

            }
            if(count==0){
                user u=new user();
                u.setUname(binding.editTextTextPersonName.getText().toString());
                u.setAddress(binding.editTextTextPersonName2.getText().toString());
                u.setPhone(Long.parseLong(binding.editTextPhone.getText().toString()));
                u.setEmail(binding.editTextTextEmailAddress.getText().toString());
                reference.setValue(u);
 //               Toast.makeText(MainActivity.this, "Data is added to databases", Toast.LENGTH_SHORT).show();

//                reference.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });
                Intent in =new Intent(getApplicationContext(),MainActivity2food.class);
                Toast.makeText(this, "SUCCESSFULLY REGISTERED", Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
         });
    }
}