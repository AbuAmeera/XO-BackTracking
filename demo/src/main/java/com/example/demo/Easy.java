package com.example.demo;

import java.util.Random;

public class Easy {
    static int c=0;
    static String arr[] = new String[9];

    public void RePlay(){

        for (int i=0;i<9;i++){
            arr[i] = "-";
        }

    }

    public void print(){

            int k=0;
        for (int i=0;i<9;i++){
                arr[i] = "-";
                k++;

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

    public boolean isTied(int i) {
                if ( !(arr[i].equalsIgnoreCase("o"))  && !(arr[i].equalsIgnoreCase("x"))) {
                    return false;
                }


        return true;
    }

    public void computerPlay() {
        Random rand = new Random();
        int flag =0;
        int upperbound = 9;
        int int_random = rand.nextInt(upperbound);

                if(!(isTied(int_random))) {
                    arr[int_random] = "O";

                }
                else {
                    computerPlay();
                }


    }





    public String test(){

        String str="--";
        if (arr[0].equalsIgnoreCase("x") && arr[1].equalsIgnoreCase("x") && arr[2].equalsIgnoreCase("x")){
            str = "truex";

        }
        else if (arr[3].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[5].equalsIgnoreCase("x")){
            str = "truex";

        }
        else  if (arr[6].equalsIgnoreCase("x") && arr[7].equalsIgnoreCase("x") && arr[8].equalsIgnoreCase("x")){
            str = "truex";

        }
        else  if (arr[0].equalsIgnoreCase("x") && arr[3].equalsIgnoreCase("x") && arr[6].equalsIgnoreCase("x")){
            str = "truex";

        }
        else  if (arr[1].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[7].equalsIgnoreCase("x")){
            str = "truex";

        }
        else  if (arr[2].equalsIgnoreCase("x") && arr[5].equalsIgnoreCase("x") && arr[8].equalsIgnoreCase("x")){
            str = "truex";

        }
        else if (arr[2].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[6].equalsIgnoreCase("x")){
            str = "truex";

        }
        else if (arr[0].equalsIgnoreCase("x") && arr[4].equalsIgnoreCase("x") && arr[8].equalsIgnoreCase("x")){
            str = "truex";

        }
        else {
            str = "--";
        }
        return str;
    }
    public String test1(){

        String str="--";
        if (arr[0].equalsIgnoreCase("o") && arr[1].equalsIgnoreCase("o") && arr[2].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else if (arr[3].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[5].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else  if (arr[6].equalsIgnoreCase("o") && arr[7].equalsIgnoreCase("o") && arr[8].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else  if (arr[0].equalsIgnoreCase("o") && arr[3].equalsIgnoreCase("o") && arr[6].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else  if (arr[1].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[7].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else  if (arr[2].equalsIgnoreCase("o") && arr[5].equalsIgnoreCase("o") && arr[8].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else if (arr[2].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[6].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else if (arr[0].equalsIgnoreCase("o") && arr[4].equalsIgnoreCase("o") && arr[8].equalsIgnoreCase("o")){
                str = "trueo";

        }
        else {
            str = "--";
        }
        return str;
    }

}
