package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class CheckboxesExample extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes_example);
    }

    public void checkBoxClick(View view) {
    	CheckBox checkBox = (CheckBox) view;
    	
    	String selectedOrDeselectedCB = "";
    	switch (checkBox.getId()) {
		case R.id.checkBoxEnglish:
			selectedOrDeselectedCB = getString(R.string.english);
			break;
		case R.id.checkBoxFrench:
			selectedOrDeselectedCB = getString(R.string.french);
			break;
		case R.id.checkBoxGerman:
			selectedOrDeselectedCB = getString(R.string.german);		
			break;
		case R.id.checkBoxSpanish:
			selectedOrDeselectedCB = getString(R.string.spanish);
			break;
		}
    	
    	Utils.showShortToast(this, "La casilla " + selectedOrDeselectedCB + " está " + (checkBox.isChecked() ? "seleccionada" : "deseleccionada"));
    }
}
