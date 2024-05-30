package com.example.brainblitz.DirectionScreen;

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

public class InfoDirectionActivity extends AppCompatActivity {
    ImageView direction_img;
    Button btn_clock;
    int totalDirection=0;
    ArrayList<Integer> directionArrayList=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_direction);
        directionArrayList.add(R.drawable.behind);
        directionArrayList.add(R.drawable.between);
        directionArrayList.add(R.drawable.front);
        directionArrayList.add(R.drawable.left);
        directionArrayList.add(R.drawable.right);
        direction_img=findViewById(R.id.direction_img);
        btn_clock=findViewById(R.id.btn_clock);
        direction_img.setImageDrawable(getResources().getDrawable(directionArrayList.get(totalDirection)));

        btn_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getLanguage(InfoDirectionActivity.this).equals("eng")){
                    if(btn_clock.getText().toString().equals("next")){

                        totalDirection++;
                        direction_img.setImageDrawable(getResources().getDrawable(directionArrayList.get(totalDirection)));

                        if(totalDirection==4){
                            btn_clock.setText("start");
                        }
                    }
                    else {
                        startActivity(new Intent(InfoDirectionActivity.this, DirectionQuestionActivity.class));
                    }
                }
                else {
                    if(btn_clock.getText().toString().equals("Sonraki")){

                        totalDirection++;
                        direction_img.setImageDrawable(getResources().getDrawable(directionArrayList.get(totalDirection)));

                        if(totalDirection==4){
                            btn_clock.setText("başlangıç");
                        }
                    }
                    else {
                        startActivity(new Intent(InfoDirectionActivity.this, DirectionQuestionActivity.class));
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