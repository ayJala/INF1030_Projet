package ca.uqtr.inf1030.logeetudiant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ListeAnnonces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_annonces);

        final Activity act = this;
  //      act.setTitle(R.string.titre_liste_annonces);

        RecyclerView rv = (RecyclerView) findViewById(R.id.liste);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new AdapteurListe());

    }

}
