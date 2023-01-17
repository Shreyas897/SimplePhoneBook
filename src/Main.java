public class Main {
    public static void main(String[] args) {
        LandLine l1=new LandLine("123");
        LandLine l2=new LandLine("446");
        l1.callNumber("456");
        l2.receiveCall("456");
        System.out.println("ringing :"+l2.isRinging());
        l2.answerCall();

    }
}