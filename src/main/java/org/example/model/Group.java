package org.example.model;

import java.util.List;

public class Group {
    private Integer numberOfGroup;
    private Teacher teacher;
    private List<Student> students;

    public Group(Teacher teacher, List<Student> students, Integer numberOfGroup) {
        this.teacher = teacher;
        this.students = students;
        this.numberOfGroup = numberOfGroup;
    }

    @Override
    public String toString() {
        return "Студенческая группа номер - "  + numberOfGroup +
                ", преподаватель в группе - " + teacher +
                ", стурднты в группе - " + students;
    }
}

