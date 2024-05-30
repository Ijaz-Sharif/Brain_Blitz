package com.example.brainblitz.ColockScreens;

import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brainblitz.R;
import com.example.brainblitz.SeasonScreens.InfoSeasonActivity;

import java.util.ArrayList;

public class InfoClockActivity extends AppCompatActivity {
      ImageView clock_img;
      Button btn_clock;
    int totalClock=0;
    TextView text_ans;
    ArrayList<Integer> clockArrayList=new ArrayList<Integer>();
    ArrayList<String> textArrayList=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_clock);
        clockArrayList.add(R.drawable.clock1);
        textArrayList.add("One O'clock");
        clockArrayList.add(R.drawable.clock2);
        textArrayList.add("Half Past One");
        clockArrayList.add(R.drawable.clock3);
        textArrayList.add("Quarter Past One");
        clockArrayList.add(R.drawable.clock4);
        textArrayList.add("Quarter To Two");
        clock_img=findViewById(R.id.clock_img);
        btn_clock=findViewById(R.id.btn_clock);
        text_ans=findViewById(R.id.text_ans);
        clock_img.setImageDrawable(getResources().getDrawable(clockArrayList.get(totalClock)));
        text_ans.setText(textArrayList.get(totalClock));
        btn_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getLanguage(InfoClockActivity.this).equals("eng")){
                    if(btn_clock.getText().toString().equals("next")){

                        totalClock++;
                        clock_img.setImageDrawable(getResources().getDrawable(clockArrayList.get(totalClock)));
                        text_ans.setText(textArrayList.get(totalClock));
                        if(totalClock==3){
                            btn_clock.setText("start");
                        }
                    }
                    else {
                        startActivity(new Intent(InfoClockActivity.this,ClockQuestionActivity.class));
                    }
                }
                else {
                    if(btn_clock.getText().toString().equals("Sonraki")){

                        totalClock++;
                        clock_img.setImageDrawable(getResources().getDrawable(clockArrayList.get(totalClock)));
                        text_ans.setText(textArrayList.get(totalClock));
                        if(totalClock==3){
                            btn_clock.setText("başlangıç");
                        }
                    }
                    else {
                        startActivity(new Intent(InfoClockActivity.this,ClockQuestionActivity.class));
                    }
                }



            }
        });


    }

    @Override
    protected void onStart() {
        if(getLanguage(this).equals("eng")){
            btn_clock.setText("next");
        }
        else {
            btn_clock.setText("Sonraki");
        }
        super.onStart();
    }
}