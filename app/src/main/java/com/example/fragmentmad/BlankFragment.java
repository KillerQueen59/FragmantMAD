package com.example.fragmentmad;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    private View view;
    private Button btn1;
    private ImageView imageView;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        btn1 = view.findViewById(R.id.fragmentButton);
        imageView = view.findViewById(R.id.imageFragment);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }

}
