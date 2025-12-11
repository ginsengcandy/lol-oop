public class Main {
    public static void main(String[] args) {
        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");
        Champion garen = new Garen("가렌");
        Champion ahri = new Ahri("아리");
        Champion lux = new Lux("럭스");
        Champion leesin = new LeeSin("리신");

        System.out.println("=== 전투 시작 ===");
        garen.basicAttack(ahri);
        ahri.basicAttack(garen);
        lux.basicAttack(garen);
        leesin.basicAttack(garen);
        leesin.basicAttack(ahri);
        lux.basicAttack(ahri);


        garen.useQ(ahri);
        ahri.useQ(garen);
        lux.useQ(ahri);
        leesin.useQ(ahri);
        leesin.useQ(ahri);
        lux.useQ(ahri);
        garen.useQ(ahri);

        System.out.println("=== 전투 종료 ===");
        System.out.println("=== 전투 결과 ===");

        System.out.println(garen);
        System.out.println(ahri);
        System.out.println(lux);
        System.out.println(leesin);
    }
}
