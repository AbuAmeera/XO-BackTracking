package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Driver extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group g = new Group();

        Button easy = new Button("Easy");
        Button vs = new Button("1Vs1");
        Button hard = new Button("Hard");

        easy.setPrefSize(65,35);
        vs.setPrefSize(65,35);
        hard.setPrefSize(65,35);

        hard.setLayoutX(220);
        vs.setLayoutX(120);
        easy.setLayoutX(20);

        hard.setLayoutY(60);
        vs.setLayoutY(60);
        easy.setLayoutY(60);
        g.getChildren().addAll(easy,vs,hard);
///////////////////////////////////////////////
        Group vsg = new Group();
        Scene vsscene = new Scene(vsg, 330, 500);
        Stage vsstage = new Stage();

        Button v1 = new Button ("-");
        v1.setPrefSize(100,100);

        Button v2 = new Button ("-");
        v2.setPrefSize(100,100);
        v2.setLayoutX(110);

        Button v3 = new Button ("-");
        v3.setPrefSize(100,100);
        v3.setLayoutX(220);

        Button v4 = new Button ("-");
        v4.setPrefSize(100,100);

        v4.setLayoutY(110);

        Button v5 = new Button ("-");
        v5.setPrefSize(100,100);
        v5.setLayoutX(110);
        v5.setLayoutY(110);

        Button v6 = new Button ("-");
        v6.setPrefSize(100,100);
        v6.setLayoutX(220);
        v6.setLayoutY(110);

        Button v7= new Button ("-");
        v7.setPrefSize(100,100);
        v7.setLayoutY(220);

        Button v8 = new Button ("-");
        v8.setPrefSize(100,100);
        v8.setLayoutX(110);
        v8.setLayoutY(220);

        Button v9 = new Button ("-");
        v9.setPrefSize(100,100);
        v9.setLayoutX(220);
        v9.setLayoutY(220);



        Label vans = new Label("");
        vans.setLayoutX(140);
        vans.setLayoutY(340);
        Button vre = new Button("RePlay");
        vre.setLayoutY(340);


        vsg.getChildren().addAll(v1,v2,v3);
        vsg.getChildren().addAll(v4,v5,v6);
        vsg.getChildren().addAll(v7,v8,v9,vans,vre);

/////////////////////////////////////////////
        Group eg = new Group();
        Scene escene = new Scene(eg, 330, 500);
        Stage estage = new Stage();

        Button t1 = new Button ("-");
        t1.setPrefSize(100,100);

        Button t2 = new Button ("-");
        t2.setPrefSize(100,100);
        t2.setLayoutX(110);

        Button t3 = new Button ("-");
        t3.setPrefSize(100,100);
        t3.setLayoutX(220);

        Button t4 = new Button ("-");
        t4.setPrefSize(100,100);

        t4.setLayoutY(110);

        Button t5 = new Button ("-");
        t5.setPrefSize(100,100);
        t5.setLayoutX(110);
        t5.setLayoutY(110);

        Button t6 = new Button ("-");
        t6.setPrefSize(100,100);
        t6.setLayoutX(220);
        t6.setLayoutY(110);

        Button t7= new Button ("-");
        t7.setPrefSize(100,100);
        t7.setLayoutY(220);

        Button t8 = new Button ("-");
        t8.setPrefSize(100,100);
        t8.setLayoutX(110);
        t8.setLayoutY(220);

        Button t9 = new Button ("-");
        t9.setPrefSize(100,100);
        t9.setLayoutX(220);
        t9.setLayoutY(220);

        Label ans = new Label("");
        ans.setLayoutX(140);
        ans.setLayoutY(340);
        Button re = new Button("RePlay");
        re.setLayoutY(340);

        eg.getChildren().addAll(t1,t2,t3);
        eg.getChildren().addAll(t4,t5,t6);
        eg.getChildren().addAll(t7,t8,t9,ans,re);
//////////////////////////////////////////////////////////////
        Group hg = new Group();
        Scene hscene = new Scene(hg, 330, 500);
        Stage hstage = new Stage();

        Button h1 = new Button ("-");
        h1.setPrefSize(100,100);

        Button h2 = new Button ("-");
        h2.setPrefSize(100,100);
        h2.setLayoutX(110);

        Button h3 = new Button ("-");
        h3.setPrefSize(100,100);
        h3.setLayoutX(220);

        Button h4 = new Button ("-");
        h4.setPrefSize(100,100);

        h4.setLayoutY(110);

        Button h5 = new Button ("-");
        h5.setPrefSize(100,100);
        h5.setLayoutX(110);
        h5.setLayoutY(110);

        Button h6 = new Button ("-");
        h6.setPrefSize(100,100);
        h6.setLayoutX(220);
        h6.setLayoutY(110);

        Button h7= new Button ("-");
        h7.setPrefSize(100,100);
        h7.setLayoutY(220);

        Button h8 = new Button ("-");
        h8.setPrefSize(100,100);
        h8.setLayoutX(110);
        h8.setLayoutY(220);

        Button h9 = new Button ("-");
        h9.setPrefSize(100,100);
        h9.setLayoutX(220);
        h9.setLayoutY(220);

        Label hans = new Label("");
        hans.setLayoutX(140);
        hans.setLayoutY(340);
        Button hre = new Button("RePlay");
        hre.setLayoutY(340);

        Button rev = new Button("Back");
        hg.getChildren().addAll(h1,h2,h3);
        hg.getChildren().addAll(h4,h5,h6);
        rev.setLayoutY(400);
        hg.getChildren().addAll(h7,h8,h9,hans,hre,rev);



        Hard h = new Hard();
        Easy ea = new Easy();
        Vs v = new Vs();
        v.RePlay();
        ea.print();
        h.RePlay();


        Button arr[] = new Button[9];
        arr[0]=t1;arr[1]=t2;arr[2]=t3;arr[3]=t4;arr[4]=t5;arr[5]=t6;arr[6]=t7;arr[7]=t8;arr[8]=t9;

        Button harr[] = new Button[9];
        harr[0]=h1;harr[1]=h2;harr[2]=h3;harr[3]=h4;harr[4]=h5;harr[5]=h6;harr[6]=h7;harr[7]=h8;harr[8]=h9;

        Button varr[] = new Button[9];
        varr[0]=v1;varr[1]=v2;varr[2]=v3;varr[3]=v4;varr[4]=v5;varr[5]=v6;varr[6]=v7;varr[7]=v8;varr[8]=v9;




        AtomicReference<AtomicInteger> ff= new AtomicReference<>(new AtomicInteger());
        AtomicInteger flag = new AtomicInteger(1);

        vre.setOnAction(e->{
            v.RePlay();
            for (int i = 0; i < 9; i++) {
                varr[i].setText(ea.arr[i]);
            }
            for (int i = 0; i < 9; i++) {
                varr[i].setDisable(false);
            }
            vans.setText("");
            flag.set(1);
        });
        v1.setOnAction(e->{
            if (flag.get() == 1){
                v1.setText("X");
                v.arr[0]="X";
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
                flag.set(2);
            }
            else{
                v1.setText("O");
                flag.set(1);
                v.arr[0]="O";
                if(v.test1().equalsIgnoreCase("trueo")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v2.setOnAction(e->{
            if (flag.get() == 1){
                v2.setText("X");
                v.arr[1]="X";
                flag.set(2);
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v2.setText("O");
                flag.set(1);
                v.arr[1]="O";
                if(v.test1().equalsIgnoreCase("trueo")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v3.setOnAction(e->{
            if (flag.get() == 1){
                v3.setText("X");
                v.arr[2]="X";
                flag.set(2);
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v3.setText("O");
                flag.set(1);
                v.arr[2]="O";
                if(v.test1().equalsIgnoreCase("trueO")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v4.setOnAction(e->{
            if (flag.get() == 1){
                v4.setText("X");
                v.arr[3]="X";
                flag.set(2);
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v4.setText("O");
                flag.set(1);
                v.arr[3]="O";
                if(v.test1().equalsIgnoreCase("trueo")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v5.setOnAction(e->{
            if (flag.get() == 1){
                v5.setText("X");
                flag.set(2);
                v.arr[4]="X";
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                   vans.setText("X Wins");
                }
            }
            else{
                v5.setText("O");
                flag.set(1);
                v.arr[4]="O";
                if(v.test1().equalsIgnoreCase("trueO")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v6.setOnAction(e->{
            if (flag.get() == 1){
                v6.setText("X");
                flag.set(2);
                v.arr[5]="X";
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v6.setText("O");
                flag.set(1);
                v.arr[5]="O";
                if(v.test1().equalsIgnoreCase("trueO")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v7.setOnAction(e->{
            if (flag.get() == 1){
                v7.setText("X");
                flag.set(2);
                v.arr[6]="X";
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v7.setText("O");
                flag.set(1);
                v.arr[6]="O";
                if(v.test1().equalsIgnoreCase("trueO")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v8.setOnAction(e->{
            if (flag.get() == 1){
                v8.setText("X");
                flag.set(2);
                v.arr[7]="X";
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v8.setText("O");
                flag.set(1);
                v.arr[7]="O";
                if(v.test1().equalsIgnoreCase("trueO")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });
        v9.setOnAction(e->{
            if (flag.get() == 1){
                v9.setText("X");
                flag.set(2);
                v.arr[8]="X";
                if(v.test().equalsIgnoreCase("truex")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("X Wins");
                }
            }
            else{
                v9.setText("O");
                flag.set(1);
                v.arr[8]="O";
                if(v.test1().equalsIgnoreCase("trueO")){
                    for (int i = 0; i < 9; i++) {
                        varr[i].setDisable(true);
                    }
                    vans.setText("O Wins");
                }
            }
        });


        re.setOnAction(e->{
            ea.RePlay();
            for (int i = 0; i < 9; i++) {
                arr[i].setText(ea.arr[i]);
            }
            for (int i = 0; i < 9; i++) {
                arr[i].setDisable(false);
            }
            ans.setText("");
            ff.set(new AtomicInteger());
        });
        arr[0].setOnAction(e->{
            if (arr[0].getText().equals("-")) {
                ea.arr[0] = "X";
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                ff.get().getAndIncrement();
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("O Wins");
                    }
                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }

        });
        arr[1].setOnAction(e->{
            if (arr[1].getText().equals("-")) {
                ea.arr[1] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("o Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[2].setOnAction(e->{
            if (arr[2].getText().equals("-")) {
                ea.arr[2] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("o Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[3].setOnAction(e->{
            if (arr[3].getText().equals("-")) {
                ea.arr[3] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("o Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[4].setOnAction(e->{
            if (arr[4].getText().equals("-")) {
                ea.arr[4] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("o Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[5].setOnAction(e->{
            if (arr[5].getText().equals("-")) {
                ea.arr[5] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("O Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[6].setOnAction(e->{
            if (arr[6].getText().equals("-")) {
                ea.arr[6] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("O Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[7].setOnAction(e->{
            if (arr[7].getText().equals("-")) {
                ea.arr[7] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("O Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });
        arr[8].setOnAction(e->{

            if (arr[8].getText().equals("-")) {
                ea.arr[8] = "X";
                ff.get().getAndIncrement();
                if (ea.test().equalsIgnoreCase("truex")) {
                    for (int i = 0; i < 9; i++) {
                        arr[i].setDisable(true);
                    }
                    ans.setText("X Wins");
                }
                if (ff.get().get() < 9) {
                    ea.computerPlay();
                    if (ea.test1().equalsIgnoreCase("trueo")) {
                        for (int i = 0; i < 9; i++) {
                            arr[i].setDisable(true);
                        }
                        ans.setText("O Wins");
                    }

                    ff.get().getAndIncrement();
                }
                for (int i = 0; i < 9; i++) {
                    arr[i].setText(ea.arr[i]);
                }
            }
        });


        int f= h.bestmove();
//        h.arr[f]="X";
//        harr[f].setText("X");

        for (int i=0;i<9;i++){

            int finalI = i;
            harr[i].setOnAction(e->{
                if (harr[finalI].getText().equals("-") ){

                    h.arr[finalI]="O";
                    harr[finalI].setText("O");

                    int pp =h.bestmove();

                    h.arr[pp]="X";
                    harr[pp].setText("X");
                    if (h.test().equalsIgnoreCase("true")) {
                            for (int i1 = 0; i1 < 9; i1++) {
                                harr[i1].setDisable(true);

                            }
                            hans.setText("X Wins");

                            harr[h.color].setStyle("-fx-background-color: #00FF00; ");
                            harr[h.color1].setStyle("-fx-background-color: #00FF00; ");
                            harr[h.color2].setStyle("-fx-background-color: #00FF00; ");
                        }

                }
            });
        }


        hre.setOnAction(e->{
            h.RePlay();
            for (int i = 0; i < 9; i++) {
                harr[i].setText(h.arr[i]);
            }
            for (int i = 0; i < 9; i++) {
                harr[i].setDisable(false);
            }
            hans.setText("");

//            h.arr[0]="X";
//            harr[0].setText("X");

            for (int i = 0; i < 9; i++) {
                harr[i].setStyle("-fx-background-color: #C0C0C0; ");
            }

        });


        easy.setOnAction(e->{
            stage.setScene(escene);
        });
        vs.setOnAction(e->{
            stage.setScene(vsscene);
        });
        hard.setOnAction(e->{
            stage.setScene(hscene);
            for (int i = 0; i < 9; i++) {
                harr[i].setStyle("-fx-background-color: #C0C0C0; ");
            }
        });


        Scene scene = new Scene(g, 300, 170);
        rev.setOnAction(e->{
            stage.setScene(scene);
        });
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}