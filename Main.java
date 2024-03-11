class Main {
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

    }
}