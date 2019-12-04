package com.example.secondassignment.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener {

     EditText etfirst,etsecond;
     Button btnadd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btnadd=view.findViewById(R.id.btnaddnums);
        btnadd.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first= Integer.parseInt(etfirst.getText().toString());
        int second= Integer.parseInt(etsecond.getText().toString());
        int result=first+second;
        Toast.makeText(getActivity(), "Sum of these numbers are"+result, Toast.LENGTH_SHORT).show();
        
    }
}
