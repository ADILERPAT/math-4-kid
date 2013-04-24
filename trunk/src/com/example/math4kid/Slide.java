package com.example.math4kid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Slide extends Activity implements OnClickListener {
Button number,multi,main,opt,addition,conver,website1,cred;

    @SuppressLint("CutPasteId") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        
        main=(Button) findViewById(R.id.butmainmenu);
        main.setOnClickListener(this);
        opt=(Button) findViewById(R.id.butoption);
        opt.setOnClickListener(this);
        number=(Button) findViewById(R.id.butnumber);
        number.setOnClickListener(this);
        multi=(Button) findViewById(R.id.butmult);
        multi.setOnClickListener(this);
        addition=(Button) findViewById(R.id.butaddition);
        addition.setOnClickListener(this);
        conver=(Button) findViewById(R.id.butconversion);
        conver.setOnClickListener(this);
        website1=(Button) findViewById(R.id.butwebsite);
        website1.setOnClickListener(this);
        cred=(Button) findViewById(R.id.butcred);
        cred.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_slide, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (R.id.butoption == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			Intent slide = new Intent(this,Slide.class);
			startActivity(slide);
		}
		if (R.id.butmainmenu == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			Intent main = new Intent(this,MainActivity.class);
			startActivity(main);
		}

		if (R.id.butnumber == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			Intent main = new Intent(this,Numbers.class);
			startActivity(main);
		}
		if (R.id.butmult == v.getId())
		{
			MediaPlayer multi = MediaPlayer.create(this,R.raw.click);
			multi.start();
			Intent main = new Intent(this,Multiplication.class);
			startActivity(main);
		}
		if (R.id.butaddition == v.getId())
		{
			MediaPlayer add = MediaPlayer.create(this,R.raw.click);
			add.start();
			Intent main = new Intent(this,Addition.class);
			startActivity(main);
		}
		if (R.id.butconversion == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			Intent main = new Intent(this,Conversion.class);
			startActivity(main);
		}
		if (R.id.butwebsite == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			Intent main = new Intent(this,Website.class);
			startActivity(main);	
		}
		if (R.id.butcred == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			setContentView(R.layout.test);
	        opt=(Button) findViewById(R.id.butoption);
	        opt.setOnClickListener(this);
		}
	}
}
