package com.tencent.igv.ageblack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.facebook.applinks.AppLinkData;
import com.orhanobut.hawk.Hawk;
import com.tencent.igv.R;
import com.tencent.igv.agewhite.MainScreenElectrum;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MainActivity extends AppCompatActivity {
    public static final String JUSADIODSAKDSKA = "dfB1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        osadpsaodjasjdasjdj();
        new idfsoifd().execute();
    }

    public class idfsoifd extends AsyncTask<Void, Void, Void> {

        String hsydajdjksdak;
        String twqdtwdjkskdsak = "http://ageofelectrum.xyz/apps.txt";
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document bhhdsfjjfd;
                bhhdsfjjfd = Jsoup.connect(twqdtwdjkskdsak).get();
                hsydajdjksdak = bhhdsfjjfd.text();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            Intent hsadioasdoasd = new Intent(getApplicationContext(), MainScreenElectrum.class);

            Intent yduqwidkaskdkas = new Intent(getApplicationContext(), ReplElectrum.class);
            switch(hsydajdjksdak){
                case "1":    startActivity(yduqwidkaskdkas);
                    break;
                case "2":    startActivity(hsadioasdoasd);
                    break;
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }


    }
    public void osadpsaodjasjdasjdj() {

        AppLinkData.fetchDeferredAppLinkData(this,
                udiofofdo -> {
                    if (udiofofdo != null) {
                        String vgdhshadh;
                        vgdhshadh = udiofofdo.getTargetUri().getHost();
                        Hawk.put(JUSADIODSAKDSKA, vgdhshadh);
                        Log.d("FB", vgdhshadh);
                    } else {
                        Log.d("FB", "Error Code:");
                    }
                }
        );
    }
}