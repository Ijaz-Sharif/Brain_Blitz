package com.example.brainblitz.Screens;

import static com.example.brainblitz.Utils.Constant.getBrains;
import static com.example.brainblitz.Utils.Constant.getCoins;
import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.brainblitz.ColockScreens.InfoClockActivity;
import com.example.brainblitz.DaysScreen.InfoDayActivity;
import com.example.brainblitz.DirectionScreen.InfoDirectionActivity;
import com.example.brainblitz.MultiplicationScreen.InfoMultiplicationActivity;
import com.example.brainblitz.R;
import com.example.brainblitz.SeasonScreens.InfoSeasonActivity;
import com.example.brainblitz.YearScreen.InfoYearActivity;

public class LessonActivity extends AppCompatActivity {
    TextView coins_text,brain_text;

    TextView clock_text,season_text,day_text,month_text,mul_text,direction_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        coins_text=findViewById(R.id.coins_text);
        brain_text=findViewById(R.id.brain_text);

        direction_text=findViewById(R.id.direction_text);
        clock_text=findViewById(R.id.clock_text);
        season_text=findViewById(R.id.season_text);
        day_text=findViewById(R.id.day_text);
        month_text=findViewById(R.id.month_text);
        mul_text=findViewById(R.id.mul_text);
    }

    @Override
    protected void onStart() {
        brain_text.setText(getBrains(this)+"");
        coins_text.setText(getCoins(this)+"");

        if(getLanguage(this).equals("eng")){
            clock_text.setText("CLOCKS");
            season_text.setText("SEASONS");
            day_text.setText("DAYS OF THE WEEK");
            month_text.setText("MONTHS OF THE YEAR");
            mul_text.setText("MULTIPLICATIONS");
            direction_text.setText("DIRECTIONS");
        }
        else {
            clock_text.setText("SAATLER");
            season_text.setText("SEZONLAR");
            day_text.setText("HAFTANIN GÜNLERİ");
            month_text.setText("YILIN AYLARI");
            mul_text.setText("ÇARPMA İŞLEMLERİ");
            direction_text.setText("YÖNLER");
        }
        super.onStart();
    }

    public void finish(View view){
        finish();
    }
 public void openClockScreen(View view){
        startActivity(new Intent(this, InfoClockActivity.class));
 }
    public void openSeasonScreen(View view){
        startActivity(new Intent(this, InfoSeasonActivity.class));
    }
    public void openDaysScreen(View view){
        startActivity(new Intent(this, InfoDayActivity.class));

    }public void openYearScreen(View view){
        startActivity(new Intent(this, InfoYearActivity.class));

    }

    public void openMultiplicationScreen(View view){
        startActivity(new Intent(this, InfoMultiplicationActivity.class));

    } public void openDirectionScreen(View view){
        startActivity(new Intent(this, InfoDirectionActivity.class));

    }


}