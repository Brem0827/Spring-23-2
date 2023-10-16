package ch05_pjt_01.contact;

public class ContactSet {

	private String id;
    private String pw;
    private String name;
    private String num1;
    private String num2;
    private String email;
    private String phone;
    private String address;
    private String job;

    public ContactSet(String id, String pw, String name, String num1, String num2, String email, String phone, String address, String job) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}