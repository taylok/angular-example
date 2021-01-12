package com.kmt.angularexample.service;

import com.kmt.angularexample.domain.Users;
import com.kmt.angularexample.repostiory.UsersRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersService {
    private UsersRepository usersRepository;

    public UsersService( UsersRepository usersRepository ) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public Users saveUser( Users users) {
        return usersRepository.save(users);
    }
}
