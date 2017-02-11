package ca.uqtr.inf1030.logeetudiant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

// Classe qui gère le cas d'ajout d'un logement
public class AjoutLogement extends AppCompatActivity implements View.OnClickListener{

    private TextView mTextView;
    private String[] listeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_logement);
        final Activity act = this;
        act.setTitle(R.string.ajoutLogement);


// Chargement de la liste des types de logement
        this.listeType = new String[] {"-", "Chambre", "1½", "2½", "3½", "4½", "5½", "Autre" };
        Spinner spType = (Spinner) findViewById(R.id.spinnerType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listeType);
        spType.setAdapter(adapter);

// Listeners

        Button btAjout = (Button) findViewById(R.id.buttonSave);
        btAjout.setOnClickListener(this);

        Button btCancel = (Button) findViewById(R.id.buttonCancel);
        btCancel.setOnClickListener(this);

    }

    private void actionSauvegarder(){
        Toast.makeText(this, R.string.confirmationEnregistrer, Toast.LENGTH_SHORT).show() ;
        finish();
    }

 // Événements
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSave: actionSauvegarder();
                break;
            case R.id.buttonCancel: finish();
        }
    }

}
