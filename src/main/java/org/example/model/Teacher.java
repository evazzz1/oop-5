package org.example.model;

public class Teacher extends User {
    private Integer teacherId;
    private Integer groupId;

    public Integer getTeacherId() {
        return teacherId;
    }
    public Integer getGroupId() {
        return groupId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Teacher(String birthday, String fullName) {
        super(birthday, fullName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", birthday='" + birthday + '\'' +
                ", fullName='" + fullName + '\'' +
                "groupId=" + groupId +
                '}';
    }
}
