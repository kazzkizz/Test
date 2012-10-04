package com.example.testprosjekt;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	CharSequence[] items = {"Low intensity", "Medium intensity", "High intensity"};
	
	boolean [] itemsChecked = new boolean[items.length];
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
//	public void onClick(View v) {
//		showDialog(0);
//	}
}
//	@Override
//	protected Dialog onCreateDialog(int id) {
//		switch(id) {
//		case 0:
//			return new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher)
//					.setTitle("This is a dialog with some simple text!")
//					.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//						public void onClick(DialogInterface dialog, int whichButton) 
//						{
//							Toast.makeText(getBaseContext(), "OK clicked!", Toast.LENGTH_SHORT).show();
//						}
//					}
//					)
//					.setNegativeButton("Cancel",
//							new DialogInterface.OnClickListener() {
//								
//								public void onClick(DialogInterface dialog, int whichButton) 
//								{
//									Toast.makeText(getBaseContext(), "Cancel clicked", Toast.LENGTH_SHORT).show();
//								}
//							}
//					)
//					.setItems(items, new DialogInterface.OnClickListener() {
//						
//						public void onClick(DialogInterface dialog, int which) {
//							Toast.makeText(getBaseContext(), items[which], Toast.LENGTH_SHORT).show();
//						}
//					})
//					
					//Multichoice list:
//					.setMultiChoiceItems(items, itemsChecked,
//							new DialogInterface.OnMultiChoiceClickListener() {
//						public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//							Toast.makeText(getBaseContext(), items[which] + (isChecked ? " checked!":" unchecked!"), Toast.LENGTH_SHORT).show();
//						}
					
//					.create();
//		}
//		return null;
//	}
//}
