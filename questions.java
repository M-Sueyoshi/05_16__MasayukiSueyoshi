package com.company.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
//        診断ツール
        String qes[] = new String[5];
//        ここでString内に質問を入れる
        qes[0] = "　犬よりは猫派？";
        qes[1] = "　外より家派？";
        qes[2] = "　日本最高？";
        qes[3] = "　美味しいものを食べるなら遠くまで行く？";
        qes[4] = "　お酒はあまり飲まない？";


        String choice[] = new String[5];
//        ここで回答の選択肢を入れる
        choice[0] = "1. あてはまらない";
        choice[1] = " 2. あまりあてはまらない";
        choice[2] = " 3. まあまああてはまる";
        choice[3] = " 4. あてはまる";
        choice[4] = " 5. 興味ない";

// 選択肢をchoiceに格納
// 変数宣言
        int ttl = 0;
        int i = 0;
        int s = 0;
        int ans[] = new int[5];

        System.out.println("全部で5つのアンケートです！1~5の数字で答えてください！");
        for (i = 0; i < 5; i++) {
            System.out.println((i + 1) + "問目" + qes[i]);
//            質問を順番に表示
            for (s = 0; s < 5; s++) {
                if (s < 4) {
                    System.out.print(choice[s]);
//                4回目まではprintで選択しを表示
                } else {
//                5回目はprintlnと答えを打つ場所を入れる
                    System.out.println(choice[s]);
                    try {
                        Scanner scanner = new Scanner(System.in);
//                    答えを入れておく変数
                        ans[i] = scanner.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("1~5の数字でお答えください！");
                        System.out.println("最初からやり直し！！");
                        System.exit(0);
                    }
                }
            }
        }

//        ここまででアンケート終わり
//        ここから相性計算

        ttl = ans[0] + ans[1] + ans[2] + ans[3] * 2 + ans[4];
        int kakeru =ans[0] *ans[1] * ans[2] * ans[3] *  ans[4];
//        変数中身確認
//        for(i=0;i<5;i++){
//            System.out.println(ans[i]);
//
//        }

        if(kakeru%5 ==0){
            System.out.println("適当に答えないでくださいね？？");
//5. 興味ない"を選んでいるとアラート

        }else if (ttl< 6){
            System.out.println("結婚してください!!");
        }else if(ttl <10){
            System.out.println("好きです!付き合ってください！");
        }else if(ttl < 15){
            System.out.println("これからも仲良くしてください");
        }else{
            System.out.println("これから仲良くしてください");
        }
    }
}