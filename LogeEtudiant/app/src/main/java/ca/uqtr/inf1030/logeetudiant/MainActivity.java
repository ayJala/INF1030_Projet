package ca.uqtr.inf1030.logeetudiant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case R.id.optionInscription:
                Toast.makeText(this, R.string.consigneAjoutLogement,
                        Toast.LENGTH_SHORT).show();
                Intent intentAjoutLogement = new Intent(getApplicationContext(), AjoutLogement.class);
                startActivity(intentAjoutLogement);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
