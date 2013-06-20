package com.example.projectone;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextPlay extends Activity {
	public void onCreate(Bundle ins)
	{
		super.onCreate(ins);
		setContentView(R.layout.activity_textplay);
		Button b=(Button)findViewById(R.id.b);
		final TextView tv=(TextView)findViewById(R.id.tv);
		final EditText ed=(EditText)findViewById(R.id.et);
	b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		
			String text=ed.getText().toString();
			if(text.equalsIgnoreCase("WTF"))
			{
				tv.setText("WTF");
				Random r=new Random();
				tv.setTextColor(Color.rgb(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
				tv.setTextSize(r.nextInt(70));
			switch(r.nextInt(3))
				{
					case 1:	
				tv.setGravity(Gravity.LEFT);
				break;
				case 2:	
					tv.setGravity(Gravity.CENTER);
					break;
					case 3:	
						tv.setGravity(Gravity.RIGHT);
						break;
						
				}
			}
		}
	});
	}

}
