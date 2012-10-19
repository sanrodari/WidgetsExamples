package com.example.widgetsexamples;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class SubmenuAndGroupsExamples extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_and_groups_examples);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_submenu_and_groups_examples, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Class<?> activity = null;
    	switch (item.getItemId()) {
    	case R.id.action1:
		case R.id.action2:
			Utils.showShortToast(this, R.string.action_was_selected);
			return true;
		case R.id.actionButtons:
			activity = ButtonExamples.class;
			break;
		case R.id.actionCheckboxes:
			activity = CheckboxesExample.class;
			break;
		case R.id.actionEditTexts:
			activity = EditTextsExamples.class;
			break;
		case R.id.actionPickersExamples:
			activity = PickersExamples.class;
			break;
		case R.id.actionRadioButtonsExamples:
			activity = RadioButtonsExample.class;
			break;
		case R.id.actionSpinnerExample:
			activity = SpinnerExample.class;
			break;
		case R.id.actionTogglesButtonExamples:
			activity = TogglesButtonExamples.class;
			break;
		default:
			return super.onOptionsItemSelected(item);
		}
    	
    	goToActivity(activity);
    	return true;
    }
    
    private void goToActivity(Class<?> activity) {
    	Intent intent = new Intent(this, activity);
    	startActivity(intent);
	}
}
