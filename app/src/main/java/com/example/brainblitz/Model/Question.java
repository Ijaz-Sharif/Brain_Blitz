package com.example.brainblitz.Model;

import java.util.ArrayList;

public class Question {

  public   String question;
  public   ArrayList<Option> optionArrayList;
public  int questionImg;
    public Question(String question, int questionImg, ArrayList<Option> optionArrayList) {
        this.question = question;
        this.questionImg=questionImg;
        this.optionArrayList = optionArrayList;
    }

    public Question(String question, ArrayList<Option> optionArrayList) {
        this.question = question;
        this.optionArrayList = optionArrayList;
    }

}
