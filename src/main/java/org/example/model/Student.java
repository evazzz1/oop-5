package org.example.model;

public class Student extends User {
    private Integer studentId;
    private Integer groupId;

    public Student(String birthday, String fullName) {
        super(birthday, fullName);
    }

    public Integer getStudentId() {
        return studentId;
    }
    public Integer getGroupId() {
        return groupId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", birthday='" + birthday + '\'' +
                ", fullName='" + fullName + '\'' +
                "groupId=" + groupId +
                '}';
    }
}
