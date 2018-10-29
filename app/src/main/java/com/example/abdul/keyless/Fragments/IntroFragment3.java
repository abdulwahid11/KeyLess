package com.example.abdul.keyless.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abdul.keyless.R;

public class IntroFragment3 extends Fragment {
    private TextView tos;
    private CheckBox read;
    private boolean checked = false;
    private Button signUpBtn;
    private TextView moreDetails;

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.app_intro3, container, false);
        signUpBtn=(Button)view.findViewById(R.id.btnSignUp);
        moreDetails=(TextView)view.findViewById(R.id.moreDetails);
        moreDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "More Details clicked", Toast.LENGTH_SHORT).show();
            }
        });
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "SignUpClicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
