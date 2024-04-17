public class test4 {
    public static void main(String[] args) {
        String str = "";
        //要素数20の配列を宣言
        int[] numbers = new int[20];
        numbers[0] = 0;
        //要素に0から5ずつ加算して代入
        for(int i = 1; i < numbers.length; i ++) {
            numbers[i] = numbers[i - 1] + 5;
            // System.out.print(numbers[i]);
        }
        
        System.out.print("奇数：");
        for(int i = 0; i < 11; i ++) { //[0]~[10]の値を取り出す
            if (numbers[i] % 2 != 0) { //奇数は真
                    str += numbers[i] + ",";
            }
        }
        System.out.print(str.substring(0, str.length() - 1));

        str = "";
        System.out.print("偶数：");
        for(int i = 11; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                str += numbers[i] + ",";
            }
        }
        System.out.print(str.substring(0, str.length() - 1));
    }
}