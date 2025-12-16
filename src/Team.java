import java.util.ArrayList;
import java.util.List;

//잘못된 설계 예시
//public class Team<T> {private List<T> members;}
//위와 같이 코딩할 경우, T에 아무 데이터 타입이나 올 수 있다. 따라서 우리가 의도한 Team<챔피언명>, Team<Champion>과 같은 정상적인
// 자료구조뿐만 아니라 Team<String>, Team<Integer>와 같은 비정상적 자료구조까지 만들어질 수 있다.
// 따라서 T의 데이터 타입을 어느정도 강제하는 extends Champion 작성이 필요하다.


public class Team<T extends Champion> { //유사한 클래스로만 만들도록 한정
    private List<T> members = new ArrayList<>();
    private String teamName;
//    private int teamNumber;

    public Team(String teamName){
        this.teamName = teamName;
    }

    public void addMember(T champion){
        members.add(champion);
        System.out.println(champion.getName() + "이(가) " + teamName + " 팀에 합류!");
    }

    public T get(int index) {
        return members.get(index);
    }

    public int getTotalHp() {
        return members.stream()
                .mapToInt(Champion::getHp)
                .sum();
    }

    public List<T> getMembers() {
        return members;
    }

    public static void printTeamMembers(List<? extends Champion> team){
        for(Champion champion : team){
            System.out.println(champion.getName());
        }
    }
}
