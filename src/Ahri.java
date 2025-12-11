public class Ahri extends Champion implements RangedChampion{

    public Ahri(String name){
        super(name, GameConstants.START_HP, GameConstants.START_ATTACK, GameConstants.START_DEFENSE);
        System.out.println("오늘은 또 어떤 새로운 경험 앞에서, 당당히 맞서볼까?");
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연사(Q)!");
        target.takeDamage(getAttackDamage() * 2);
        Champion.battleCount++;
    }

//    @Override
//    public void levelup(){
//        level++;
//        System.out.println("레벨업!");
//    }

    @Override
    public void kite(){
        System.out.println(getName() + " 카이팅!");
    }
}
