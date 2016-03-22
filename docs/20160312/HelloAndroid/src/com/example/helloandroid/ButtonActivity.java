package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ButtonActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setTitle("hello");
		setContentView(R.layout.activity_button);
	}

}
