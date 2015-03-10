package com.example.pfe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Patient extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patient);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.patient, menu);
		return true;
	}
	//Donnez la possibilité de cliquer sur le bouton "Profil" 
	public void infobtnaction (View view){
		Intent ouvrirliste = new Intent(Patient.this,Info.class);
		startActivity(ouvrirliste);

}
	//Donnez la possibilité de cliquer sur le bouton "Recherche" 
		public void recherchebtnaction (View view){
			Intent ouvrirliste = new Intent(Patient.this,Recherche.class);
			startActivity(ouvrirliste);

	}
	//Donnez la possibilité de cliquer sur le bouton "Prescription active" 
		public void prescriptionactivebtnaction (View view){
			Intent ouvrirliste = new Intent(Patient.this,Prescriptionac.class);
			startActivity(ouvrirliste);

			}
	//Donnez la possibilité de cliquer sur le bouton "Historique" 
		public void hisbtnaction (View view){
			Intent ouvrirliste = new Intent(Patient.this,Prescriptionac.class);
			startActivity(ouvrirliste);

			}
}
