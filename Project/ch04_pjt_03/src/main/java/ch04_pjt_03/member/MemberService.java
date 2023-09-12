package ch04_pjt_03.member;

import java.util.HashMap;
import java.util.Map;

public interface MemberService {

    Map<String, Member> getAllMembers();

    Member getMember(String id);

    void addMember(Member member);

    void updateMember(Member member);

    void deleteMember(String id);
}