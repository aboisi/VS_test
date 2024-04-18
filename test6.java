// 1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題
public class test6 {
    public static void main(String[] args) {
        int counts = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                counts++;
                sum += i;
            }
        }
        System.out.println("偶数：" + counts + "個");
        System.out.println("偶数の合計：" + sum );
    } 
}