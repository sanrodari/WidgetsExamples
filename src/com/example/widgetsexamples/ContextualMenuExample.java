package com.example.widgetsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContextualMenuExample extends Activity implements OnItemClickListener {

	private ListView listView;
	private ArrayAdapter<CharSequence> adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contextual_menu_example);

		listView = (ListView) findViewById(R.id.listView);
		adapter = ArrayAdapter.createFromResource(this,
				R.array.cities_array, android.R.layout.simple_list_item_1);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
		
		// Se registra la lista para que los items tenga el menú contextual.
		registerForContextMenu(listView);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		
		getMenuInflater().inflate(R.menu.activity_contextual_menu_example, menu);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
	    switch (item.getItemId()) {
	        case R.id.actionSearch:
	        	String searchingFor = getString(R.string.searching_for);
	            Utils.showShortToast(this, searchingFor + " "  + adapter.getItem(info.position) );
	            return true;
	        case R.id.actionEcho:
	        	String echoing = getString(R.string.echoing);
	        	Utils.showShortToast(this, echoing + " " + adapter.getItem(info.position));
	            return true;
	        default:
	            return super.onContextItemSelected(item);
	    }
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		String echoing = getString(R.string.echoing);
		Utils.showShortToast(this, echoing + " " + adapter.getItem(arg2));
	}

}
