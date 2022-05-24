package com.example.demo;

public class Hard {

    static String arr[] = new String[9];

    static int state;
    int c=0;
    static int color=10;
    static int color1=10;
    static int color2=10;


    public boolean tie (){

        int flag=0;
        for (int i=0;i<9;i++){

            if (arr[i] == "-"){
                flag=1;
            }
        }
        if (flag == 1){
            return false;
        }
        else
            return true;
    }


    public int bestmove(){

        int loc=0;
        int BestScore = -10;
        for (int i = 0; i < 9; i++) {
            if (arr[i].equalsIgnoreCase("-")) {
                arr[i] = "X";
                int score = MiniMax(arr,false);
                arr[i] = "-";
                if (score > BestScore){
                    BestScore = score;
                    loc=i;
                }
            }
        }
        return loc;
    }
    public int MiniMax(String arr[] ,boolean ismax){

        String res = test();
        String res1 = test1();

        if (res.equalsIgnoreCase("true")){
            return  1;
        }
       else if (res1.equalsIgnoreCase("true")){
            return -1;
        }
       else if ( tie() ){
           return 0;
        }
       else {

            if (ismax) {
                int BestScore = -100;
                for (int i = 0; i < 9; i++) {
                    if (arr[i].equalsIgnoreCase("-")) {
                        arr[i] = "X";
                        int score = MiniMax(arr,false);
                        arr[i] = "-";

                        if (score > BestScore){
                            BestScore = score;
                        }
                    }
                }
                return BestScore;
            }
            else{
                int BestScore = 100;
                for (int i = 0; i < 9; i++) {
                    if (arr[i].equalsIgnoreCase("-")) {
                        arr[i] = "O";
                        int score = MiniMax(arr,true);
                        arr[i] = "-";
                        if (score < BestScore){
                            BestScore = score;
                        }
                    }
                }
                return BestScore;
            }
        }



    }


    public void RePlay(){

        for (int i=0;i<9;i++){
            arr[i] = "-";
        }

    }
    public String printl(){
        int k=0;
        String str="";
        for (int i=0;i<9;i++){
            System.out.println(arr[i]);
        }
        return str;
    }

    public String test(){

        String str="--";
        if (arr[0].equalsIgnoreCase("x") && arr[1].equalsIgnoreCase("x") && arr[2].equalsIgnoreCase("x")){
            str = "true";
            color = 0;
            color1 = 1;
            color2 = 2;

        }
        else if (arr[3].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[5].equalsIgnoreCase("x")){
            str = "true";
            color = 3;
            color1 = 4;
            color2 = 5;

        }
        else  if (arr[6].equalsIgnoreCase("x") && arr[7].equalsIgnoreCase("x") && arr[8].equalsIgnoreCase("x")){
            str = "true";
            color = 6;
            color1 = 7;
            color2 = 8;
        }
        else  if (arr[0].equalsIgnoreCase("x") && arr[3].equalsIgnoreCase("x") && arr[6].equalsIgnoreCase("x")){
            str = "true";
            color = 0;
            color1 = 3;
            color2 = 6;
        }
        else  if (arr[1].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[7].equalsIgnoreCase("x")){
            str = "true";
            color = 1;
            color1 = 4;
            color2 = 7;
        }
        else  if (arr[2].equalsIgnoreCase("x") && arr[5].equalsIgnoreCase("x") && arr[8].equalsIgnoreCase("x")){
            str = "true";
            color = 5;
            color1 = 8;
            color2 = 2;
        }
        else if (arr[2].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[6].equalsIgnoreCase("x")){
            str = "true";
            color = 6;
            color1 = 4;
            color2 = 2;
        }
        else if (arr[0].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[8].equalsIgnoreCase("x")){
            color = 0;
            color1 = 4;
            color2 = 8;

        }
        else {
            str = "--";
        }
        return str;
    }
    public String test1(){

        String str="--";
        if (arr[0].equalsIgnoreCase("o") && arr[1].equalsIgnoreCase("o") && arr[2].equalsIgnoreCase("o")){
            str = "true";
            color = 0;
            color1 = 1;
            color2 = 2;

        }
        else if (arr[3].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[5].equalsIgnoreCase("o")){
            str = "true";
            color = 3;
            color1 = 4;
            color2 = 5;

        }
        else  if (arr[6].equalsIgnoreCase("o") && arr[7].equalsIgnoreCase("o") && arr[8].equalsIgnoreCase("o")){
            str = "true";
            color = 6;
            color1 = 7;
            color2 = 8;

        }
        else  if (arr[0].equalsIgnoreCase("o") && arr[3].equalsIgnoreCase("o") && arr[6].equalsIgnoreCase("o")){
            str = "true";
            color = 0;
            color1 = 3;
            color2 = 6;
        }
        else  if (arr[1].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[7].equalsIgnoreCase("o")){
            str = "true";
            color = 1;
            color1 = 4;
            color2 = 7;

        }
        else  if (arr[2].equalsIgnoreCase("o") && arr[5].equalsIgnoreCase("o") && arr[8].equalsIgnoreCase("o")){
            str = "true";
            color = 5;
            color1 = 8;
            color2 = 2;

        }
        else if (arr[2].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[6].equalsIgnoreCase("o")){
            str = "true";
            color = 6;
            color1 = 4;
            color2 = 2;

        }
        else if (arr[0].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[8].equalsIgnoreCase("o")){
            str = "true";
            color = 0;
            color1 = 4;
            color2 = 8;

        }
        else {
            str = "--";
        }
        return str;
    }
}
