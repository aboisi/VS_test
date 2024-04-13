public class test3 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10}; //配列
        for (int i = 0; i < number.length; i++) { //number.lengthは配列の要素数
            if (number[i] != 10) {
                System.out.print(number[i] + ","); //10以外のとき
            } else {
                System.out.print(number[i]); //10のとき
            }
        }
    }
}