package com.example.brainblitz.Model;

import static com.example.brainblitz.Utils.Constant.getLanguage;

import android.content.Context;

import com.example.brainblitz.R;

import java.util.ArrayList;

public class QuestionList {
    private static final QuestionList instance = new QuestionList();
    public static QuestionList getInstance() {
        return instance;
    }
   public ArrayList<Question> dayQuestionList=new ArrayList<Question>();

    public ArrayList<Question> clockQuestionList=new ArrayList<Question>();

    public ArrayList<Question> seasonQuestionList=new ArrayList<Question>();
    public ArrayList<Question> yearQuestionList=new ArrayList<Question>();

    public ArrayList<Question> MultiplicationQuestionList=new ArrayList<Question>();

    public ArrayList<Question> directionQuestionList=new ArrayList<Question>();
    public ArrayList<Question> numberQuestionList=new ArrayList<Question>();

    public ArrayList<Question> similerQuestionList=new ArrayList<Question>();

    public void addSimilerQuestion(Context context){
        similerQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option(R.drawable.bear04+"",false));
        optionArrayList.add(new Option(R.drawable.bear03+"",false));
        optionArrayList.add(new Option(R.drawable.bear02+"",false));
        optionArrayList.add(new Option(R.drawable.bear05+"",true));




        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option(R.drawable.cat01+"",false));
        optionArrayList1.add(new Option(R.drawable.cat04+"",true));
        optionArrayList1.add(new Option(R.drawable.cat02+"",false));
        optionArrayList1.add(new Option(R.drawable.cat03+"",false));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option(R.drawable.lion05+"",false));
        optionArrayList2.add(new Option(R.drawable.lion04+"",false));
        optionArrayList2.add(new Option(R.drawable.lion01+"",true));
        optionArrayList2.add(new Option(R.drawable.lion03+"",false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option(R.drawable.monkey01+"",true));
        optionArrayList3.add(new Option(R.drawable.monkey02+"",false));
        optionArrayList3.add(new Option(R.drawable.monkey03+"",false));
        optionArrayList3.add(new Option(R.drawable.monkey04+"",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option(R.drawable.zebra02+"",false));
        optionArrayList4.add(new Option(R.drawable.zebra03+"",true));
        optionArrayList4.add(new Option(R.drawable.zebra04+"",false));
        optionArrayList4.add(new Option(R.drawable.zebra05+"",false));

        if(getLanguage(context).equals("eng")){
            similerQuestionList.add(new Question("FIND THE SAME BEAR THAT SHOWN ABOVE",R.drawable.bear05,optionArrayList));
            similerQuestionList.add(new Question("FIND THE SAME CAT THAT SHOWN ABOVE",R.drawable.cat04,optionArrayList1));
            similerQuestionList.add(new Question("FIND THE SAME LION THAT SHOWN ABOVE",R.drawable.lion01,optionArrayList2));
            similerQuestionList.add(new Question("FIND THE SAME MONKEY THAT SHOWN ABOVE",R.drawable.monkey01,optionArrayList3));
            similerQuestionList.add(new Question("FIND THE SAME ZEBRA THAT SHOWN ABOVE",R.drawable.zebra03,optionArrayList4));

        }
        else {
            similerQuestionList.add(new Question("AYNISINI BULUN ………",R.drawable.bear05,optionArrayList));
            similerQuestionList.add(new Question("AYNISINI BULUN ………",R.drawable.cat04,optionArrayList1));
            similerQuestionList.add(new Question("AYNISINI BULUN ………",R.drawable.lion01,optionArrayList2));
            similerQuestionList.add(new Question("AYNISINI BULUN ………",R.drawable.monkey01,optionArrayList3));
            similerQuestionList.add(new Question("AYNISINI BULUN ………",R.drawable.zebra03,optionArrayList4));
        }

    }

    public void addNumberQuestion(){
        numberQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("7 2 0 9 2 8",false));
        optionArrayList.add(new Option("7 3 0 9 2 4",false));
        optionArrayList.add(new Option("7 3 0 8 3 8",false));
        optionArrayList.add(new Option("7 3 0 9 2 8",true));
        numberQuestionList.add(new Question("9 * 2 =",R.drawable.number1,optionArrayList));


        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("5 2 6 0 4 9",false));
        optionArrayList1.add(new Option("5 1 6 0 4 9",true));
        optionArrayList1.add(new Option("5 1 6 0 4 8",false));
        optionArrayList1.add(new Option("5 1 6 0 3 9",false));
        numberQuestionList.add(new Question("8 * 3 =",R.drawable.number2,optionArrayList1));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("9 2 6 0 7 5",true));
        optionArrayList3.add(new Option("9 2 6 1 7 5",false));
        optionArrayList3.add(new Option("9 2 6 0 7 6",false));
        optionArrayList3.add(new Option("9 2 5 0 7 5",true));
        numberQuestionList.add(new Question("6 * 5 =",R.drawable.number3,optionArrayList3));


        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("1 7 4 8 2 6",false));
        optionArrayList4.add(new Option("1 7 3 8 2 6",true));
        optionArrayList4.add(new Option("1 7 3 8 1 6",false));
        optionArrayList4.add(new Option("1 7 3 9 2 6",false));
        numberQuestionList.add(new Question("9 * 9 =",R.drawable.number4,optionArrayList4));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("6 0 9 8 4 8",false));
        optionArrayList2.add(new Option("6 0 8 2 4 8",false));
        optionArrayList2.add(new Option("6 0 9 2 4 8",true));
        optionArrayList2.add(new Option("6 0 9 2 3 8",false));
        numberQuestionList.add(new Question("7 * 6 =",R.drawable.number5,optionArrayList2));







    }
    public void addMultiplicationQuestion(){
        MultiplicationQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("13",false));
        optionArrayList.add(new Option("22",false));
        optionArrayList.add(new Option("16",false));
        optionArrayList.add(new Option("18",true));
        MultiplicationQuestionList.add(new Question("9 * 2 =",R.drawable.image1,optionArrayList));


        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("18",false));
        optionArrayList1.add(new Option("24",true));
        optionArrayList1.add(new Option("21",false));
        optionArrayList1.add(new Option("23",false));
        MultiplicationQuestionList.add(new Question("8 * 3 =",R.drawable.image2,optionArrayList1));

        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("42",true));
        optionArrayList2.add(new Option("51",false));
        optionArrayList2.add(new Option("36",false));
        optionArrayList2.add(new Option("48",false));
        MultiplicationQuestionList.add(new Question("7 * 6 =",R.drawable.image3,optionArrayList2));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("28",false));
        optionArrayList3.add(new Option("34",false));
        optionArrayList3.add(new Option("38",false));
        optionArrayList3.add(new Option("30",true));
        MultiplicationQuestionList.add(new Question("6 * 5 =",R.drawable.image4,optionArrayList3));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("78",false));
        optionArrayList4.add(new Option("81",true));
        optionArrayList4.add(new Option("72",false));
        optionArrayList4.add(new Option("90",false));
        MultiplicationQuestionList.add(new Question("9 * 9 =",R.drawable.image5,optionArrayList4));

        ArrayList<Option> optionArrayList5=new ArrayList<>();
        optionArrayList5.add(new Option("74",false));
        optionArrayList5.add(new Option("82",false));
        optionArrayList5.add(new Option("78",false));
        optionArrayList5.add(new Option("80",true));
        MultiplicationQuestionList.add(new Question("10 * 8 =",R.drawable.image6,optionArrayList5));




    }

    public void addDaysQuestion(Context context){
        dayQuestionList.clear();
            ArrayList<Option> optionArrayList=new ArrayList<>();
            optionArrayList.add(new Option("Wednesday",false));
            optionArrayList.add(new Option("Monday",true));
            optionArrayList.add(new Option("Friday",false));
            optionArrayList.add(new Option("Sunday",false));
            if(getLanguage(context).equals("eng")){
                dayQuestionList.add(new Question("WHAT IS THE FIRST DAY OF THE WEEK?",optionArrayList));

            }
            else {
                dayQuestionList.add(new Question("HAFTANIN İLK GÜNÜ NEDİR?",optionArrayList));

            }


            ArrayList<Option> optionArrayList1=new ArrayList<>();
            optionArrayList1.add(new Option("Sunday",false));
            optionArrayList1.add(new Option("Tuesday",false));
            optionArrayList1.add(new Option("Friday",false));
            optionArrayList1.add(new Option("Wednesday",true));
            if(getLanguage(context).equals("eng")){
                dayQuestionList.add(new Question("WHAT IS THE THIRD DAY OF THE WEEK?",optionArrayList1));

            }else {
                dayQuestionList.add(new Question("HAFTANIN 3. GÜNÜ NEDİR?",optionArrayList1));

            }


            ArrayList<Option> optionArrayList2=new ArrayList<>();
            optionArrayList2.add(new Option("Thursday",false));
            optionArrayList2.add(new Option("Sunday",true));
            optionArrayList2.add(new Option("Friday",false));
            optionArrayList2.add(new Option("Monday",false));
            if(getLanguage(context).equals("eng")){
                dayQuestionList.add(new Question("WHAT IS THE LAST DAY OF THE WEEK?",optionArrayList2));

            }else {
                dayQuestionList.add(new Question("HAFTANIN SON GÜNÜ HANGİSİ?",optionArrayList2));

            }





    }

    public void addYearQuestion(Context context){
        yearQuestionList.clear();
            ArrayList<Option> optionArrayList=new ArrayList<>();
            optionArrayList.add(new Option("March",false));
            optionArrayList.add(new Option("October",false));
            optionArrayList.add(new Option("May",false));
            optionArrayList.add(new Option("January",true));
            if(getLanguage(context).equals("eng")){
                yearQuestionList.add(new Question("WHAT IS THE FIRST MONTH OF THE YEAR?",optionArrayList));

            }
            else {
                yearQuestionList.add(new Question("YILIN İLK AYI HANGİSİDİR?",optionArrayList));

            }


            ArrayList<Option> optionArrayList1=new ArrayList<>();
            optionArrayList1.add(new Option("November",false));
            optionArrayList1.add(new Option("May",true));
            optionArrayList1.add(new Option("February",false));
            optionArrayList1.add(new Option("July",false));
            if(getLanguage(context).equals("eng")){
                yearQuestionList.add(new Question("WHICH MONTH COMES AFTER APRIL?",optionArrayList1));

            }else {
                yearQuestionList.add(new Question("NİSANDAN SONRA HANGİ AY GELİR?",optionArrayList1));

            }


            ArrayList<Option> optionArrayList2=new ArrayList<>();
            optionArrayList2.add(new Option("April",false));
            optionArrayList2.add(new Option("December",false));
            optionArrayList2.add(new Option("September",true));
            optionArrayList2.add(new Option("March",false));
            if(getLanguage(context).equals("eng")){
                yearQuestionList.add(new Question("WHICH MONTH COMES BEFORE OCTOBER?",optionArrayList2));

            }else {
                yearQuestionList.add(new Question("EKİM AYINDAN ÖNCE HANGİ AY GELİR?",optionArrayList2));

            }

            ArrayList<Option> optionArrayList3=new ArrayList<>();
            optionArrayList3.add(new Option("December",true));
            optionArrayList3.add(new Option("May",false));
            optionArrayList3.add(new Option("August",false));
            optionArrayList3.add(new Option("March",false));
            if(getLanguage(context).equals("eng")){
                yearQuestionList.add(new Question("WHAT IS THE LAST MONTH OF THE YEAR?",optionArrayList3));

            }
            else {
                yearQuestionList.add(new Question("YILIN SON AYI NEDİR?",optionArrayList3));

            }




    }

    public void addClockQuestion(Context context){
        clockQuestionList.clear();



        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("Three O'clock",false));
        optionArrayList.add(new Option("One O'clock",true));
        optionArrayList.add(new Option("Six O'clock",false));
        optionArrayList.add(new Option("Four O'clock",false));
        if(getLanguage(context).equals("eng")){
            clockQuestionList.add(new Question("WHAT IS THE TIME?",R.drawable.clock_1,optionArrayList));

        }
        else {
            clockQuestionList.add(new Question("SAAT KAÇ?",R.drawable.clock_1,optionArrayList));

        }


        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("Half Past Ten",false));
        optionArrayList1.add(new Option("Half Past Two",false));
        optionArrayList1.add(new Option("Half Past One",true));
        optionArrayList1.add(new Option("Half Past Seven",false));
        if(getLanguage(context).equals("eng")){
            clockQuestionList.add(new Question("WHAT IS THE TIME?",R.drawable.clock_2,optionArrayList1));

        }
        else {
            clockQuestionList.add(new Question("SAAT KAÇ?",R.drawable.clock_2,optionArrayList1));

        }


        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("Quarter Past Nine",false));
        optionArrayList2.add(new Option("Quarter Past Three",false));
        optionArrayList2.add(new Option("Quarter Past Eleven",false));
        optionArrayList2.add(new Option("Quarter Past One",true));
        if(getLanguage(context).equals("eng")){
            clockQuestionList.add(new Question("WHAT IS THE TIME?",R.drawable.clock_3,optionArrayList2));

        }
        else {
            clockQuestionList.add(new Question("SAAT KAÇ?",R.drawable.clock_3,optionArrayList2));

        }

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("Quarter To Three",false));
        optionArrayList3.add(new Option("Quarter To Six",false));
        optionArrayList3.add(new Option("Quarter To Eight",false));
        optionArrayList3.add(new Option("Quarter To Two",true));

        if(getLanguage(context).equals("eng")){
            clockQuestionList.add(new Question("WHAT IS THE TIME?",R.drawable.clock_4,optionArrayList3));

        }
        else {
            clockQuestionList.add(new Question("SAAT KAÇ?",R.drawable.clock_4,optionArrayList3));

        }




    }
    public void addSeasonQuestion(Context context){
        seasonQuestionList.clear();
            ArrayList<Option> optionArrayList=new ArrayList<>();
            optionArrayList.add(new Option("Spring",true));
            optionArrayList.add(new Option("Fall",false));
            optionArrayList.add(new Option("Summer",false));
            optionArrayList.add(new Option("Winter",false));

            if(getLanguage(context).equals("eng")){
                seasonQuestionList.add(new Question("WHAT IS THIS SEASON?",R.drawable.spring,optionArrayList));

            }
            else {
                seasonQuestionList.add(new Question("BU SEZON NEDİR?",R.drawable.spring,optionArrayList));

            }


            ArrayList<Option> optionArrayList1=new ArrayList<>();
            optionArrayList1.add(new Option("Spring",false));
            optionArrayList1.add(new Option("Fall",false));
            optionArrayList1.add(new Option("Summer",false));
            optionArrayList1.add(new Option("Winter",true));
            if(getLanguage(context).equals("eng")){
                seasonQuestionList.add(new Question("WHAT IS THIS SEASON?",R.drawable.winter,optionArrayList1));

            }
            else {
                seasonQuestionList.add(new Question("BU SEZON NEDİR?",R.drawable.winter,optionArrayList1));

            }


            ArrayList<Option> optionArrayList2=new ArrayList<>();
            optionArrayList2.add(new Option("Spring",false));
            optionArrayList2.add(new Option("Fall",false));
            optionArrayList2.add(new Option("Summer",true));
            optionArrayList2.add(new Option("Winter",false));
            if(getLanguage(context).equals("eng")){
                seasonQuestionList.add(new Question("WHAT IS THIS SEASON?",R.drawable.summer,optionArrayList2));

            }
            else {
                seasonQuestionList.add(new Question("BU SEZON NEDİR?",R.drawable.summer,optionArrayList2));

            }

            ArrayList<Option> optionArrayList3=new ArrayList<>();
            optionArrayList3.add(new Option("Spring",false));
            optionArrayList3.add(new Option("Fall",true));
            optionArrayList3.add(new Option("Summer",false));
            optionArrayList3.add(new Option("Winter",false));
            if(getLanguage(context).equals("eng")){
                seasonQuestionList.add(new Question("WHAT IS THIS SEASON?",R.drawable.fall,optionArrayList3));

            }else {
                seasonQuestionList.add(new Question("BU SEZON NEDİR?",R.drawable.fall,optionArrayList3));

            }




    }

    public void addDirectionQuestion(Context context){
        directionQuestionList.clear();
        ArrayList<Option> optionArrayList=new ArrayList<>();
        optionArrayList.add(new Option("In front of the box",false));
        optionArrayList.add(new Option("Behind of the box",true));
        optionArrayList.add(new Option("Right of the box",false));
        optionArrayList.add(new Option("Left of the box",false));


        ArrayList<Option> optionArrayList1=new ArrayList<>();
        optionArrayList1.add(new Option("Behind of the box",false));
        optionArrayList1.add(new Option("Between of the box",false));
        optionArrayList1.add(new Option("In front of the box",false));
        optionArrayList1.add(new Option("Right of the box",true));


        ArrayList<Option> optionArrayList2=new ArrayList<>();
        optionArrayList2.add(new Option("In front of the box",false));
        optionArrayList2.add(new Option("Right of the box",false));
        optionArrayList2.add(new Option("Between of the box",true));
        optionArrayList2.add(new Option("Behind of the box",false));

        ArrayList<Option> optionArrayList3=new ArrayList<>();
        optionArrayList3.add(new Option("Behind of the box",false));
        optionArrayList3.add(new Option("Between of the box",false));
        optionArrayList3.add(new Option("In front of the box",true));
        optionArrayList3.add(new Option("Left of the box",false));

        ArrayList<Option> optionArrayList4=new ArrayList<>();
        optionArrayList4.add(new Option("Right of the box",false));
        optionArrayList4.add(new Option("Left of the box",true));
        optionArrayList4.add(new Option("In front of the box",false));
        optionArrayList4.add(new Option("Between of the box",false));


        if(getLanguage(context).equals("eng")){
            directionQuestionList.add(new Question("WHERE IS THE BOY?",R.drawable.behind_no_text,optionArrayList));
            directionQuestionList.add(new Question("WHERE IS THE BOY?",R.drawable.right_no_text,optionArrayList1));
            directionQuestionList.add(new Question("WHERE IS THE BOY?",R.drawable.between_no_text,optionArrayList2));
            directionQuestionList.add(new Question("WHERE IS THE BOY?",R.drawable.front_no_text,optionArrayList3));
            directionQuestionList.add(new Question("WHERE IS THE BOY?",R.drawable.left_no_text,optionArrayList4));

        }

        else {
            directionQuestionList.add(new Question("ÇOCUK NEREDE?",R.drawable.behind_no_text,optionArrayList));
            directionQuestionList.add(new Question("ÇOCUK NEREDE?",R.drawable.right_no_text,optionArrayList1));
            directionQuestionList.add(new Question("ÇOCUK NEREDE?",R.drawable.between_no_text,optionArrayList2));
            directionQuestionList.add(new Question("ÇOCUK NEREDE?",R.drawable.front_no_text,optionArrayList3));

            directionQuestionList.add(new Question("ÇOCUK NEREDE?",R.drawable.left_no_text,optionArrayList4));



        }



    }


}
