package com.gmail.plaza.kaam.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.gmail.plaza.kaam.R;
import com.gmail.plaza.kaam.activities.household_employee.LoginHouseholdEmployeeActivity;
import com.gmail.plaza.kaam.activities.household_employee.RegisterHouseholdEmployeeActivity;
import com.gmail.plaza.kaam.activities.household_employer.LoginHouseholdEmployerActivity;
import com.gmail.plaza.kaam.activities.household_employer.RegisterHouseholdEmployerActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HouseholdEmployerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HouseholdEmployerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button login;
    private Button register;

    public HouseholdEmployerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HouseholdEmployerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HouseholdEmployerFragment newInstance(String param1, String param2) {
        HouseholdEmployerFragment fragment = new HouseholdEmployerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_employer_household, container, false);
        login = v.findViewById(R.id.login);
        register = v.findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(getContext(), LoginHouseholdEmployerActivity.class);
                startActivity(loginIntent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(getContext(), RegisterHouseholdEmployerActivity.class);
                startActivity(registerIntent);
            }
        });
        return v;
    }
}