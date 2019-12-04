package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.secondassignment.fragments.AreaofCircle;
import com.example.secondassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity{

    Button btnsum,btnareaofcircle,btnreversenumber,btnpalindrome,btnautomorphicnumber,btnreverseofstring;
    private String status="f1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsum=findViewById(R.id.btnadd);
        btnareaofcircle=findViewById(R.id.btnareaofcircle);
        btnreversenumber=findViewById(R.id.btnreverseofnumber);
        btnpalindrome=findViewById(R.id.btnpalindrome);
        btnautomorphicnumber=findViewById(R.id.btnautomophic);
        btnreverseofstring=findViewById(R.id.btnreverseofstring);

       btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment sumFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,sumFragment);
                fragmentTransaction.commit();
            }
            });


        btnareaofcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AreaofCircle areaofCircle=new AreaofCircle();
                fragmentTransaction.replace(R.id.fragmentcontainer,areaofCircle);
                fragmentTransaction.commit();
            }
        });

    }


}
