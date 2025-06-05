package chepter2.construct;

public class ConstructMain2 {

    public static void main(String[] args) {

        // 객체를 생성 - new MemberConstruct() 를 하자마자 MemberConstruct("user1", 15, 90)를 호출한다
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {

            System.out.println(member.name + " " + member.age + " " + member.grade);
        }


    }
}
