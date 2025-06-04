package chepter2.construct;

public class MemberInitMain2 {

   public static void main(String[] args) {

       MemberInit member1 = new MemberInit();

       initMember(member1, "user1", 20, 90);

       MemberInit member2 = new MemberInit();

       initMember(member2, "user2", 30, 80);

       MemberInit[] members = {member1, member2};

       for (MemberInit member : members) {
           System.out.println(member.name + " " + member.age + " " + member.grade);
       }
       
   }

   static void initMember(MemberInit member, String name, int age, int grade) {
       member.name = name;
       member.age = age;
       member.grade = grade;
   }
}
