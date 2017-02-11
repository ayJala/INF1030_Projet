package ca.uqtr.inf1030.logeetudiant;

/**
 * Created by Denis Beaudoin on 2017-02-11.
 */

import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class AdapteurListe extends RecyclerView.Adapter<AdapteurListe.MyViewHolder> {

    private final List<Pair<String, String>> tempObject = Arrays.asList(
            Pair.create("1 km", "Logement #1 320$/mois 2 et demi"),
            Pair.create("2 km", "Logement #2 435&/mois 3 et demi"),
            Pair.create("3 km", "Logement #3 388$/mois autre"),
            Pair.create("1 km", "Logement #1 320$/mois 2 et demi"),
            Pair.create("2 km", "Logement #2 435&/mois 3 et demi"),
            Pair.create("3 km", "Logement #3 388$/mois autre"),
            Pair.create("1 km", "Logement #1 320$/mois 2 et demi"),
            Pair.create("2 km", "Logement #2 435&/mois 3 et demi"),
            Pair.create("3 km", "Logement #3 388$/mois autre"),
            Pair.create("1 km", "Logement #1 320$/mois 2 et demi"),
            Pair.create("2 km", "Logement #2 435&/mois 3 et demi"),
            Pair.create("3 km", "Logement #3 388$/mois autre")
    );

    @Override
    public int getItemCount() {
        return tempObject.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.liste_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, String> pair = tempObject.get(position);
        holder.display(pair);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView distance;
        private final TextView description;

        private Pair<String, String> currentPair;

        public MyViewHolder(final View itemView) {
            super(itemView);

            distance = ((TextView) itemView.findViewById(R.id.distance));
            description = ((TextView) itemView.findViewById(R.id.description));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(currentPair.first)
                            .setMessage(currentPair.second)
                            .show();
                }
            });
        }

        public void display(Pair<String, String> pair) {
            currentPair = pair;
            distance.setText(pair.first);
            description.setText(pair.second);
        }
    }

}
