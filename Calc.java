package calcapp.main;
import calcapp.logics.CalcLogic;//FQCN入力の手間を軽減
public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogic.tasu(a, b);//FQCNでなくてもエラーにならない
        int delta = calcapp.logics.CalcLogic.hiku(a, b);//FQCNを指定してもよい
        System.out.println("足すと" + total + "、引くと" + delta);
    }
    
}
