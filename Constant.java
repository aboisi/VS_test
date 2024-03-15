public class Constant {
    public static void main(String[] args) {
        //定数の宣言
        //final 型 定数名 = 初期値;
        final double PI = 3.14;//定数名は大文字
        int pie = 5;
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
        System.out.println("パイの半径を倍にします");
        // PI = 10; コンパイルエラーとなり間違いに気づく
        pie = 10;
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
    }
}
