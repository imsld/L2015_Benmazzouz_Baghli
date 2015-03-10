package com.example.pfe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Labo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_labo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.labo, menu);
		return true;
	}
	//Donnez la possibilité de cliquer sur le bouton "Profil" 
		public void infobtnaction (View view){
			Intent ouvrirliste = new Intent(Labo.this,Info.class);
			startActivity(ouvrirliste);
		}
		//Donnez la possibilité de cliquer sur le bouton "Rendez-vous" 
			public void rvbtnaction (View view){
				Intent ouvrirliste = new Intent(Labo.this,Rendezvous.class);
				startActivity(ouvrirliste);
			}
			
		//Donnez la possibilité de cliquer sur le bouton "Historique" 
			public void histobtnaction (View view){
				Intent ouvrirliste = new Intent(Labo.this,Historique.class);
				startActivity(ouvrirliste);
					}
						
}
