package org.example.model;

public abstract class User {
    protected String birthday;
    protected String fullName;

    public User(String birthday, String fullName) {
        this.birthday = birthday;
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "birthday='" + birthday + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
