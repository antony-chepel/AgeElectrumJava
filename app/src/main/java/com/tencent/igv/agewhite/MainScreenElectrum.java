package com.tencent.igv.agewhite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tencent.igv.R;

import java.util.Random;

public class MainScreenElectrum extends AppCompatActivity {

    ImageView im_1_electr,im_2_electr,im_3_electr;
    Button b_electr;
    Integer count = 0;
    TextView tv_b_electr, tv_sp_electr;

    Boolean ispress_age = false;

    CountDownTimer pbDeluxeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_electrum);
        im_1_electr = findViewById(R.id.im_1_el);
        im_2_electr = findViewById(R.id.im_2_el);
        im_3_electr = findViewById(R.id.im_3_el);
        b_electr = findViewById(R.id.b_el_bonus);
       tv_b_electr = findViewById(R.id.tv_bonus_el);
        tv_sp_electr = findViewById(R.id.tv_spin_xcore);
        b_electr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hdhsufsdu();
            }
        });

    }


    private  void hdhsufsdu(){

        if(pbDeluxeTime != null) {
            pbDeluxeTime.cancel();
        }
        pbDeluxeTime = new CountDownTimer(5000,100) {

            @Override
            public void onTick(long millisUntilFinished) {
                count++;
               ElectrumManager m_electr = new ElectrumManager();

               ispress_age = true;
               if(count > 4){
                   count =0;
                   String r_b_eletr = m_electr.listBonusAge.get(count);
                   String r_sp_eletr = m_electr.listPointsAge.get(count);
                   Integer img_1_real = m_electr.listAge.get(count);
                   Integer img_2_real = m_electr.listAge.get(count);
                   Integer img_3_real = m_electr.listAge.get(count);
                   tv_b_electr.setText(r_b_eletr);
                   tv_sp_electr.setText(r_sp_eletr);
                   im_1_electr.setImageResource(img_1_real);
                   im_2_electr.setImageResource(img_2_real);
                   im_3_electr.setImageResource(img_3_real);


               }

               b_electr.setAlpha(0.8f);

                }


            @Override
            public void onFinish() {
                ElectrumManager m_electr = new ElectrumManager();
                Random random = new Random();
                String r_b_eletr = m_electr.listBonusAge.get(random.nextInt(5));
                String r_p_eletr = m_electr.listPointsAge.get(random.nextInt(5));
                Integer img_1_electr1 = m_electr.listAge.get(random.nextInt(5));
                Integer img_2_electr2 = m_electr.listAge.get(random.nextInt(5));
                Integer img_3_electr3 = m_electr.listAge.get(random.nextInt(5));

                im_1_electr.setImageResource(img_1_electr1);
                im_2_electr.setImageResource(img_2_electr2);
                im_3_electr.setImageResource(img_3_electr3);
                tv_b_electr.setText(r_b_eletr);
                tv_sp_electr.setText(r_p_eletr);
                ispress_age = false;
                b_electr.setAlpha(1.0f);
                    startActivity(new Intent(getApplicationContext(),ResElectrumScreen.class));

            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        pbDeluxeTime.cancel();
    }
}