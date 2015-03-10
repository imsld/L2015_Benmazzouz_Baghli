package com.example.pfe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Diagnostique extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diagnostique);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.diagnostique, menu);
		return true;
	}
	//Donnez la possibilité de cliquer sur le bouton "Rechercher" 
		public void recherchebtnaction (View view){
			Intent ouvrirliste = new Intent(Diagnostique.this,Recherche1.class);
			startActivity(ouvrirliste);
	    }
    //Donnez la possibilité de cliquer sur le bouton "Prescrire" 
		public void prescrirebtnaction (View view){
			Intent ouvrirliste = new Intent(Diagnostique.this,Prescription.class);
			startActivity(ouvrirliste);
	}
		
		
}
