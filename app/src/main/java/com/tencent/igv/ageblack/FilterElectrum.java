package com.tencent.igv.ageblack;

import static com.tencent.igv.ageblack.MainActivity.JUSADIODSAKDSKA;
import static com.tencent.igv.ageblack.ReplElectrum.OASDIASDJKASJD;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.orhanobut.hawk.Hawk;
import com.tencent.igv.R;
import com.tencent.igv.agewhite.MainScreenElectrum;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FilterElectrum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        new hydsuifsdifisd().execute();
    }


    public class hydsuifsdifisd extends AsyncTask<Void, Void, Void> {


        String hsadiasiodkasdk;
        String twqdydjkaskdask = Hawk.get(OASDIASDJKASJD);
        String bhsajdjkasdklasd = Hawk.get(JUSADIODSAKDSKA);
        String psadoaskdasjdsj = "http://ageofelectrum.xyz/go.php?to=1&";
        String rwdtqdhsadasjdj = "sub_id_1=";
        String jsaidoasdlasdl = psadoaskdasjdsj + rwdtqdhsadasjdj + twqdydjkaskdask;
        String twdhqdjasjdjasjds = psadoaskdasjdsj + rwdtqdhsadasjdj + bhsajdjkasdklasd;

        @Override
        protected Void doInBackground(Void... voids) {
            try {

                Document doc;
                if (!twqdydjkaskdask.equals("null")){ //сменил логический ноль на стринг
                    doc = Jsoup.connect(jsaidoasdlasdl).get();
                } else {
                    doc = Jsoup.connect(twdhqdjasjdjasjds).get();
                }
                hsadiasiodkasdk = doc.text();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            Intent losdkasdjjasdj = new Intent(getApplicationContext(), MainScreenElectrum.class);

            Intent hsdauidiaskdkas = new Intent(getApplicationContext(), RealElectrum.class);
            if (hsadiasiodkasdk.equals("admin")) {
                startActivity(losdkasdjjasdj);
            } else {
                startActivity(hsdauidiaskdkas);
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }

    }
}
