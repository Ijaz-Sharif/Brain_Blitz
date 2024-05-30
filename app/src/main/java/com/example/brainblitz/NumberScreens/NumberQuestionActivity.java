package com.example.brainblitz.NumberScreens;

import static com.example.brainblitz.Utils.Constant.getBrains;
import static com.example.brainblitz.Utils.Constant.getCoins;
import static com.example.brainblitz.Utils.Constant.getLanguage;
import static com.example.brainblitz.Utils.Constant.setBrains;
import static com.example.brainblitz.Utils.Constant.setCoins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brainblitz.ColockScreens.ClockQuestionActivity;
import com.example.brainblitz.Model.QuestionList;
import com.example.brainblitz.R;
import com.example.brainblitz.Screens.PlayAgainActivity;
import com.example.brainblitz.Screens.TryAgainActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberQuestionActivity extends AppCompatActivity {
    ImageView number_img;
    TextView question_9br;
    Button btn_option2,btn_option1,btn_option3,btn_option4;

    int questionNUmber=0;
    int correctAnswer=0;
    Animation shake;
    int wrongAnswer=3;
    TextView textView;
    ImageView heart_img1,heart_img2,heart_img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_question);
        number_img=findViewById(R.id.number_img);
        textView=findViewById(R.id.textView2);
        QuestionList.getInstance().addNumberQuestion();
        btn_option2=findViewById(R.id.btn_option2);
        btn_option1=findViewById(R.id.btn_option1);
        btn_option3=findViewById(R.id.btn_option3);
        btn_option4=findViewById(R.id.btn_option4);
        question_9br=findViewById(R.id.question_9br);
        shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        heart_img1=findViewById(R.id.heart_img1);
        heart_img2=findViewById(R.id.heart_img2);
        heart_img3=findViewById(R.id.heart_img3);

    }

    @Override
    protected void onStart() {
        heart_img1.setImageDrawable(getResources().getDrawable(R.drawable.heart_img));
        heart_img2.setImageDrawable(getResources().getDrawable(R.drawable.heart_img));
        heart_img3.setImageDrawable(getResources().getDrawable(R.drawable.heart_img));
        questionNUmber=0;
        correctAnswer=0;
        wrongAnswer=3;
        updateQuestion();
        super.onStart();
    }

    public void btnOneClicked(View view){

        boolean option=QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(0).status;

        btn_option1.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option1.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(NumberQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option1.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(NumberQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }

        setDelay();

    }
    public void btnTwoClicked(View view){
        boolean option=QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(1).status;
        btn_option2.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option2.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(NumberQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option2.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(NumberQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }
        setDelay();

    }
    public void btnThreeClicked(View view){
        boolean option=QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(2).status;
        btn_option3.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option3.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(NumberQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {
            btn_option3.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(NumberQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();
            wrongAnswer=wrongAnswer-1;

        }
        setDelay();

    }
    public void btnFourClicked(View view){
        boolean option=QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(3).status;
        btn_option4.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option4.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(NumberQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();
        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option4.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(NumberQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }
        setDelay();
    }
    public void setDelay(){
        questionNUmber++;
        updateHeart();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(questionNUmber==5){
                    int coin=getCoins(NumberQuestionActivity.this);
                    coin=coin+correctAnswer;
                    setCoins(NumberQuestionActivity.this,coin);
                    if( correctAnswer==5){
                        int brain=getBrains(NumberQuestionActivity.this);
                        brain=brain+1;
                        setBrains( NumberQuestionActivity.this,brain);

                        startActivity(new Intent(NumberQuestionActivity.this, PlayAgainActivity.class));

                    }
                    else {

                        startActivity(new Intent(NumberQuestionActivity.this, TryAgainActivity.class));
                    }
                }else {

                    updateQuestion();
                }

            }
        }, 3000);
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
            int coin=getCoins(NumberQuestionActivity.this);
            coin=coin+correctAnswer;
            setCoins(NumberQuestionActivity.this,coin);
            startActivity(new Intent(NumberQuestionActivity.this, TryAgainActivity.class));
        }
    }

    public void updateQuestion(){
        number_img.setVisibility(View.VISIBLE);
        showTimer();
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
        btn_option1.setBackgroundColor(getResources().getColor(R.color.pink));
        btn_option2.setBackgroundColor(getResources().getColor(R.color.pink));
        btn_option3.setBackgroundColor(getResources().getColor(R.color.pink));
        btn_option4.setBackgroundColor(getResources().getColor(R.color.pink));
        number_img.setImageDrawable(getResources().getDrawable(QuestionList.getInstance().numberQuestionList.get(questionNUmber).questionImg));
        btn_option1.setText(QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(0).option);
        btn_option2.setText(QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(1).option);
        btn_option3.setText(QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(2).option);
        btn_option4.setText(QuestionList.getInstance().numberQuestionList.get(questionNUmber).optionArrayList.get(3).option);

    }

    public void showTimer(){
        btn_option1.setVisibility(View.INVISIBLE);
        btn_option2.setVisibility(View.INVISIBLE);
        btn_option3.setVisibility(View.INVISIBLE);
        btn_option4.setVisibility(View.INVISIBLE);
        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("0");
                long sec = (millisUntilFinished / 1000) % 60;
                textView.setText(f.format(sec));
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                textView.setText("");
                number_img.setVisibility(View.INVISIBLE);
                btn_option1.setVisibility(View.VISIBLE);
                btn_option2.setVisibility(View.VISIBLE);
                btn_option3.setVisibility(View.VISIBLE);
                btn_option4.setVisibility(View.VISIBLE);
            }
        }.start();
    }
}