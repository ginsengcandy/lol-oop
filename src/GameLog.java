public class GameLog {
    public static class LogEntry{
        private String message;

        public LogEntry(String message){ //클래스임과 동시에 생성자
            this.message = message;
        }
        public void print(){
            System.out.println("[LOG]" + message);
        }
    }
}
