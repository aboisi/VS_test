// 入力された2つの数の和を出力するプログラムを作成しなさい。
//  入力する数は、共に整数とする。
//  負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
public class test8 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("整数を入力してください");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println(a + b);
    }
}