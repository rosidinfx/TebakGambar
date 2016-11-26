package com.odin.tebakgambar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.app.Activity;
import android.content.Intent;

public class Win extends Activity implements OnClickListener {
	Button playagain,exit;
	MediaPlayer bgMusik,btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout panel = new RelativeLayout(this);
		panel.setBackgroundResource(R.drawable.win);
		
		bgMusik = MediaPlayer.create(this, R.raw.bgmusik);
		bgMusik.setLooping(true);
		bgMusik.start();
		
		btn = MediaPlayer.create(this, R.raw.button);
		
		playagain = new Button(this);
		playagain.setX(90);
		playagain.setY(330);
		playagain.setBackgroundResource(R.drawable.playagain);
		panel.addView(playagain);
		playagain.setOnClickListener(this);
		
		exit = new Button(this);
		exit.setX(90);
		exit.setY(390);
		exit.setBackgroundResource(R.drawable.exit1);
		panel.addView(exit);
		exit.setOnClickListener(this);
		
		setContentView(panel);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == playagain){
			bgMusik.stop();
			btn.start();
			Intent i = new Intent(Win.this,GamePlay.class);
			finish();
			startActivity(i);
		}
		if(v == exit){
			bgMusik.stop();
			btn.start();
			finish();
		}
	}

}
