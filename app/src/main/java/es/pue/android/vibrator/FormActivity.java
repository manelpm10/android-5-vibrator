package es.pue.android.vibrator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class FormActivity extends AppCompatActivity {

    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        ivImage = findViewById(R.id.ivImage);
    }

    public void letsDance(View view) {
        EditText etNumVibrations = findViewById(R.id.etNumVibrations);
        int numVibrations = Integer.parseInt(etNumVibrations.getText().toString());

        Intent i = new Intent("es.pue.android.vibrator.VIBRATE");
        i.putExtra("numVibrations", numVibrations);
        sendBroadcast(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opCam:
                Log.i("MENU", "Click!");
                break;
        }
        return true;
    }
}
