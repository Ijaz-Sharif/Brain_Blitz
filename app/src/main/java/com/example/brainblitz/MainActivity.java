package com.example.brainblitz;

import static com.example.brainblitz.Utils.Constant.getBrains;
import static com.example.brainblitz.Utils.Constant.getCoins;
import static com.example.brainblitz.Utils.Constant.getLanguage;
import static com.example.brainblitz.Utils.Constant.setLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.brainblitz.Screens.LessonActivity;
import com.example.brainblitz.Screens.MiniGameActivity;

public class MainActivity extends AppCompatActivity {
       TextView coins_text,brain_text,play_text;
       Button title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coins_text=findViewById(R.id.coins_text);
        brain_text=findViewById(R.id.brain_text);
        title=findViewById(R.id.title);
        play_text=findViewById(R.id.play_text);

    }

    @Override
    protected void onStart() {
        if(getLanguage(this).equals("eng")){
             title.setText("mini games");
            play_text.setText("PLAY");
        }
        else {
            title.setText("küçük oyunlar");
            play_text.setText("OYNA");
            title.setTextSize(13);
        }
        brain_text.setText(getBrains(this)+"");
        coins_text.setText(getCoins(this)+"");
        super.onStart();
    }

    public void openMiniGameScreen(View view){
        startActivity(new Intent(this, MiniGameActivity.class));
    }


    public void openLessonScreen(View view){
        startActivity(new Intent(this, LessonActivity.class));
    }



    public void showLanguageAlert(View view){
        final CharSequence[] options = {"English","Turkish", "Cancel"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Select Language");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                if (options[item].equals("English")) {
                    setLanguage(MainActivity.this,"eng");
                    title.setText("MINI GAMES");
                    play_text.setText("PLAY");
                    dialog.dismiss();
                } else if (options[item].equals("Cancel")) {
                    dialog.dismiss();
                } else if (options[item].equals("Turkish")) {
                    setLanguage(MainActivity.this,"Turkish");
                    title.setText("KÜÇÜK OYUNLAR");
                    title.setTextSize(13);
                    play_text.setText("OYNA");
                    dialog.dismiss();
                }

            }
        });
        builder.show();
    }

}