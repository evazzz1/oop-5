package org.example.controller;

import org.example.model.Group;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.GroupService;
import org.example.service.UserService;
import org.example.view.View;

public class Controller {
    GroupService groupService;
    UserService userService;
    View view;

    public Controller() {
        userService = new UserService();
        view = new View();
        groupService = new GroupService();
    }

    public void run() {

        userService.create(new Teacher("1999", "Первый препод"));
        userService.create(new Student("1999", "Иванов"));
        userService.create(new Student("1999", "Петрова"));

        userService.create(new Teacher("1999", "Второй препод"));
        userService.create(new Student("1999", "Михайлова"));
        userService.create(new Student("1999", "Николаев"));

        userService.create(new Teacher("1999", "Третий препод"));
        userService.create(new Student("1999", "Иванов2"));
        userService.create(new Student("1999", "Петрова2"));

        userService.create(new Teacher("1999", "Первый препод"));
        userService.create(new Student("1999", "Михайлова2"));
        userService.create(new Student("1999", "Николаев2"));


        GroupService groupService1 = new GroupService();
        Group group1 = groupService1.CreateGroup(userService.getListTeacher().get(0), userService.getListStudent(0),0 );
        Group group2 = groupService1.CreateGroup(userService.getListTeacher().get(1), userService.getListStudent(1),1 );
        Group group3 = groupService1.CreateGroup(userService.getListTeacher().get(2), userService.getListStudent(2),2 );
        Group group4 = groupService1.CreateGroup(userService.getListTeacher().get(0), userService.getListStudent(3),3 );
        view.print(group1);
        view.print(group2);
        view.print(group3);
        view.print(group4);

    }
}

