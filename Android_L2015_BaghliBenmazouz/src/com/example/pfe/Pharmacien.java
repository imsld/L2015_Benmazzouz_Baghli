package com.example.pfe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Pharmacien extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pharmacien);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pharmacien, menu);
		return true;
	}
	//Donnez la possibilité de cliquer sur le bouton "Info" 
	public void infobtnaction (View view){
		Intent ouvrirliste = new Intent(Pharmacien.this,Info.class);
		startActivity(ouvrirliste);
    }
	//Donnez la possibilité de cliquer sur le bouton "Historique médicaments" 
		public void historiqueprescbtnaction (View view){
			Intent ouvrirliste = new Intent(Pharmacien.this,Historique.class);
			startActivity(ouvrirliste);
	    }
		//Donnez la possibilité de cliquer sur le bouton "Clients" 
		public void clientbtnaction (View view){
			Intent ouvrirliste = new Intent(Pharmacien.this,Clients.class);
			startActivity(ouvrirliste);
	    }


}
