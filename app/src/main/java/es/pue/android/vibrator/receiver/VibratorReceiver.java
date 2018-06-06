package es.pue.android.vibrator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class VibratorReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().endsWith("es.pue.android.vibrator.VIBRATE")) {
            int numVibrations = intent.getIntExtra("numVibrations", 0);

                Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
                for (int i = 0; i < numVibrations; i++) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
                    } else {
                        //deprecated in API 26
                        v.vibrate(500);
                    }
                }
            }
        }
    }
