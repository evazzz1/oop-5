package org.example.service;

import java.util.ArrayList;
import java.util.List;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

public class UserService implements DataService {

    private List<User> userList;
    private List<Student> studentList;
    private List<Teacher> teacherList;
    private List<Student> postList;

    public UserService() {
        userList = new ArrayList<>();
        studentList = new ArrayList<>();
        teacherList = new ArrayList<>();
    }

    @Override
    public User create(User user) {
        int countStudent = 0;
        int countTeacher = 0;
        int numberOfGroup = -2;
        for (User elem : userList) {
            if (elem instanceof Student) {
                countStudent++;
            } else {
                numberOfGroup++;
                countTeacher++;
            }
        }
        if (user instanceof Student) {
            ((Student) user).setStudentId(countStudent + 1);
            ((Student) user).setGroupId(numberOfGroup + 1);
            studentList.add((Student) user);
            userList.add(user);
        } else {
            ((Teacher) user).setTeacherId(countTeacher + 1);
            ((Teacher) user).setGroupId(numberOfGroup + 2);
            teacherList.add((Teacher) user);
            userList.add(user);
        }
        return user;
    }

    @Override
    public User read(Integer id) {
        for (User elem : userList) {
            if (elem instanceof Student &&
                    ((Student) elem).getStudentId().equals(id)) {
                return elem;
            }
        }
        return null;
    }
    public List<Student> getListStudent(int numOfGr) {
        postList = new ArrayList<>();
        for (User elem : studentList) {
            if (elem instanceof Student) {
                Student student = (Student) elem;
                if (student.getGroupId() != null && student.getGroupId() == numOfGr) {
                    postList.add(student);
                }
            }
        }
        return postList;
    }
    public List<Teacher> getListTeacher()
    {
        return teacherList;
    }

}
