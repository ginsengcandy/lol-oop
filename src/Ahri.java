public class Ahri extends Champion implements RangedChampion{

    public Ahri(String name){
        super(name,570, 59, 28);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연사(Q)!");
        target.takeDamage(getAttackDamage() * 2);
    }

    @Override
    public void kite(){
        System.out.println(getName() + " 카이팅!");
    }
}
