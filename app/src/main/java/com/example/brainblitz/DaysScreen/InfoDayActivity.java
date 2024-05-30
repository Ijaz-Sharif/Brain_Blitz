package com.example.brainblitz.DaysScreen;

import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brainblitz.R;

public class InfoDayActivity extends AppCompatActivity {
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_day);
        button=findViewById(R.id.button);
    }
    public void openQuestionScreen(View view){
        startActivity(new Intent(this,DayQuestionActivity.class));
    }

    @Override
    protected void onStart() {
        if(getLanguage(this).equals("eng")){
            button.setText("next");
        }
        else {
            button.setText("Sonraki");
        }
        super.onStart();
    }
}