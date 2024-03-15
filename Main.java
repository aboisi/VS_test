public class Main {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(5 + 3);
        System.out.println("5 + 2");
        System.out.println("こんにちは" + "世界");
        // 変数
        int number;
        number = 10;
        System.out.println(number);

        // String name;
        // name = "Sato";
        // System.out.println(name);

        String msg = "HelloWorld!";
        System.out.println(msg);

        // int型変数の計算
        int number1 = 10;
        System.out.println(number1 + 3);

        int number2 = 5;
        System.out.println(number1 + number2);
        
        // String型変数の連結
        String greeting = "こんにちは";
        System.out.println(greeting + "佐藤さん");

        // String name = "鈴木さん";
        // System.out.println(greeting + name);

        // 変数の更新
        String name = "Sato";
        System.out.println(name);

        name = "Suzuki";
        System.out.println(name);
        // 変数を上書きする際に変数名の前にデータ型をつけるとエラーになる

        // 自己代入
        int x = 3;
        System.out.println(x);
        x = x + 2;
        System.out.println(x);
        // 省略形
        x += 10;
        x -= 10;
        x *= 10;
        x /= 10;
        x %= 10;
        // 1を足す、1を引く省略形
        x++;
        x--;

        int length = 6;
        int height = 8;

        // 四角形の面積
        int rectangleArea = length * height;
        System.out.println(rectangleArea);
        // 三角形の面積
        int triangleArea = rectangleArea /2;
        System.out.println(triangleArea);

        // int型(整数)
        // double型(小数)
        double number3 = 5.82;
        System.out.println(number3);
        double number4 = 3.4;
        System.out.println(number3 + number4);

        //char型
        char zodiac;
        zodiac = '辰';//文字データは(')で囲む
        System.out.println(zodiac);
        //String型
        String name1;
        name1 = "すがわら";//文字列データは(")で囲む
        System.out.println(name1);

        //練習1-2
        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);

        //16進数
        int aa = 0x11;//先頭に0xをつける
        System.out.println(aa);
        //8進数
        int bb = 011;//先頭に0をつける
        System.out.println(bb);
        //2進数
        int cc = 0b11;//先頭に0bをつける
        System.out.println(cc);

        //エスケープシーケンス
        System.out.println("私の好きな記号は二重引用符（\"）です");
        System.out.println("文を途中で\n改行");

        //テキストブロックを用いた複数行の文字列
        String prof1 = "名前：朝香あゆみ\n      (あさかあゆみ)";
        String prof2 = """
                       名前：湊雄輔
                             (みなとゆうすけ)
                       """;
        System.out.println(prof1);
        System.out.println(prof2);

        //演算子
        System.out.println(9/2);// 9/2だと4と評価される
        System.out.println(9.0/2);
        System.out.println(9/2.0);

    }
}