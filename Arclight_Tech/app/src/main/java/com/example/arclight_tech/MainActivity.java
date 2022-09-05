package com.example.arclight_tech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    BottomSheetDialogFragment payout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        payout = new PayoutActivity();
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                payout.show(getSupportFragmentManager(), "TAG"); break;
        }
    }
}