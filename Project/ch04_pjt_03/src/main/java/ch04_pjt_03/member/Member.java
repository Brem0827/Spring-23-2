package ch04_pjt_03.member;

public class Member {
    private String id;
    private String password;
    private String contact;
    private String email;
    private String joinDate;
    private String lastUpdateDate;

    // 생성자, 게터, 세터 등 필요한 메서드 추가

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 다른 필드의 게터, 세터도 필요하다면 추가
}