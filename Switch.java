public class Switch {
    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch (fortune) {
            case 1, 2 -> {
                System.out.println("いいね！");
            }
            case 3 -> {
                System.out.println("普通です");
            }
            case 4, 5 -> {
                System.out.println("うーん…");
            }
        }

        //伝統的なswitch文
        System.out.println("あなたの運勢を占います");
        int fortune1 = new java.util.Random().nextInt(5) + 1;
        switch (fortune1) {
            case 1, 2:
                System.out.println("いいね！");
            break;
            case 3:
                System.out.println("普通です");
            break;
            case 4, 5:
                System.out.println("うーん…");
            break;
        }

        //結果を変数sに代入
        int fortune2 = new java.util.Random().nextInt(5) + 1;
        String s = switch (fortune2) {
            case 1 -> "大吉";
            case 2 -> "中吉";
            case 3 -> "吉";
            default -> "凶";
        };
        System.out.println("運勢は" + s);

        //条件が2つの場合(三項条件演算子)
        int age = new java.util.Random().nextInt(80);
        String a = age >= 18 ? "成人" : "未成人";
        System.out.println(a);
    }
    
}
