package com.example.brainblitz.NumberScreens;

import static com.example.brainblitz.Utils.Constant.getLanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.brainblitz.MultiplicationScreen.InfoMultiplicationActivity;
import com.example.brainblitz.MultiplicationScreen.MultiplicationQuestionActivity;
import com.example.brainblitz.R;

import java.util.ArrayList;

public class InfoNumberActivity extends AppCompatActivity {
    ImageView number_img;
    Button btn_multi;
    int totalMNumber=0;
    ArrayList<Integer> numberArrayList=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_number);

        numberArrayList.add(R.drawable.number1);
        numberArrayList.add(R.drawable.number2);
        numberArrayList.add(R.drawable.number3);
        numberArrayList.add(R.drawable.number4);
        numberArrayList.add(R.drawable.number5);
        btn_multi=findViewById(R.id.btn_multi);
        number_img=findViewById(R.id.number_img);
        number_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(getLanguage(InfoNumberActivity.this).equals("eng")){
                   if(btn_multi.getText().toString().equals("next")){

                       totalMNumber++;
                       number_img.setImageDrawable(getResources().getDrawable(numberArrayList.get(totalMNumber)));

                       if(totalMNumber==4){
                           btn_multi.setText("start");
                       }
                   }
                   else {
                       startActivity(new Intent(InfoNumberActivity.this, NumberQuestionActivity.class));
                   }
               }
               else {
                   if(btn_multi.getText().toString().equals("Sonraki")){

                       totalMNumber++;
                       number_img.setImageDrawable(getResources().getDrawable(numberArrayList.get(totalMNumber)));

                       if(totalMNumber==4){
                           btn_multi.setText("başlangıç");
                       }
                   }
                   else {
                       startActivity(new Intent(InfoNumberActivity.this, NumberQuestionActivity.class));
                   }
               }


            }
        });
    }

    @Override
    protected void onStart() {
        if(getLanguage(this).equals("eng")){
            btn_multi.setText("next");
        }
        else {
            btn_multi.setText("Sonraki");
        }
        super.onStart();
    }
}