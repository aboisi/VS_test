public class MethodReturn {
    public static int add(int x, int y) {
        int ans = x + y;
        return ans;
    }
    public static void main(String[] args) {
        int ans = add(100, 10);//addメソッドの呼び出し
        System.out.println("100 + 10 = " + ans);
    }
    
}
