package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class RadioButtonsExample extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons_example);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        
        switch(view.getId()) {
            case R.id.radioMale:
                if (checked){
                	Utils.showShortToast(this, "Es un " + getString(R.string.male));
                }
                break;
                
            case R.id.radioFemale:
                if (checked) {
                	Utils.showShortToast(this, "Es un " + getString(R.string.female));                	
                }
            	break;
                
            case R.id.radioOther:
                if (checked) {
                	Utils.showShortToast(this, "Es " + getString(R.string.other));
                }
                break;
        }
    }
    
}
