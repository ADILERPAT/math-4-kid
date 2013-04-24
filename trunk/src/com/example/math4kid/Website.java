package com.example.math4kid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Website extends Activity {
	WebView W;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_website);
		W=(WebView) findViewById(R.id.webView1);
		W.loadUrl("http://www.math-exercises-for-kids.com/");
		
		final Activity activity = this;
	    W.setWebViewClient(new WebViewClient() {
	            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
	                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
	            }
	        });
	
	
	}


		


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.website, menu);
		return true;
	}

}
