package com.example.arclight_tech;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.*;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PayoutActivity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PayoutActivity extends BottomSheetDialogFragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static boolean airpods;
    private static boolean kingston;
    private static boolean alexa;
    private static boolean chrome;
    private static boolean tapo;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PayoutActivity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PayoutActivity.
     */
    // TODO: Rename and change types and number of parameters
    public static PayoutActivity newInstance(String param1, String param2) {
        PayoutActivity fragment = new PayoutActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void checkEnabled(){
        if (MainActivity.getEnabled(MainActivity.isAirpodsEnabled)){
            airpods = true;
        } else{
            airpods = false;
        }
        if (MainActivity.getEnabled(MainActivity.isKingstonEnabled)){
            kingston = true;
        } else{
            kingston = false;
        }
        if (MainActivity.getEnabled(MainActivity.isAlexaEnabled)){
            alexa = true;
        } else{
            alexa = false;
        }
        if (MainActivity.getEnabled(MainActivity.isChromeEnabled)){
            chrome = true;
        } else{
            chrome = false;
        }
        if (MainActivity.getEnabled(MainActivity.isTapoEnabled)){
            tapo = true;
        } else{
            tapo = false;
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        checkEnabled();
        makeChanges();
    }

    public void makeChanges(){
        if (airpods){
            getView().findViewById(R.id.item_1).setVisibility(View.VISIBLE);
        } else {
            getView().findViewById(R.id.item_1).setVisibility(View.GONE);
        }
        if (kingston){
            getView().findViewById(R.id.item_2).setVisibility(View.VISIBLE);
        } else{
            getView().findViewById(R.id.item_2).setVisibility(View.GONE);
        }
        if (alexa){
            getView().findViewById(R.id.item_3).setVisibility(View.VISIBLE);
        } else{
            getView().findViewById(R.id.item_3).setVisibility(View.GONE);
        }
        if (chrome){
            getView().findViewById(R.id.item_4).setVisibility(View.VISIBLE);
        } else{
            getView().findViewById(R.id.item_4).setVisibility(View.GONE);
        }
        if (tapo){
            getView().findViewById(R.id.item_5).setVisibility(View.VISIBLE);
        } else{
            getView().findViewById(R.id.item_5).setVisibility(View.GONE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payout_activity, container, false);
    }
}