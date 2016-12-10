package factory.novas.droidmaitre.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import factory.novas.droidmaitre.R;
import factory.novas.droidmaitre.models.Comedor;
import factory.novas.droidmaitre.models.Mesa;

/**
 * Created by Adrian on 9/12/16.
 */

public class ComedorActivity extends AppCompatActivity {
    private static final String TAG = "ComedorActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedor);

        ListView comedorList = (ListView) findViewById(R.id.mesas);

        final Comedor comedor = new Comedor();

        ArrayAdapter<Mesa> adapter = new ArrayAdapter<Mesa>(
                this,
                android.R.layout.simple_list_item_1,
                comedor.getComedor()
        );

        comedorList.setAdapter(adapter);

        FloatingActionButton addTable = (FloatingActionButton) findViewById(R.id.boton_aniadir);
        addTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Boton pulsado");
            }
        });

    }
}