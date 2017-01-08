package com.keskin.vizefinalhesap;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Settings extends Activity 
	{
	

		
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			this.setTheme(R.style.SettingsTheme);
			setContentView(R.layout.settings);
			

		}
	public void set1 (View view){
		SharedPreferences.Editor editor = getSharedPreferences("notsistemi", MODE_PRIVATE).edit();
		editor.putInt("sistem",1);
		editor.commit();
		TextView durum = (TextView) findViewById(R.id.Durum);
	    durum.setText("Not sistemi 1 ayarlandı");
	}
	public void set2 (View view){
		SharedPreferences.Editor editor = getSharedPreferences("notsistemi", MODE_PRIVATE).edit();
		editor.putInt("sistem",2);
		editor.commit();
		TextView durum = (TextView) findViewById(R.id.Durum);
	    durum.setText("Not sistemi 2 ayarlandı");
	}
}
