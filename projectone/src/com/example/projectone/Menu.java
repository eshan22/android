package com.example.projectone;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {
String arr[]={"START","TEXTPLAY","SCROLL","CAMERA"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1,arr));	
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
String act=arr[position];
Intent my=new Intent("com.example.projectone."+act);
startActivity(my);
	}

	

}
