package ca.uqtr.inf1030.logeetudiant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AjoutLogement extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_logement);

    }
}
