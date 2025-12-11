public class Lux extends Champion implements RangedChampion{

    public Lux(String name){
        super(name, GameConstants.START_HP, GameConstants.START_ATTACK, GameConstants.START_DEFENSE);
        System.out.println("모두 함께, 데마시아를 위해!");
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연속타(Q)!");
        target.takeDamage(getAttackDamage() * 2);
        Champion.battleCount++;
    }

    @Override
    public void kite(){
        System.out.println(getName() + " 카이팅!");
    }
}
