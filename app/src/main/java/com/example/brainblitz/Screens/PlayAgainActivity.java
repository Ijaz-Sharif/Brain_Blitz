package com.example.brainblitz.Screens;

import static com.example.brainblitz.Utils.Constant.getBrains;
import static com.example.brainblitz.Utils.Constant.getCoins;
import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.brainblitz.MainActivity;
import com.example.brainblitz.R;

public class PlayAgainActivity extends AppCompatActivity {
    TextView coins_text,brain_text,textView;
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_again);
        coins_text=findViewById(R.id.coins_text);
        brain_text=findViewById(R.id.brain_text);
        textView=findViewById(R.id.textView);
        play=findViewById(R.id.imageView1);
    }

    @Override
    protected void onStart() {
        brain_text.setText(getBrains(this)+"");
        coins_text.setText(getCoins(this)+"");
        if(getLanguage(this).equals("eng")){
            textView.setText("Great Job!");
            play.setText("Play Again");
        }
        else {
            textView.setText("İyi iş!");
            play.setText("Tekrar oyna");
        }
        super.onStart();
    }
    public void playAgain(View view){
        finish();
    }
    public void finish(View view){
        startActivity(new Intent(this, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }

}