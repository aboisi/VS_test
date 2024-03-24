public class Method1_4 {
    public static void methodA() {
        System.out.println("methodA");
        methodB();//methodB()を呼び出す
    }
    public static void methodB() {
        System.out.println("methodB");
    }
    public static void main(String[] args) {
        methodA();//methodA()を呼び出す
    }
    //main()→methodA()→methodB()