public class MethodReturn2 {
    public static int add(int x, int y) {
        int ans = x + y;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(add(add(10, 20), add(30, 40)));
    }
    //①add(10, 20)とadd(30, 40)が実行され、add(30, 70)になる
    //②add(30, 70)が実行される
}
