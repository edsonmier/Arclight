package com.example.arclight_tech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    public static boolean isAirpodsEnabled;
    public static boolean isKingstonEnabled;
    public static boolean isAlexaEnabled;
    public static boolean isChromeEnabled;
    public static boolean isTapoEnabled;
    private static int option = 0;

    BottomSheetDialogFragment payout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        payout = new PayoutActivity();
        SwitchCompat airpodsSwitch = (SwitchCompat) findViewById(R.id.airpods_switch);
        airpodsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (isChecked == true){
                   setAirpodsEnabled(true);
                   option = 1;
               } else{
                   setAirpodsEnabled(false);
               }
            }
        });
        SwitchCompat kingstonSwitch = findViewById(R.id.kingston_switch);
        kingstonSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    setKingstonEnabled(true);
                    option = 2;
                } else{
                    setKingstonEnabled(false);
                }
            }
        });
        SwitchCompat alexaSwitch = findViewById(R.id.alexa_switch);
        alexaSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    setAlexaEnabled(true);
                    option = 3;
                } else{
                    setAlexaEnabled(false);
                }
            }
        });
        SwitchCompat chromecastSwitch = findViewById(R.id.chromecast_switch);
        chromecastSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    setChromeEnabled(true);
                    option = 4;
                } else{
                    setChromeEnabled(false);
                }
            }
        });
        SwitchCompat tapoSwitch = findViewById(R.id.tapo_switch);
        tapoSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    setTapoEnabled(true);
                    option = 5;
                } else{
                    setTapoEnabled(false);
                }
            }
        });
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                payout.show(getSupportFragmentManager(), "TAG"); break;
        }
    }

    public static boolean getEnabled(boolean checker) {
        return checker;
    }

    public void setAirpodsEnabled(boolean enabled) {
        isAirpodsEnabled = enabled;
    }

    public void setKingstonEnabled(boolean enabled) {
        isKingstonEnabled = enabled;
    }

    public void setAlexaEnabled(boolean enabled) {
        isAlexaEnabled = enabled;
    }

    public void setChromeEnabled(boolean enabled) {
        isChromeEnabled = enabled;
    }

    public void setTapoEnabled(boolean enabled) {
        isTapoEnabled = enabled;
    }

    public static int getOption() {
        return option;
    }

    public static void setOption(int option) {
        MainActivity.option = option;
    }
}