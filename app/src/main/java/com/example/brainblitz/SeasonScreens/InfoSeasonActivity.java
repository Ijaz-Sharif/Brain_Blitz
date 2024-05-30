package com.example.brainblitz.SeasonScreens;

import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.brainblitz.R;

import java.util.ArrayList;

public class InfoSeasonActivity extends AppCompatActivity {
     Button btn_season;
     int totalImg=0;
     ArrayList<Integer> imageArrayList=new ArrayList<Integer>();
     ImageView season_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_season);
        imageArrayList.add(R.drawable.spring_text);
        imageArrayList.add(R.drawable.summer_text);
        imageArrayList.add(R.drawable.winter_text);
        imageArrayList.add(R.drawable.fall_text);
        season_img=findViewById(R.id.season_img);

        season_img.setImageDrawable(getResources().getDrawable(imageArrayList.get(totalImg)));

        btn_season=findViewById(R.id.btn_season);
        btn_season.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(getLanguage(InfoSeasonActivity.this).equals("eng")){
                   if(btn_season.getText().toString().equals("next")){
                       totalImg++;
                       season_img.setImageDrawable(getResources().getDrawable(imageArrayList.get(totalImg)));
                       if(totalImg==3){
                           btn_season.setText("start");
                       }
                   }
                   else {
                       startActivity(new Intent(InfoSeasonActivity.this,SeasonQuestionActivity.class));
                   }
               }
               else {
                   if(btn_season.getText().toString().equals("Sonraki")){
                       totalImg++;
                       season_img.setImageDrawable(getResources().getDrawable(imageArrayList.get(totalImg)));
                       if(totalImg==3){
                           btn_season.setText("başlangıç");
                       }
                   }
                   else {
                       startActivity(new Intent(InfoSeasonActivity.this,SeasonQuestionActivity.class));
                   }
               }


            }
        });
    }

    @Override
    protected void onStart() {
        if(getLanguage(this).equals("eng")){
            btn_season.setText("next");
        }
        else {
            btn_season.setText("Sonraki");
        }
        super.onStart();
    }
}