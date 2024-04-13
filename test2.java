public class test2 {
    public static void main(String[] args) {
        int count = 0; //偶数の個数をカウントする変数を初期化
        int sum = 0; //偶数の合計を計算する変数を初期化
        for (int i = 1; i <= 10; i ++) {
            if (i % 2 == 0) {
                count ++; 
                sum += i;
            }
        }
        System.out.println("1から10までの偶数の個数：" + count);
        System.out.println("1から10までの偶数の和:" + sum);
    }
}