package com.example.testprosjekt;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	CharSequence[] items = {"Google", "Apple", "Microsoft"};
	
	boolean [] itemsChecked = new boolean[items.length];
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClick(View v) {
		showDialog(0);
	}
	@Override
	protected Dialog onCreateDialog(int id) {
		switch(id) {
		case 0:
			return new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher)
					.setTitle("This is a dialog with some simple text!")
					.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int whichButton) 
						{
							Toast.makeText(getBaseContext(), "OK clicked!", Toast.LENGTH_SHORT).show();
						}
					}
					)
					.setNegativeButton("Cancel",
							new DialogInterface.OnClickListener() {
								
								public void onClick(DialogInterface dialog, int whichButton) 
								{
									Toast.makeText(getBaseContext(), "Cancel clicked", Toast.LENGTH_SHORT).show();
								}
							}
					)
					.setMultiChoiceItems(items, itemsChecked,
							new DialogInterface.OnMultiChoiceClickListener() {
						public void onClick(DialogInterface dialog, int which, boolean isChecked) {
							Toast.makeText(getBaseContext(), items[which] + (isChecked ? " checked!":" unchecked!"), Toast.LENGTH_SHORT).show();
						}
					}
					).create();
		}
		return null;
	}
}
					
    
    
//    public void onStart() {
//    	super.onStart();
//    	Log.d(tag,"In the onStart() event");
//    }
//    
//    public void onRestart() {
//    	super.onRestart();
//    	Log.d(tag,"In the onResetart() event");
//    }
//    
//    public void onResume() {
//    	super.onResume();
//    	Log.d(tag,"In the onResume() event");
//    }
//    
//    public void onPause() {
//    	super.onPause();
//    	Log.d(tag,"In the onPause() event");
//    }
//    
//    public void onStop() {
//    	super.onStop();
//    	Log.d(tag,"In the onStop() event");
//    }
//    
//    public void onDestroy() {
//    	super.onDestroy();
//    	Log.d(tag,"In the onDestroy() event");
//    }
