// 入力された2つの数の和を出力するプログラムを作成しなさい。
//  入力する数は、共に整数とする。
//  負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
public class test8 {
    public static void main(String[] args) {
        int a;
        int b;
        do {
            System.out.print("-10000～10000の範囲の整数を入力してください。");
            a = new java.util.Scanner(System.in).nextInt();
            if (a < -10000 || a > 10000) {
                System.out.println("範囲外です。再度入力してください。");
            }
        } while (a < -10000 || a > 10000);
        

        do {
            System.out.print("-10000～10000の範囲の整数を入力してください。");
            b = new java.util.Scanner(System.in).nextInt();
            if (b < -10000 || b > 10000) {
                System.out.println("範囲外です。再度入力してください。");
            }
        } while (b < -10000 || b > 10000);
        System.out.println(a + b);
    }
}