package com.odin.tebakgambar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class AboutUS extends Activity implements OnClickListener{
	Button back;
	MediaPlayer bgMusik,btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		LinearLayout panel = new LinearLayout(this);
		panel.setBackgroundResource(R.drawable.bgabout);
		
		bgMusik = MediaPlayer.create(this, R.raw.bgmusik);
		bgMusik.setLooping(true);
		bgMusik.start();
		
		btn = MediaPlayer.create(this, R.raw.button);
		
		back = new Button(this);
		back.setBackgroundResource(R.drawable.back);
		back.setX(20);
		back.setY(410);
		panel.addView(back);
		back.setOnClickListener(this);
		
		setContentView(panel);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		bgMusik.stop();
		btn.start();
		Intent i = new Intent(AboutUS.this,MainMenu.class);
		finish();
		startActivity(i);		
	}

}
