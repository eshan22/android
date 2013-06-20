package com.example.projectone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends Activity implements android.view.View.OnClickListener{
static int count=0;
TextView tv;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
Button b1=(Button)findViewById(R.id.add);
Button b2=(Button)findViewById(R.id.sub);
tv=(TextView)findViewById(R.id.tv);
b1.setOnClickListener(this);
b2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		if(arg0.getId()==R.id.add)
		{
			count++;
			tv.setText("Your total is "+count);
		}
		else
		{
			count--;
			tv.setText("Your total is "+count);
				
		}
	}


	    
}
