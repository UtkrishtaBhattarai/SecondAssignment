package com.example.secondassignment.fragments;


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
public class AreaofCircle extends Fragment implements View.OnClickListener {

    EditText etareacric;
    Button btnareacric;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_areaof_circle, container, false);
        etareacric=view.findViewById(R.id.etnareacirc);
        btnareacric=view.findViewById(R.id.btnareacirc);
        btnareacric.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius=Integer.parseInt(etareacric.getText().toString());
        int result=radius*radius*(22/7);

        Toast.makeText(getActivity(), "Area of Circle is "+result, Toast.LENGTH_SHORT).show();
    }
}
