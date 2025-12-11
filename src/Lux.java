public class Lux extends Champion implements RangedChampion{

    public Lux(String name){
        super(name,530, 61, 24);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연속타(Q)!");
        target.takeDamage(getAttackDamage() * 2);
    }

    @Override
    public void kite(){
        System.out.println(getName() + " 카이팅!");
    }
}
