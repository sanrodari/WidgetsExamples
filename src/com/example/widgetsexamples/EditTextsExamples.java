package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class EditTextsExamples extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_texts_examples);

        // Se configura el adaptador para poner el autocompletado.
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
		String[] countries = getResources().getStringArray(
				R.array.cities_array);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, countries);
		textView.setAdapter(adapter);
    }

}
