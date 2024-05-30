package com.example.brainblitz.MultiplicationScreen;

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
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brainblitz.ColockScreens.ClockQuestionActivity;
import com.example.brainblitz.DaysScreen.DayQuestionActivity;
import com.example.brainblitz.Model.QuestionList;
import com.example.brainblitz.R;
import com.example.brainblitz.Screens.PlayAgainActivity;
import com.example.brainblitz.Screens.TryAgainActivity;

public class MultiplicationQuestionActivity extends AppCompatActivity {
    TextView question_9br;
    Button btn_option2,btn_option1,btn_option3,btn_option4;

    int questionNUmber=0;
    int correctAnswer=0;
    ImageView multi_img;
    Animation shake;
    int wrongAnswer=3;
    ImageView heart_img1,heart_img2,heart_img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_question);

        QuestionList.getInstance().addMultiplicationQuestion();
        btn_option2=findViewById(R.id.btn_option2);
        btn_option1=findViewById(R.id.btn_option1);
        btn_option3=findViewById(R.id.btn_option3);
        btn_option4=findViewById(R.id.btn_option4);
        question_9br=findViewById(R.id.question_9br);
        multi_img=findViewById(R.id.multi_img);
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

        boolean option=QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(0).status;

        btn_option1.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option1.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(MultiplicationQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option1.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(MultiplicationQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }

        setDelay();

    }
    public void btnTwoClicked(View view){
        boolean option=QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(1).status;
        btn_option2.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option2.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(MultiplicationQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option2.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(MultiplicationQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }
        setDelay();

    }
    public void btnThreeClicked(View view){
        boolean option=QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(2).status;
        btn_option3.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            wrongAnswer=wrongAnswer-1;
            btn_option3.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(MultiplicationQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();

        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option3.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(MultiplicationQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();


        }
        setDelay();

    }
    public void btnFourClicked(View view){
        boolean option=QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(3).status;
        btn_option4.startAnimation(shake);
        if(option){
            correctAnswer=correctAnswer+1;
            btn_option4.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(MultiplicationQuestionActivity.this,"Correct answer",Toast.LENGTH_LONG).show();
        }
        else {
            wrongAnswer=wrongAnswer-1;
            btn_option4.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(MultiplicationQuestionActivity.this,"wrong answer",Toast.LENGTH_LONG).show();

        }
        setDelay();
    }
    public void setDelay(){
        updateHeart();
        questionNUmber++;
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(questionNUmber==6){
                    int coin=getCoins(MultiplicationQuestionActivity.this);
                    coin=coin+correctAnswer;
                    setCoins(MultiplicationQuestionActivity.this,coin);
                    if( correctAnswer==6){
                        int brain=getBrains(MultiplicationQuestionActivity.this);
                        brain=brain+1;
                        setBrains( MultiplicationQuestionActivity.this,brain);

                        startActivity(new Intent(MultiplicationQuestionActivity.this, PlayAgainActivity.class));

                    }
                    else {
                        startActivity(new Intent(MultiplicationQuestionActivity.this, TryAgainActivity.class));
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
            int coin=getCoins(MultiplicationQuestionActivity.this);
            coin=coin+correctAnswer;
            setCoins(MultiplicationQuestionActivity.this,coin);
            startActivity(new Intent(MultiplicationQuestionActivity.this, TryAgainActivity.class));
        }
    }
    public void updateQuestion(){
        String q_text="Question";
        if(getLanguage(this).equals("eng")){
            q_text="Question";
        }
        else {
            q_text="Soru";
        }
        int question=questionNUmber;
        question=question+1;
        question_9br.setText(q_text+" "+question+"/6");
        btn_option1.setBackgroundColor(getResources().getColor(R.color.pink));
        btn_option2.setBackgroundColor(getResources().getColor(R.color.pink));
        btn_option3.setBackgroundColor(getResources().getColor(R.color.pink));
        btn_option4.setBackgroundColor(getResources().getColor(R.color.pink));
        multi_img.setImageDrawable(getResources().getDrawable(QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).questionImg));
        btn_option1.setText(QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(0).option);
        btn_option2.setText(QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(1).option);
        btn_option3.setText(QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(2).option);
        btn_option4.setText(QuestionList.getInstance().MultiplicationQuestionList.get(questionNUmber).optionArrayList.get(3).option);

    }
}