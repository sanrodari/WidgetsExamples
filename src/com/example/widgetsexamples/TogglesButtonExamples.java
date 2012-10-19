package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class TogglesButtonExamples extends Activity implements OnCheckedChangeListener {

	private ToggleButton toggleButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggles_button_examples);
        
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton.setOnCheckedChangeListener(this);
    }
    
    public void onToggleClicked(View view) {
    	ToggleButton toggleButton = (ToggleButton) view;
        
        if (toggleButton.isChecked()) {
        	Utils.showShortToast(this, R.string.vibration_on);
        } else {
        	Utils.showShortToast(this, R.string.vibration_off);
        }
    }

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(isChecked) {
			Utils.showShortToast(this, R.string.vibration_on);
		}
		else {
			Utils.showShortToast(this, R.string.vibration_off);
		}
	}
    
}
