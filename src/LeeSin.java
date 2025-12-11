public class LeeSin extends Champion implements MeleeChampion{

    public LeeSin(String name){
        super(name,530, 65, 35);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연발차기(Q)!");
        target.takeDamage(getAttackDamage() * 2);
    }

    @Override
    public void dash(Champion target) {
        System.out.println(getName() + " 돌격!");
        target.takeDamage(50);
    }
}
