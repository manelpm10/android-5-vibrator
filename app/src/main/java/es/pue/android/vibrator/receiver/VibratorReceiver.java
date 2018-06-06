package es.pue.android.vibrator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;

public class VibratorReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().endsWith("es.pue.android.vibrator.VIBRATE")) {
            int numVibrations = intent.getIntExtra("numVibrations", 0);

            Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            for (int i = 0; i < numVibrations; i++) {
                v.vibrate(500);
            }
        }
    }
}
