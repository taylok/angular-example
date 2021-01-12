package com.kmt.angularexample.controller;

import com.kmt.angularexample.domain.Users;
import com.kmt.angularexample.links.UsersLinks;
import com.kmt.angularexample.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UsersController {

    @Autowired
    UsersService userService;

    @GetMapping(path = UsersLinks.LIST_USERS)
    public ResponseEntity<?> listUsers() {
        log.info("UsersController:  list users");
        List<Users> resource = userService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = UsersLinks.ADD_USER)
    public ResponseEntity<?> saveUser(@RequestBody Users user) {
        log.info("UsersController:  list users");
        Users resource = userService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}
