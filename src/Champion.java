public abstract class Champion {
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    public Champion(String name, int hp, int attackDamage, int defense) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    public void basicAttack(Champion target) {
        System.out.println(name + " → " + target.name + " 기본 공격!");
        target.takeDamage(attackDamage);
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage < 0) actualDamage = 0;

        hp -= actualDamage;
        System.out.println(name + "이(가) " + actualDamage + " 피해를 입음! (남은 HP: " + hp + ")");
        if(hp<0) gameOver();
    }

    public int getAttackDamage(){
        return attackDamage;
    }

    public String getName() {
        return name;
    }

    public void gameOver(){
        System.out.println(getName() + " 사망!");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", attackDamage=" + attackDamage +
                ", defense=" + defense +
                '}';
    }

    public abstract void useQ(Champion target);
}


