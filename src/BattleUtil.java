public class BattleUtil {
    public static Champion higherHp(Champion a, Champion b){
        if(a.getHp() >= b.getHp()){
            return a;
        } else{
            return b;
        }
    }
}
