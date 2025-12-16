import java.util.*;

public class Battle {
    private static Random random = new Random();

    public static void onevsOne(Team<Champion> t1, Team<Champion> t2){
        Champion c1 = randomPick(t1.getMembers()); //선수 임의 선정 1
        Champion c2 = randomPick(t2.getMembers()); //선수 임의 선정 2

        System.out.println("\n===== 1:1 전투 시작 =====");
        System.out.println(c1.getName() + " vs " + c2.getName()); //선수1 vs 선수2 표기

        c1.basicAttack(c2); //상호 공격
        c2.basicAttack(c1);

        c1.useQ(c2); //상호 공격
        c2.useQ(c1);
    }

    public static Champion randomPick(List<Champion> list){
        return list.get(random.nextInt(list.size()));
    }
}
