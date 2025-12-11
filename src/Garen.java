public class Garen extends Champion implements MeleeChampion {

    public Garen(String name){
        super(name, 620, 66, 36);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 결정타(Q)!");
        target.takeDamage(getAttackDamage() + 30);
    }

    @Override
    public void dash(Champion target){
        System.out.println(getName() + " 돌진!");
        target.takeDamage(50);
    }
}