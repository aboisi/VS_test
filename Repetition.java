public class Repetition {
    public static void main(String[] args) {
        //for文
        for (int i = 0; i < 10; i++) {
            System.out.println("こんにちは");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("現在" + (i + 1) + "周目");
        }

        //ループ変数を1からスタートする
        for (int i = 1; i < 10; i++) {
            System.out.println("現在" + i);
        }
        //ループ変数を2つずつ増やす
        for (int i = 0; i < 10; i +=2) {
            System.out.println(i);
        }
        //ループ変数を10から1ずつ1まで減らしていく
        for (int i = 10; i > 0; i--) {
            System.out.println("現在" + i);
        }
        //ループ変数を初期化しない
        int j = 3;
        for (; j < 10; j++) {
            System.out.println(j);
        }
        // //繰り返し時の処理を行わない
        // for (int i = 0; i< 10;) {
        //     System.out.println("現在" + i);
        // }
        //複雑なfor文を避ける
        for (int i = 0; i < 10; i++) {
            int l = i * 2;
            System.out.println("現在" + l);
        }
        //九九の表
        for (int i = 1; i < 10; i++) {
            for (int l = 1; l < 10; l++) {
                System.out.print(i * l);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        //break文
        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        //continue文
        for (int i = 1; i <10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
