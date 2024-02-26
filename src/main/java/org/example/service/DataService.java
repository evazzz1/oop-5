package org.example.service;

import org.example.model.User;

public interface DataService {
    User create(User user);

    User read(Integer id);

}
