package com.example.data.controller;


import com.example.data.enitys.Userinfo;
import com.example.data.service.UserinfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @PostMapping
    public Userinfo createuser(@RequestBody Userinfo userinfo) {
        return userinfoService.addUser(userinfo);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id) {
        userinfoService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<Userinfo> updateUser(@PathVariable long id, @RequestBody Userinfo userinfo) {
        Userinfo updatedUser = userinfoService.getUser(id, userinfo);
        return ResponseEntity.ok(updatedUser);
    }



    @GetMapping
    public List<Userinfo> getAllusers() {
        return userinfoService.getAllUsers();
    }


}
/*

 */