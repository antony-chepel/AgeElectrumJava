package com.tencent.igv.ageblack;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.AsyncTask;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;
import com.orhanobut.hawk.Hawk;

public class AppClassElectrum extends Application {
    public static final String KSDFISDIOOSDFOSDF = "funcId";
    private static final String TDTQWHDJASJDJASDJ = "5244b795-9bdd-4bb1-bc90-2ef016184c76";

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this);
        OneSignal.setAppId(TDTQWHDJASJDJASDJ);
        Hawk.init(this).build();
        gltask.execute();

    }

    @SuppressLint("StaticFieldLeak")
    AsyncTask<Void, Void, String> gltask = new AsyncTask<Void, Void, String>() {
        @Override
        protected String doInBackground(Void... params) {
            AdvertisingIdClient.Info kdosdldlflfkd = null;
            try {
                kdosdldlflfkd = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
            String odisisfjdfjjsdf = null;
            try {
                odisisfjdfjjsdf = kdosdldlflfkd.getId();
                Hawk.put(KSDFISDIOOSDFOSDF, odisisfjdfjjsdf);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return odisisfjdfjjsdf;
        }

        @Override
        protected void onPostExecute(String advertId) {
        }
    };
}
