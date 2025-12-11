public abstract class Champion {
    private final String name; //생성자로 딱 한 번 초기화, 이후 변경 불가
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;
    private static int createdCount; //공용으로 사용
    protected static int battleCount;

    public Champion(String name, int hp, int attackDamage, int defense) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
        createdCount++;
        System.out.println(name + "님이 참여하셨습니다.");
    }

    public static int getCreatedCount(){
        return createdCount;
    }

    public static int getBattleCount(){
        return battleCount;
    }

    public int getHp() {
        return hp;
    }

    public final void resurrect(){
        //체력, 공격력, 방어력 초기화
        hp = GameConstants.START_HP;
        attackDamage = GameConstants.START_ATTACK;
        defense = GameConstants.START_DEFENSE;
    }

    public final void levelup(){ //상속 자체가 불가하다
        if(level>=GameConstants.MAX_LEVEL){
            System.out.println("레벨업 불가: 이미 최고 레벨입니다!");
        }
        else{
            level++;
            System.out.println("레벨업!");
        }
    }


    public void basicAttack(Champion target) {
        System.out.println(name + " → " + target.name + " 기본 공격!");
        target.takeDamage(attackDamage);
        Champion.battleCount++;
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


