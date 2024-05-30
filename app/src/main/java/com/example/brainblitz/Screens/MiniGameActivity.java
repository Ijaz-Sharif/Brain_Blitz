package com.example.brainblitz.Screens;

import static com.example.brainblitz.Utils.Constant.getBrains;
import static com.example.brainblitz.Utils.Constant.getCoins;
import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.brainblitz.NumberScreens.InfoNumberActivity;
import com.example.brainblitz.NumberScreens.NumberQuestionActivity;
import com.example.brainblitz.R;
import com.example.brainblitz.SimilerScreens.SimilerQuestionActivity;
import com.example.brainblitz.SpelingScreens.SpelingQuestionActivity;

public class MiniGameActivity extends AppCompatActivity {
    TextView coins_text,brain_text,similer_text,speling_text,number_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_game);
        coins_text=findViewById(R.id.coins_text);
        brain_text=findViewById(R.id.brain_text);

        similer_text=findViewById(R.id.similer_text);
        speling_text=findViewById(R.id.speling_text);
        number_text=findViewById(R.id.number_text);
    }

    @Override
    protected void onStart() {
        brain_text.setText(getBrains(this)+"");
        coins_text.setText(getCoins(this)+"");

        if(getLanguage(this).equals("eng")){
            similer_text.setText("SIMILARS");
            speling_text.setText("SPELLINGS");
            number_text.setText("NUMBERS");
        }
        else {
            similer_text.setText("BENZERLER");
            speling_text.setText("YAZIMLAR");
            number_text.setText("NUMARALAR");
        }
        super.onStart();
    }

    public void openNumberScreen(View view){
        startActivity(new Intent(this, NumberQuestionActivity.class));
    }
    public void openSimilerScreen(View view){
        startActivity(new Intent(this, SimilerQuestionActivity.class));
    }  public void openSpellingScreen(View view){
        startActivity(new Intent(this, SpelingQuestionActivity.class));
    }
}