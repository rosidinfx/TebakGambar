package com.odin.tebakgambar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

public class GamePlay extends Activity implements OnClickListener{
	Button back,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,vv,w,x,y,z;
	ImageView nyawa[],clue;
	TextView jawab[]=null,level;
	String temp[],jawaban[] = {"KERABAT KERJA","BASIS DATA","MIKRO KOMPUTER",
			"HANTU CODING","METODE NUMERIK","KUDAKI GUNUNG",
			"KUDETA HATI","WATERFALL MODEL","ANAK ILKOM",
			"PERANGKAT LUNAK"};
	char jwbn[];
	int counter,kesempatan = 3,lev = 1;
	LinearLayout jwb;
	boolean salah;
	MediaPlayer bgMusik,btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		jwbn = jawaban[lev-1].toCharArray();
		jawab = new TextView[20];
		RelativeLayout panel = new RelativeLayout(this);
		panel.setBackgroundColor(Color.YELLOW);
		
		bgMusik = MediaPlayer.create(this, R.raw.bgmusik);
		bgMusik.setLooping(true);
		bgMusik.start();
		
		btn = MediaPlayer.create(this, R.raw.button);
		
		jwb = new LinearLayout(this);
		jwb.setY(300);
		panel.addView(jwb);
		
		LinearLayout nyw = new LinearLayout(this);
		nyw.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		nyw.setX(10);
		nyw.setY(5);
		panel.addView(nyw);
		
		nyawa = new ImageView[kesempatan];
		for(int i=0;i<kesempatan;i++){
			nyawa[i] = new ImageView(this);
			nyawa[i].setImageResource(R.drawable.nyawa);
			nyw.addView(nyawa[i]);
		}
		
		level = new TextView(this);
		level.setTextSize(25);
		level.setTextColor(Color.BLUE);
		level.setX(50);
		level.setText("LEVEL : "+lev);
		nyw.addView(level);
		
		clue = new ImageView(this);
		clue.setImageResource(R.drawable.a);
		clue.setX(0);
		clue.setY(60);
		panel.addView(clue);
		
		for(int i=0;i<jawab.length;i++){
			jawab[i] = new TextView(this);
			jawab[i].setTextSize(25);
			jawab[i].setTextColor(Color.BLUE);
			jwb.addView(jawab[i]);
		}
		
		for(int i=0;i<jwbn.length;i++){
			if(jwbn[i]==' '){
				jawab[i].setText("   ");
				counter++;
			}else{
				jawab[i].setText("_ ");
			}
		}
				
		back = new Button(this);
		back.setBackgroundResource(R.drawable.back);
		back.setX(260);
		back.setY(430);
		panel.addView(back);
		back.setOnClickListener(this);
		
		a = new Button(this);
		a.setBackgroundResource(R.drawable.ba);
		a.setX(40);
		a.setY(350);
		panel.addView(a);
		a.setOnClickListener(this);
		
		b = new Button(this);
		b.setBackgroundResource(R.drawable.bb);
		b.setX(66);
		b.setY(350);
		panel.addView(b);
		b.setOnClickListener(this);
		
		c = new Button(this);
		c.setBackgroundResource(R.drawable.bc);
		c.setX(92);
		c.setY(350);
		panel.addView(c);
		c.setOnClickListener(this);
		
		d = new Button(this);
		d.setBackgroundResource(R.drawable.bd);
		d.setX(118);
		d.setY(350);
		panel.addView(d);
		d.setOnClickListener(this);
		
		e = new Button(this);
		e.setBackgroundResource(R.drawable.be);
		e.setX(144);
		e.setY(350);
		panel.addView(e);
		e.setOnClickListener(this);
		
		f = new Button(this);
		f.setBackgroundResource(R.drawable.bf);
		f.setX(170);
		f.setY(350);
		panel.addView(f);
		f.setOnClickListener(this);
		
		g = new Button(this);
		g.setBackgroundResource(R.drawable.bg);
		g.setX(196);
		g.setY(350);
		panel.addView(g);
		g.setOnClickListener(this);
		
		h = new Button(this);
		h.setBackgroundResource(R.drawable.bh);
		h.setX(222);
		h.setY(350);
		panel.addView(h);
		h.setOnClickListener(this);
		
		i = new Button(this);
		i.setBackgroundResource(R.drawable.bi);
		i.setX(248);
		i.setY(350);
		panel.addView(i);
		i.setOnClickListener(this);
		
		j = new Button(this);
		j.setBackgroundResource(R.drawable.bj);
		j.setX(40);
		j.setY(387);
		panel.addView(j);
		j.setOnClickListener(this);
		
		k = new Button(this);
		k.setBackgroundResource(R.drawable.bk);
		k.setX(66);
		k.setY(387);
		panel.addView(k);
		k.setOnClickListener(this);
		
		l = new Button(this);
		l.setBackgroundResource(R.drawable.bl);
		l.setX(92);
		l.setY(387);
		panel.addView(l);
		l.setOnClickListener(this);
		
		m = new Button(this);
		m.setBackgroundResource(R.drawable.bm);
		m.setX(118);
		m.setY(387);
		panel.addView(m);
		m.setOnClickListener(this);
		
		n = new Button(this);
		n.setBackgroundResource(R.drawable.bn);
		n.setX(144);
		n.setY(387);
		panel.addView(n);
		n.setOnClickListener(this);
		
		o = new Button(this);
		o.setBackgroundResource(R.drawable.bo);
		o.setX(170);
		o.setY(387);
		panel.addView(o);
		o.setOnClickListener(this);
		
		p = new Button(this);
		p.setBackgroundResource(R.drawable.bp);
		p.setX(196);
		p.setY(387);
		panel.addView(p);
		p.setOnClickListener(this);
		
		q = new Button(this);
		q.setBackgroundResource(R.drawable.bq);
		q.setX(222);
		q.setY(387);
		panel.addView(q);
		q.setOnClickListener(this);
		
		r = new Button(this);
		r.setBackgroundResource(R.drawable.br);
		r.setX(248);
		r.setY(387);
		panel.addView(r);
		r.setOnClickListener(this);
		
		s = new Button(this);
		s.setBackgroundResource(R.drawable.bs);
		s.setX(40);
		s.setY(424);
		panel.addView(s);
		s.setOnClickListener(this);
		
		t = new Button(this);
		t.setBackgroundResource(R.drawable.bt);
		t.setX(66);
		t.setY(424);
		panel.addView(t);
		t.setOnClickListener(this);
		
		u = new Button(this);
		u.setBackgroundResource(R.drawable.bu);
		u.setX(92);
		u.setY(424);
		panel.addView(u);
		u.setOnClickListener(this);
		
		vv = new Button(this);
		vv.setBackgroundResource(R.drawable.bv);
		vv.setX(118);
		vv.setY(424);
		panel.addView(vv);
		vv.setOnClickListener(this);
		
		w = new Button(this);
		w.setBackgroundResource(R.drawable.bw);
		w.setX(144);
		w.setY(424);
		panel.addView(w);
		w.setOnClickListener(this);
		
		x = new Button(this);
		x.setBackgroundResource(R.drawable.bx);
		x.setX(170);
		x.setY(424);
		panel.addView(x);
		x.setOnClickListener(this);
		
		y = new Button(this);
		y.setBackgroundResource(R.drawable.by);
		y.setX(196);
		y.setY(424);
		panel.addView(y);
		y.setOnClickListener(this);
		
		z = new Button(this);
		z.setBackgroundResource(R.drawable.bz);
		z.setX(222);
		z.setY(424);
		panel.addView(z);
		z.setOnClickListener(this);
		
		setContentView(panel);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		salah = true;
		if(v == a){
			btn.start();
			a.setEnabled(false);
			a.setBackgroundResource(R.drawable.baa);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='A'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == b){
			btn.start();
			b.setEnabled(false);
			b.setBackgroundResource(R.drawable.bbb);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='B'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == c){
			btn.start();
			c.setEnabled(false);
			c.setBackgroundResource(R.drawable.bcc);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='C'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == d){
			btn.start();
			d.setEnabled(false);
			d.setBackgroundResource(R.drawable.bdd);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='D'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == e){
			btn.start();
			e.setEnabled(false);
			e.setBackgroundResource(R.drawable.bee);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='E'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == f){
			btn.start();
			f.setEnabled(false);
			f.setBackgroundResource(R.drawable.bff);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='F'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == g){
			btn.start();
			g.setEnabled(false);
			g.setBackgroundResource(R.drawable.bgg);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='G'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == h){
			btn.start();
			h.setEnabled(false);
			h.setBackgroundResource(R.drawable.bhh);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='H'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == i){
			btn.start();
			i.setEnabled(false);
			i.setBackgroundResource(R.drawable.bii);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='I'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == j){
			btn.start();
			j.setEnabled(false);
			j.setBackgroundResource(R.drawable.bjj);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='J'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == k){
			btn.start();
			k.setEnabled(false);
			k.setBackgroundResource(R.drawable.bkk);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='K'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == l){
			btn.start();
			l.setEnabled(false);
			l.setBackgroundResource(R.drawable.bll);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='L'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == m){
			btn.start();
			m.setEnabled(false);
			m.setBackgroundResource(R.drawable.bmm);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='M'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == n){
			btn.start();
			n.setEnabled(false);
			n.setBackgroundResource(R.drawable.bnn);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='N'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == o){
			btn.start();
			o.setEnabled(false);
			o.setBackgroundResource(R.drawable.boo);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='O'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == p){
			btn.start();
			p.setEnabled(false);
			p.setBackgroundResource(R.drawable.bpp);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='P'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == q){
			btn.start();
			q.setEnabled(false);
			q.setBackgroundResource(R.drawable.bqq);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='Q'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == r){
			btn.start();
			r.setEnabled(false);
			r.setBackgroundResource(R.drawable.brr);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='R'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == s){
			btn.start();
			s.setEnabled(false);
			s.setBackgroundResource(R.drawable.bss);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='S'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == t){
			btn.start();
			t.setEnabled(false);
			t.setBackgroundResource(R.drawable.btt);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='T'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == u){
			btn.start();
			u.setEnabled(false);
			u.setBackgroundResource(R.drawable.buu);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='U'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == vv){
			btn.start();
			vv.setEnabled(false);
			vv.setBackgroundResource(R.drawable.bvv);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='V'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == w){
			btn.start();
			w.setEnabled(false);
			w.setBackgroundResource(R.drawable.bww);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='W'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == x){
			btn.start();
			x.setEnabled(false);
			x.setBackgroundResource(R.drawable.bxx);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='X'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == y){
			btn.start();
			y.setEnabled(false);
			y.setBackgroundResource(R.drawable.byy);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='Y'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == z){
			btn.start();
			z.setEnabled(false);
			z.setBackgroundResource(R.drawable.bzz);
			for(int j=0;j<jwbn.length;j++){
				if(jwbn[j]=='Z'){
					jawab[j].setText(String.valueOf(jwbn[j]));
					counter++;
					salah = false;
				}				
			}
		}
		if(v == back){
			bgMusik.stop();
			btn.start();
			salah = false;
			Intent i = new Intent(GamePlay.this,MainMenu.class);
			finish();
			startActivity(i);
		}
		if(salah == true){
			kesempatan--;
			setNyawa();
			
		}
		if(kesempatan == 0){
			Intent i = new Intent(GamePlay.this,GameOver.class);
			startActivity(i);
			finish();
		}
		if(counter==jwbn.length){
			lev++;
			if(lev==11){
				bgMusik.stop();
				Intent i = new Intent(GamePlay.this,Win.class);
				startActivity(i);
				finish();
			}else{
				acakGambar();
				setButton();
			}
		}
		
	}	
	
	public void setNyawa(){
		for(int i=0; i<3; i++){
			nyawa[i].setImageResource(R.drawable.hilang);
		}
		
		for(int i=0; i<kesempatan; i++){
			nyawa[i].setImageResource(R.drawable.nyawa);
		}
	}
	
	public void acakGambar(){
		counter = 0;
		level.setText("LEVEL : "+lev);
		jwbn = jawaban[lev-1].toCharArray();
		if(lev == 1){
			clue.setImageResource(R.drawable.a);
		}else if(lev == 2){
			clue.setImageResource(R.drawable.b);
		}else if(lev == 3){
			clue.setImageResource(R.drawable.c);
		}else if(lev == 4){
			clue.setImageResource(R.drawable.d);
		}else if(lev == 5){
			clue.setImageResource(R.drawable.e);
		}else if(lev == 6){
			clue.setImageResource(R.drawable.f);
		}else if(lev == 7){
			clue.setImageResource(R.drawable.g);
		}else if(lev == 8){
			clue.setImageResource(R.drawable.h);
		}else if(lev == 9){
			clue.setImageResource(R.drawable.i);
		}else if(lev == 10){
			clue.setImageResource(R.drawable.j);
		}
		
		for(int i=0;i<jawab.length;i++){
			jawab[i].setText("");
		}
		
		for(int i=0;i<jwbn.length;i++){
			if(jwbn[i]==' '){
				jawab[i].setText("   ");
				counter++;
			}else{
				jawab[i].setText("_ ");
			}
		}
	}
	
	public void setButton(){
		a.setEnabled(true);
		a.setBackgroundResource(R.drawable.ba);
		b.setEnabled(true);
		b.setBackgroundResource(R.drawable.bb);
		c.setEnabled(true);
		c.setBackgroundResource(R.drawable.bc);
		d.setEnabled(true);
		d.setBackgroundResource(R.drawable.bd);
		e.setEnabled(true);
		e.setBackgroundResource(R.drawable.be);
		f.setEnabled(true);
		f.setBackgroundResource(R.drawable.bf);
		g.setEnabled(true);
		g.setBackgroundResource(R.drawable.bg);
		h.setEnabled(true);
		h.setBackgroundResource(R.drawable.bh);
		i.setEnabled(true);
		i.setBackgroundResource(R.drawable.bi);
		j.setEnabled(true);
		j.setBackgroundResource(R.drawable.bj);
		k.setEnabled(true);
		k.setBackgroundResource(R.drawable.bk);
		l.setEnabled(true);
		l.setBackgroundResource(R.drawable.bl);
		m.setEnabled(true);
		m.setBackgroundResource(R.drawable.bm);
		n.setEnabled(true);
		n.setBackgroundResource(R.drawable.bn);
		o.setEnabled(true);
		o.setBackgroundResource(R.drawable.bo);
		p.setEnabled(true);
		p.setBackgroundResource(R.drawable.bp);
		q.setEnabled(true);
		q.setBackgroundResource(R.drawable.bq);
		r.setEnabled(true);
		r.setBackgroundResource(R.drawable.br);
		s.setEnabled(true);
		s.setBackgroundResource(R.drawable.bs);
		t.setEnabled(true);
		t.setBackgroundResource(R.drawable.bt);
		u.setEnabled(true);
		u.setBackgroundResource(R.drawable.bu);
		vv.setEnabled(true);
		vv.setBackgroundResource(R.drawable.bv);
		w.setEnabled(true);
		w.setBackgroundResource(R.drawable.bw);
		x.setEnabled(true);
		x.setBackgroundResource(R.drawable.bx);
		y.setEnabled(true);
		y.setBackgroundResource(R.drawable.by);
		z.setEnabled(true);
		z.setBackgroundResource(R.drawable.bz);
	}

}
