package org.example.service;

import java.util.ArrayList;
import java.util.List;
import org.example.model.Group;
import org.example.model.Student;
import org.example.model.Teacher;
public class GroupService {

    public Group CreateGroup(Teacher teacher, List<Student>students, Integer num){
        List<Student> list = new ArrayList<>();
        list.addAll(students);
        return new Group(teacher,list,num);
    }
}
