package com.example.math4kid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
Button go;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        go=(Button) findViewById(R.id.butcred);
        go.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (R.id.butcred == v.getId())
		{
			MediaPlayer mp = MediaPlayer.create(this,R.raw.click);
			mp.start();
			Intent slide = new Intent(this,Slide.class);
			startActivity(slide);
		}
	}
}
