package com.example.widgetsexamples;

import android.content.Context;
import android.widget.Toast;

public class Utils {
	
	public static void showShortToast(Context context, int message) {
		Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}
	
	public static void showShortToast(Context context, String message) {
		Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}

}
