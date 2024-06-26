import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() { //MPを5消費すると自分自身のHPを最大まで回復する
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println("HPが最大まで回復した");
    }

    public void pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");

        //理論上の回復量を乱数を用いて決定する
        int recover = new Random().nextInt(3) + sec;//祈った秒数にランダムで0~2を加える

        //実際の回復量を計算する
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);//MAX_MPから現在のMPを引いた値とrecoverを比べて小さい方を代入する

        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }
}