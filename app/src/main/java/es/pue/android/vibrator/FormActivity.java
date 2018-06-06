package es.pue.android.vibrator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void letsDance(View view) {
        EditText etNumVibrations = findViewById(R.id.etNumVibrations);
        int numVibrations = Integer.parseInt(etNumVibrations.getText().toString());

        Intent i = new Intent("es.pue.android.vibrator.VIBRATE");
        i.putExtra("numVibrations", numVibrations);
        sendBroadcast(i);
    }
}
