package chepter4.collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public String getId() {
        return id;
    }

    public MemberOnlyHash(String id) {
        this.id = id;
    }


    /**
     * 참조값 대신 id 를 활용해 해시코드 생성
     * id는 고유 식별자
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" +
            "id='" + id + '\'' +
            '}';
    }
}
