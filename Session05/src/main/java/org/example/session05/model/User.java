package org.example.session05.model;

public class User {
    private int id;
    private String fullname;
    private int age;
    private String email;
    private String phone;
    private String avatar;

    public User(int i, String nguyenVanA, String mail, int i1, String abc, String number, String s) {
    }

    public User(int id, String fullname, int age, String email, String phone, String avatar) {


        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
