package com.example.math4kid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Addition extends Activity implements OnClickListener {
Button opt,music;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addition);
		
        opt=(Button) findViewById(R.id.butoption);
        opt.setOnClickListener(this);
        music=(Button) findViewById(R.id.butmusic);
        music.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addition, menu);
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
		if (R.id.butmusic == v.getId())
		{
			MediaPlayer music = MediaPlayer.create(this,R.raw.addclick);
			music.start();
		}
}

}
