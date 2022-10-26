package com.tencent.igv.agewhite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tencent.igv.R;

import org.w3c.dom.Text;

import java.util.Random;

public class ResElectrumScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_electrum_screen);
        ElectrumManager elctr =  new ElectrumManager();
        Random rand = new Random();
        Button b_res_electr = findViewById(R.id.button2);
        TextView txt_ele_res = findViewById(R.id.tv_res_elctr);
        TextView txt_spin_res = findViewById(R.id.tv_spin);
        txt_ele_res.setText(elctr.listBonusAge.get(rand.nextInt(5)));
        txt_spin_res.setText(elctr.listPointsAge.get(rand.nextInt(5)));
        b_res_electr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainScreenElectrum.class));
            }
        });
    }
}