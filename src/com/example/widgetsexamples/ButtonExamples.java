package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonExamples extends Activity implements OnClickListener {

    private Button button1;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_examples);
        
        // Por medio de onClickListener
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }
	
	public void receiveClick(View view) {
		Utils.showShortToast(this, R.string.with_onclick_attribute);
	}
	
	public void closeClick(View view) {
		Utils.showShortToast(this, R.string.close);
	}
	
	public void borderlessClick(View view) {
		Utils.showShortToast(this, R.string.borderless_button);
	}
	
    // Por medio de onClickListener
	@Override
	public void onClick(View v) {
		Utils.showShortToast(this, R.string.with_onclick_listener);
	}
}
