package com.odin.tebakgambar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LinearLayout panelLayout = new LinearLayout(this);
		panelLayout.setBackgroundResource(R.drawable.flashscreen);
		setContentView(panelLayout);
		Thread background = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    Intent i=new Intent(MainActivity.this,MainMenu.class);
                    startActivity(i);
                     
                    finish();
                } catch (Exception e) {}
            }
        };
         
        background.start();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
