package com.example.abdlpottytimer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	/* Diaper */
	public void outcome0(View view) {
	    // Do something in response to button
		    Intent intent = new Intent(this, OutCome0.class);
		    startActivity(intent);
		}
	
	/* Training Pants */
	public void outcome2(View view) {
	    // Do something in response to button
		    Intent intent = new Intent(this, OutCome2.class);
		    startActivity(intent);
		}
	
	/* Big Kid */
	public void outcome3(View view) {
	    // Do something in response to button
		    Intent intent = new Intent(this, OutCome3.class);
		    startActivity(intent);
		}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}