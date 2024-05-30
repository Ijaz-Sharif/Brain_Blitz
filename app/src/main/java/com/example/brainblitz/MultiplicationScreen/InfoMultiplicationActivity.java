package com.example.brainblitz.MultiplicationScreen;

import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.brainblitz.ColockScreens.ClockQuestionActivity;
import com.example.brainblitz.ColockScreens.InfoClockActivity;
import com.example.brainblitz.R;

import java.util.ArrayList;

public class InfoMultiplicationActivity extends AppCompatActivity {
        ImageView multi_img;
    Button btn_multi;
    int totalMulti=0;
    ArrayList<Integer> multiArrayList=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_multiplication);
        multiArrayList.add(R.drawable.multi_1);
        multiArrayList.add(R.drawable.multi_2);
        multiArrayList.add(R.drawable.multi_3);
        btn_multi=findViewById(R.id.btn_multi);
        multi_img=findViewById(R.id.multi_img);
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(getLanguage(InfoMultiplicationActivity.this).equals("eng")){
                  if(btn_multi.getText().toString().equals("next")){

                      totalMulti++;
                      multi_img.setImageDrawable(getResources().getDrawable(multiArrayList.get(totalMulti)));

                      if(totalMulti==2){
                          btn_multi.setText("start");
                      }
                  }
                  else {
                      startActivity(new Intent(InfoMultiplicationActivity.this, MultiplicationQuestionActivity.class));
                  }
              }
              else {
                  if(btn_multi.getText().toString().equals("Sonraki")){

                      totalMulti++;
                      multi_img.setImageDrawable(getResources().getDrawable(multiArrayList.get(totalMulti)));

                      if(totalMulti==2){
                          btn_multi.setText("başlangıç");
                      }
                  }
                  else {
                      startActivity(new Intent(InfoMultiplicationActivity.this, MultiplicationQuestionActivity.class));
                  }
              }


            }
        });
    }

    @Override
    protected void onStart() {
        if(getLanguage(this).equals("eng")){
            btn_multi.setText("next");
        }
        else {
            btn_multi.setText("Sonraki");
        }
        super.onStart();
    }
}