package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerExample extends Activity implements OnItemSelectedListener {

	private Spinner spinner;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner_example);

		spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.cities_array,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
	}

	public void onItemSelected(AdapterView<?> parent, View view, 
			int pos, long id) {
		String selectedCity = parent.getSelectedItem().toString();
		String message = getString(R.string.selected_city_is);
		Utils.showShortToast(this, message + " " + selectedCity);
	}
	
	public void onNothingSelected(AdapterView<?> parent) {
		Utils.showShortToast(this, R.string.there_is_no_selected_city);
	}
	
}
