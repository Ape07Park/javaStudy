package chepter4.collection.map.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        // 코드 작성
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        // 코드 작성
        memberMap.remove(id);
    }

    public Member findById(String id) {
        // 코드 작성
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        // 코드 작성

        Collection<Member> list = memberMap.values();

        for (Member member : list) {
            if (member.getName().equals(name)) {
                return member;
            }
        }

        return null;
    }
}
