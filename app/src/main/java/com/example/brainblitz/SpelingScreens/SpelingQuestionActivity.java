package com.example.brainblitz.SpelingScreens;

import static com.example.brainblitz.Utils.Constant.getBrains;
import static com.example.brainblitz.Utils.Constant.getCoins;
import static com.example.brainblitz.Utils.Constant.getLanguage;
import static com.example.brainblitz.Utils.Constant.setBrains;
import static com.example.brainblitz.Utils.Constant.setCoins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brainblitz.ColockScreens.ClockQuestionActivity;
import com.example.brainblitz.Model.QuestionList;
import com.example.brainblitz.MultiplicationScreen.MultiplicationQuestionActivity;
import com.example.brainblitz.R;
import com.example.brainblitz.Screens.PlayAgainActivity;
import com.example.brainblitz.Screens.TryAgainActivity;

import java.util.ArrayList;

public class SpelingQuestionActivity extends AppCompatActivity {
    int questionNUmber=0;
    int correctAnswer=0;
    Animation shake;
    int wrongAnswer=3;
    TextView question_9br,question_text;
    ImageView heart_img1,heart_img2,heart_img3,spelling_img;
    EditText spel1,spel2,spel3,spel4,spel5,spel6,spel7;

    ArrayList<Integer> imageArrayList=new ArrayList<Integer>();
    ArrayList<String> nameArrayList=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speling_question);
        question_text=findViewById(R.id.question_text);
        question_9br=findViewById(R.id.question_9br);

        nameArrayList.add("hat");
        nameArrayList.add("candle");
        nameArrayList.add("orange");
        nameArrayList.add("magnet");
        nameArrayList.add("volcano");

        imageArrayList.add(R.drawable.hat);
        imageArrayList.add(R.drawable.candle);
        imageArrayList.add(R.drawable.orange);
        imageArrayList.add(R.drawable.magnet);
        imageArrayList.add(R.drawable.volcano);
        heart_img1=findViewById(R.id.heart_img1);
        heart_img2=findViewById(R.id.heart_img2);
        heart_img3=findViewById(R.id.heart_img3);
        spel1=findViewById(R.id.spel1);
        spel2=findViewById(R.id.spel2);
        spel3=findViewById(R.id.spel3);
        spel4=findViewById(R.id.spel4);
        spel5=findViewById(R.id.spel5);
        spel6=findViewById(R.id.spel6);
        spel7=findViewById(R.id.spel7);
        spelling_img=findViewById(R.id.spelling_img);
        shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        spel1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used in this example
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Not used in this example
            }

            @Override
            public void afterTextChanged(Editable s) {
                String[] words = s.toString().split(" ");
                if (words.length == 1) {
                    spel2.requestFocus();
                }
            }
        });
        spel2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used in this example
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Not used in this example
            }

            @Override
            public void afterTextChanged(Editable s) {
                String[] words = s.toString().split(" ");
                if (words.length == 1) {
                    spel3.requestFocus();
                }
            }
        });
        spel3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used in this example
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Not used in this example
            }

            @Override
            public void afterTextChanged(Editable s) {
                String[] words = s.toString().split(" ");
                if (words.length == 1) {
                    spel4.requestFocus();
                }
            }
        });
        spel4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used in this example
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Not used in this example
            }

            @Override
            public void afterTextChanged(Editable s) {
                String[] words = s.toString().split(" ");
                if (words.length == 1) {
                    spel5.requestFocus();
                }
            }
        });
        spel5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used in this example
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Not used in this example
            }

            @Override
            public void afterTextChanged(Editable s) {
                String[] words = s.toString().split(" ");
                if (words.length == 1) {
                    spel6.requestFocus();
                }
            }
        });
        spel7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used in this example
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Not used in this example
            }

            @Override
            public void afterTextChanged(Editable s) {
                String[] words = s.toString().split(" ");
                if (words.length == 1) {
                    spel7.requestFocus();
                }
            }
        });
    }
    @Override
    protected void onStart() {

        if(getLanguage(this).equals("eng")){
            question_text.setText("Spell the Word!");
        }
        else {
            question_text.setText("Kelimeyi hecele!");
        }
        heart_img1.setImageDrawable(getResources().getDrawable(R.drawable.heart_img));
        heart_img2.setImageDrawable(getResources().getDrawable(R.drawable.heart_img));
        heart_img3.setImageDrawable(getResources().getDrawable(R.drawable.heart_img));
        wrongAnswer=3;
        questionNUmber=0;
        correctAnswer=0;
       updateQuestion();
        super.onStart();
    }

    public void generateQuestion(View view){
        int question=questionNUmber;
        question=question+1;
        if(question==1){
            correctAnswer=correctAnswer+1;
            String ans=spel1.getText().toString()+spel2.getText().toString()+spel3.getText().toString();
           if(ans.equalsIgnoreCase("hat")){
               correctAnswer=correctAnswer+1;
               Toast.makeText(SpelingQuestionActivity.this,"correct answer",Toast.LENGTH_LONG).show();
           }
           else {
               wrongAnswer=wrongAnswer-1;
               Toast.makeText(SpelingQuestionActivity.this,"Wrong answer",Toast.LENGTH_LONG).show();

           }
           setDelay();
        }
        else if(question==2){

            String ans=spel1.getText().toString()+spel2.getText().toString()+spel3.getText().toString()
                    +spel4.getText().toString()+spel5.getText().toString()+spel6.getText().toString();
            if(ans.equalsIgnoreCase("candle")){
                correctAnswer=correctAnswer+1;
                Toast.makeText(SpelingQuestionActivity.this,"correct answer",Toast.LENGTH_LONG).show();
            }
            else {
                wrongAnswer=wrongAnswer-1;
                Toast.makeText(SpelingQuestionActivity.this,"Wrong answer",Toast.LENGTH_LONG).show();

            }
            setDelay();

        }else if(question==3){

            String ans=spel1.getText().toString()+spel2.getText().toString()+spel3.getText().toString()
                    +spel4.getText().toString()+spel5.getText().toString()+spel6.getText().toString();
            if(ans.equalsIgnoreCase("orange")){
                correctAnswer=correctAnswer+1;
                Toast.makeText(SpelingQuestionActivity.this,"correct answer",Toast.LENGTH_LONG).show();
            }
            else {
                wrongAnswer=wrongAnswer-1;
                Toast.makeText(SpelingQuestionActivity.this,"Wrong answer",Toast.LENGTH_LONG).show();

            }
            setDelay();

        }else if(question==4){

            String ans=spel1.getText().toString()+spel2.getText().toString()+spel3.getText().toString()
                    +spel4.getText().toString()+spel5.getText().toString()+spel6.getText().toString();
            if(ans.equalsIgnoreCase("magnet")){
                correctAnswer=correctAnswer+1;
                Toast.makeText(SpelingQuestionActivity.this,"correct answer",Toast.LENGTH_LONG).show();
            }
            else {
                wrongAnswer=wrongAnswer-1;
                Toast.makeText(SpelingQuestionActivity.this,"Wrong answer",Toast.LENGTH_LONG).show();

            }
            setDelay();

        }
        else if(question==5){

            String ans=spel1.getText().toString()+spel2.getText().toString()+spel3.getText().toString()
                    +spel4.getText().toString()+spel5.getText().toString()+spel6.getText().toString()
                    +spel7.getText().toString();
            if(ans.equalsIgnoreCase("volcano")){
                correctAnswer=correctAnswer+1;
                Toast.makeText(SpelingQuestionActivity.this,"correct answer",Toast.LENGTH_LONG).show();
            }
            else {
                wrongAnswer=wrongAnswer-1;
                Toast.makeText(SpelingQuestionActivity.this,"Wrong answer",Toast.LENGTH_LONG).show();

            }
            setDelay();
        }
    }

    public void setDelay(){
        updateHeart();
        questionNUmber++;
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(questionNUmber==5){
                    int coin=getCoins(SpelingQuestionActivity.this);
                    coin=coin+correctAnswer;
                    setCoins(SpelingQuestionActivity.this,coin);
                    if(correctAnswer==6){
                        int brain=getBrains(SpelingQuestionActivity.this);
                        brain=brain+1;
                        setBrains( SpelingQuestionActivity.this,brain);

                        startActivity(new Intent(SpelingQuestionActivity.this, PlayAgainActivity.class));

                    }
                    else {
                        startActivity(new Intent(SpelingQuestionActivity.this, TryAgainActivity.class));
                    }
                }else {
                    updateQuestion();
                }

            }
        }, 2000);
    }
    public void updateHeart(){
        if(wrongAnswer==2){
            heart_img3.setImageDrawable(getResources().getDrawable(R.drawable.empty_heart));
        }
        if(wrongAnswer==1){
            heart_img2.setImageDrawable(getResources().getDrawable(R.drawable.empty_heart));
        }
        if(wrongAnswer==0){
            heart_img1.setImageDrawable(getResources().getDrawable(R.drawable.empty_heart));
        }
        if(wrongAnswer==0){
            int coin=getCoins(SpelingQuestionActivity.this);
            coin=coin+correctAnswer;
            setCoins(SpelingQuestionActivity.this,coin);
            startActivity(new Intent(SpelingQuestionActivity.this, TryAgainActivity.class));
        }
    }

    public void updateQuestion(){
        spel1.requestFocus();
        String q_text="Question";
        if(getLanguage(this).equals("eng")){
            q_text="Question";
        }
        else {
            q_text="Soru";
        }
        int question=questionNUmber;
        question=question+1;
        question_9br.setText(q_text+" "+question+"/5");
        spelling_img.setImageDrawable(getResources().getDrawable(imageArrayList.get(questionNUmber)));
           if(question==1){
               spel4.setVisibility(View.GONE);
               spel5.setVisibility(View.GONE);
               spel6.setVisibility(View.GONE);
               spel7.setVisibility(View.GONE);

               spel1.setHint("h");
               spel2.setHint("a");
               spel3.setHint("t");
           }
           else if(question==2){
               spel4.setVisibility(View.VISIBLE);
               spel5.setVisibility(View.VISIBLE);
               spel6.setVisibility(View.VISIBLE);
               spel7.setVisibility(View.GONE);

               spel1.setText("");
               spel2.setText("");
               spel3.setText("");

               spel1.setHint("c");
               spel2.setHint("a");
               spel3.setHint("n");
               spel4.setHint("d");
               spel5.setHint("l");
               spel6.setHint("e");

           }else if(question==3){

               spel1.setText("");
               spel2.setText("");
               spel3.setText("");
               spel4.setText("");
               spel5.setText("");
               spel6.setText("");



               spel1.setHint("o");
               spel2.setHint("r");
               spel3.setHint("a");
               spel4.setHint("n");
               spel5.setHint("g");
               spel6.setHint("e");

           }else if(question==4){

               spel1.setText("");
               spel2.setText("");
               spel3.setText("");
               spel4.setText("");
               spel5.setText("");
               spel6.setText("");

               spel1.setHint("m");
               spel2.setHint("a");
               spel3.setHint("g");
               spel4.setHint("n");
               spel5.setHint("e");
               spel6.setHint("t");

           }
           else if(question==5){
               spel1.setText("");
               spel2.setText("");
               spel3.setText("");
               spel4.setText("");
               spel5.setText("");
               spel6.setText("");
               spel4.setVisibility(View.VISIBLE);
               spel5.setVisibility(View.VISIBLE);
               spel6.setVisibility(View.VISIBLE);
               spel7.setVisibility(View.VISIBLE);
               spel1.setHint("v");
               spel2.setHint("o");
               spel3.setHint("l");
               spel4.setHint("c");
               spel5.setHint("a");
               spel6.setHint("n");
               spel7.setHint("0");
           }
        spel1.requestFocus();

    }
}