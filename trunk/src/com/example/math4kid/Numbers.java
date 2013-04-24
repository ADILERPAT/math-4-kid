package com.example.math4kid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Numbers extends Activity implements OnClickListener {
Button opt,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);
		
        opt=(Button) findViewById(R.id.butoption);
        opt.setOnClickListener(this);
        
        b1=(Button) findViewById(R.id.But1);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.But2);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.But3);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.But4);
        b4.setOnClickListener(this);
        b5=(Button) findViewById(R.id.But5);
        b5.setOnClickListener(this);
        
        
        b6=(Button) findViewById(R.id.But6);
        b6.setOnClickListener(this);
        b7=(Button) findViewById(R.id.But7);
        b7.setOnClickListener(this);
        b8=(Button) findViewById(R.id.But8);
        b8.setOnClickListener(this);
        b9=(Button) findViewById(R.id.But9);
        b9.setOnClickListener(this);
        b10=(Button) findViewById(R.id.But10);
        b10.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.numbers, menu);
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
		
		if (R.id.But1 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo1);mp.start();}
		if (R.id.But2 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo2);mp.start();}
		if (R.id.But3 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo3);mp.start();}
		if (R.id.But4 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo4);mp.start();}
		if (R.id.But5 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo5);mp.start();}
		if (R.id.But6 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo6);mp.start();}
		if (R.id.But7 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo7);mp.start();}
		if (R.id.But8 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo8);mp.start();}
		if (R.id.But9 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo9);mp.start();}
		if (R.id.But10 == v.getId())
		{MediaPlayer mp = MediaPlayer.create(this,R.raw.vo10);mp.start();}
		
		
}

}
