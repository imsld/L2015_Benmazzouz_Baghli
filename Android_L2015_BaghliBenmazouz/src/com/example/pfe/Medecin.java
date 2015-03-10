package com.example.pfe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Medecin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_medecin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.medecin, menu);
		return true;
	}
	//Donnez la possibilité de cliquer sur le bouton "Profil" 
	public void infobtnaction (View view){
		Intent ouvrirliste = new Intent(Medecin.this,Info.class);
		startActivity(ouvrirliste);
	}
	//Donnez la possibilité de cliquer sur le bouton "Rendez-vous" 
		public void rvbtnaction (View view){
			Intent ouvrirliste = new Intent(Medecin.this,Rendezvous.class);
			startActivity(ouvrirliste);
		}
		
	//Donnez la possibilité de cliquer sur le bouton "Historique" 
		public void histobtnaction (View view){
			Intent ouvrirliste = new Intent(Medecin.this,Historique.class);
			startActivity(ouvrirliste);
				}
					
}
