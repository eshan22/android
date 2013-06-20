package com.example.projectone;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
	MediaPlayer mp=MediaPlayer.create(Splash.this,R.raw.sound);
	mp.start();
        Thread my=new Thread()
	{
		@Override
		public void run()
		{
			try
			{
				Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			} 
			finally{
			Intent mi=new Intent("com.example.projectone.MENU");
			startActivity(mi);
			}
		}
	};
	my.start();
	
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}


}