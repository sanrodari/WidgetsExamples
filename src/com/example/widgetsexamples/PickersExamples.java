package com.example.widgetsexamples;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class PickersExamples extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickers_examples);
    }
    
    public void showDatePicker(View view) {
    	DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    
    public void showTimePicker(View view) {
    	DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

}

class TimePickerFragment extends DialogFragment implements OnTimeSetListener {
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// Se usa el tiempo actual como valor por defecto.
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Se crea una instancia del picker y se retorna.
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

	@Override
	public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
		Utils.showShortToast(getActivity(), "Hora: " + hourOfDay + " minuto: " + minute);
	}
	
}

class DatePickerFragment extends DialogFragment implements OnDateSetListener {
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// Se usa el tiempo actual como valor por defecto.
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Se crea una instancia del picker y se retorna.
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear,
			int dayOfMonth) {
		// Los meses empiezan desde cero: Enero es el mes 0, Diciembre el mes 11.
		Utils.showShortToast(getActivity(), "Año: " + year + " mes: " + monthOfYear + " día " + dayOfMonth);
	}

	
}