public class Array {
    public static void main(String[] args) {
        //配列の長さを調べる
        int[] scores = new int[5];
        int num = scores.length; // 配列の要素数の取得[配列変数名.length]
        System.out.println("要素の数:" + num);
        //配列の要素に値を代入
        scores[1] =30;
        System.out.println(scores[1]); 
        //省略記法
        int[] scores1 = new int[] {20, 30,40, 50, 80};
        int[] scores2 = {20, 30, 40, 50, 80};
        System.out.println(scores1[1]);
        System.out.println(scores2[2]);
        //配列とfor文
        for (int i = 0; i < scores1.length; i++) {
            System.out.println(scores1[i]);
        }
        //点数管理プログラム
        int[] scores3 = {20, 30, 40, 50, 80}; //科目の数や点数を変更したい場合はこの行のみ修正
        int sum = 0;
        for (int i = 0; i < scores3.length; i++ ) {
            sum += scores3[i];
        }
        int avg = sum / scores.length;
        System.out.println("合計点" + sum);
        System.out.println("平均点" + avg);
        //50点以上の科目の数を調べる
        int count = 0;
        for (int i = 0; i < scores3.length; i++) {
            if (scores3[i] >= 50) {
                count++;
            }
        }
        System.out.println("50点以上の科目の数は" + count);

        //DNAの記号をランダムに表示する
        int[] seq = new int[10];
        //塩基配列をランダムに生成
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
        }
        //生成した塩基配列の記号を表示
        for (int i = 0; i < seq.length; i++) {
            // switch(seq[i]) {
            //     case 0 -> {
            //         System.out.print("A ");
            //     }
            //     case 1 -> {
            //         System.out.print("T ");
            //     }
            //     case 2 -> {
            //         System.out.print("G ");
            //     }
            //     case 3 -> {
            //         System.out.print("C ");
            //     }
            // }

            //上記のswitchを3行に
            char[] base = {'A', 'T', 'G', 'C'};
            // int baseType = seq[i];//①
            // char baseChar = base[baseType];//②
            // System.out.print(baseChar + " ");//③
            //上記の①~③を1行に
            System.out.print(base[seq[i]] + " ");
        }
        //拡張for文
        int[] scores4 = {20, 30, 40, 50, 80};
        for (int value : scores4) {
            System.out.println(value);
        }
        
    }
    
}
