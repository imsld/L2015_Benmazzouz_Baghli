package com.example.pfe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	//Donnez la possibilité de cliquer sur le bouton "Se connecter" 
		public void connexionbtnaction (View view){
			Intent ouvrirliste = new Intent(MainActivity.this,Medecin.class);
			startActivity(ouvrirliste);
		}
    //Donnez la possibilité de cliquer sur "Créer un Compte" 
		public void inscriptionbtnaction (View view){
			Intent ouvrirliste = new Intent(MainActivity.this,Inscription.class);
			startActivity(ouvrirliste);
		}
}
