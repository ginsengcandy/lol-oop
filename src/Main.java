import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Summoner summoner = new Summoner("김세현");
        System.out.println("환영합니다, " + summoner.getName()+" 소환사님");
        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");
        Champion garen = new Garen("가렌");
        Champion ahri = new Ahri("아리");
        Champion lux = new Lux("럭스");
        Champion leesin = new LeeSin("리신");

//        System.out.println("생성된 챔피언 수 : " + Champion.getCreatedCount());
//        System.out.println("최대 레벨 : " + GameConstants.MAX_LEVEL);
//        System.out.println("기본 CDR : " + GameConstants.BASE_CDR);

//        Champion champion = BattleUtil.higherHp(garen, ahri);
//        System.out.println(champion + "이 더 체력이 높습니다");
//
//        System.out.println("=== 전투 시작 ===");
//        garen.basicAttack(ahri);
//        ahri.basicAttack(garen);
//        lux.basicAttack(garen);
//        leesin.basicAttack(garen);
//        leesin.basicAttack(ahri);
//        lux.basicAttack(ahri);
//
//        garen.useQ(ahri);
//        ahri.useQ(garen);
//        lux.useQ(ahri);
//        leesin.useQ(ahri);
//        leesin.useQ(ahri);
//        lux.useQ(ahri);
//        garen.useQ(ahri);
//
//        System.out.println("=== 전투 종료 ===");
//        System.out.println("=== 전투 결과 ===");
//
//        System.out.println("총 전투 횟수 : " + Champion.getBattleCount());
//
//        System.out.println(garen);
//        System.out.println(ahri);
//        System.out.println(lux);
//        System.out.println(leesin);

        //챔피언 Pool 구성
        ChampionPool pool = new ChampionPool();
        pool.addChampion(garen);
        pool.addChampion(ahri);
        pool.addChampion(leesin);
        pool.addChampion(lux);

        //팀 생성
        Team<Champion> blue = new Team("블루");
        Team<Champion> red = new Team("레드");

        //팀 배치
        blue.addMember(pool.get("가렌"));
        blue.addMember(pool.get("아리"));
        red.addMember(pool.get("리신"));
        red.addMember(pool.get("럭스"));

        //팀 정보 출력(전체 체력)
        System.out.println("블루팀 전체 체력: " + blue.getTotalHp());
        System.out.println("레드팀 전체 체력: " + red.getTotalHp());

//        Battle.onevsOne(red, blue);
        List<Garen> garens = new ArrayList<>();
        garens.add(new Garen("garen1"));
        garens.add(new Garen("garen2"));
        garens.add(new Garen("garen3"));

        List<Champion> champions = new ArrayList<>();
        champions.add(ahri);
        champions.add(lux);
        champions.add(leesin);

        Team.printTeamMembers(garens); //Champion 또는 그 하위 타입을 허용
        Team.printTeamMembers(champions);
    }
}
