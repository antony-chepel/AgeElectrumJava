package com.tencent.igv.ageblack;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.orhanobut.hawk.Hawk;
import com.tencent.igv.R;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReplElectrum extends AppCompatActivity {

    public static final String OASDIASDJKASJD = "cstR1";
    private static final String TWQDGDASJDJASJ = "FmyT4MDLc8pcEHZxTNkXvX";

    String nsadjdkasodoasdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> {
            String hawkI = Hawk.get(OASDIASDJKASJD);
            if (hawkI != null) {
                Log.d("TestInUIHawk", hawkI);
                tsadjasdjasdj();
                executorService.shutdown();
                finish();
            } else {
                Log.d("TestInUIHawk", "Received null");
            }
        }, 0, 2, TimeUnit.SECONDS);


        rwqrdsdasjdasjdjasd();

        SharedPreferences hsuadiasidasidis = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
        if (hsuadiasidasidis.getBoolean("activity_exec", false)) {
            Intent tyasduasjkdkas = new Intent(this, FilterElectrum.class);
            startActivity(tyasduasjkdkas);
            finish();
        } else {
            SharedPreferences.Editor asdospadpasd = hsuadiasidasidis.edit();
            asdospadpasd.putBoolean("activity_exec", true);
            asdospadpasd.apply();
        }
    }

    public void rwqrdsdasjdasjdjasd() {
        AppsFlyerConversionListener conversionListener = new AppsFlyerConversionListener() {

            @Override
            public void onConversionDataSuccess(Map<String, Object> conversionData) {


                Log.d("TESTING_ZONE", "af stat is " + conversionData.get("af_status"));
                String status = (String) conversionData.get("af_status");
                if (Objects.equals(status, "Organic")) {
                    nsadjdkasodoasdo = "null";
                } else {
                    nsadjdkasodoasdo = (String) conversionData.get("campaign");
                }
                Hawk.put(OASDIASDJKASJD, nsadjdkasodoasdo);
                Log.d("NAMING TEST", "campaign attributed: " + nsadjdkasodoasdo);
            }


            @Override
            public void onConversionDataFail(String errorMessage) {
                nsadjdkasodoasdo = "null";
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> attributionData) {
            }

            @Override
            public void onAttributionFailure(String errorMessage) {
            }

        };

        AppsFlyerLib.getInstance().init(TWQDGDASJDJASJ, conversionListener, this);
        AppsFlyerLib.getInstance().start(this);
        AppsFlyerLib.getInstance().setDebugLog(true);

    }
    public void tsadjasdjasdj() {

        Intent nsadkkasdodoasd = new Intent(ReplElectrum.this, FilterElectrum.class);
        startActivity(nsadkkasdodoasd);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }
}
