package com.odin.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainMenu extends Activity implements OnClickListener{
	Button play,about,exit;
	TextView judul;
	MediaPlayer bgMusik,btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout panel = new RelativeLayout(this);
		panel.setBackgroundResource(R.drawable.mainmenu);
		panel.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		
		bgMusik = MediaPlayer.create(this, R.raw.bgmusik);
		bgMusik.setLooping(true);
		bgMusik.start();
		
		btn = MediaPlayer.create(this, R.raw.button);
		
		play = new Button(this);
		play.setX(90);
		play.setY(270);
		play.setBackgroundResource(R.drawable.play);
		panel.addView(play);
		
		about = new Button(this);
		about.setX(90);
		about.setY(330);
		about.setBackgroundResource(R.drawable.about);
		panel.addView(about);
		
		exit = new Button(this);
		exit.setX(90);
		exit.setY(390);
		exit.setBackgroundResource(R.drawable.exit);
		panel.addView(exit);
		
		play.setOnClickListener(this);
		about.setOnClickListener(this);
		exit.setOnClickListener(this);
		
		this.setContentView(panel);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == play){
			bgMusik.stop();
			btn.start();
			Intent i = new Intent(MainMenu.this,GamePlay.class);
			finish();
			startActivity(i);
		}
		if(v == about){
			bgMusik.stop();
			btn.start();
			Intent i = new Intent(MainMenu.this,AboutUS.class);
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
