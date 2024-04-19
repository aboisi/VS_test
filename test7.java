// 1~100までの整数のうち偶数のみの加算結果を求める
public class test7 {
    public static void main(String[] args) {
        int total1 = 0;
        int total2 = 0;
        // 偶数のみを生成して加算する
        for (int i = 0; i < 100; i += 2) {
            total1 += i;
        }
        System.out.println(total1);

        // 1～100まで全ての整数を生成し偶数か判断（判定）して加算する
        for (int i = 0; i < 100; i ++) {
            if (i % 2 == 0) {
                total2 += i;
            }
        }
        System.out.println(total2);
    }
}