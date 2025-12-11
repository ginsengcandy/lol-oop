public class Garen extends Champion implements MeleeChampion {

    public Garen(String name){
        super(name, GameConstants.START_HP, GameConstants.START_ATTACK, GameConstants.START_DEFENSE);
        System.out.println("정의의 전장으로!");
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 결정타(Q)!");
        target.takeDamage(getAttackDamage() + 30);
        Champion.battleCount++;
    }

    @Override
    public void dash(Champion target){
        System.out.println(getName() + " 돌진!");
        target.takeDamage(50);
    }
}