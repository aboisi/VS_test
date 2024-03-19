public class Array {
    public static void main(String[] args) {
        //配列の長さを調べる
        int[] scores = new int[5];
        int num = scores.length; // 配列の要素数の取得[配列変数名.length]
        System.out.println("要素の数:" + num);
        //配列の要素に値を代入
        scores[1] =30;
        System.out.println(scores[1]); 
        //省略記法
        int[] scores1 = new int[] {20, 30,40, 50, 80};
        int[] scores2 = {20, 30, 40, 50, 80};
        System.out.println(scores1[1]);
        System.out.println(scores2[2]);
    }
    
}
