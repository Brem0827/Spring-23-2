package ch04_pjt_03.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final Map<String, Member> members = new HashMap<>();

    @Override
    public Map<String, Member> getAllMembers() {
        return members;
    }

    @Override
    public Member getMember(String id) {
        return members.get(id);
    }

    @Override
    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public void updateMember(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public void deleteMember(String id) {
        members.remove(id);
    }
}