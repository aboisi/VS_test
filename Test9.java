//適当な配列の要素の中から2番目に大きい数字を表示させる
//例int[] num = {15, 9, 12, 10, 6, 8, 16 , 5, 13 ,14};
public class Test9 {
    public static void main(String[] args) {
        int[] num = {15, 9, 12, 10, 6, 8, 16 , 5, 13 ,14};
        int a = num[0];
        //一番大きい数字をaに代入
        for (int i = 0; i < num.length; i++) { 
            if (num[i] > a) { //直前の要素と比べ大きい方をaに代入
                a = num[i];
            }
            // System.out.println(a);
        }
        System.out.println("一番大きい数字：" + a);

        //一番大きい数字を0に置き換える
        for (int i = 0; i < num.length; i++) {
           if (num[i] == a) {
            num[i] = 0;
           }
        }

        //  System.out.println(num[0]);
        //bに2番目に大きい数字を代入
        a = 0;
        for (int i = 0; i < num.length; i++) { 
            if (num[i] > a) { //直前の要素と比べ大きい方をaに代入
                a = num[i];
            }
        }
        
        System.out.println("二番目に大きい数字：" + a);
    }
}