package chepter2.final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "kim2");
        member.print();

        member.changeData("kim3");
        member.print();
    }
}
