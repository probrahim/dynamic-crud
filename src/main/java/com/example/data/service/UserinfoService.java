package com.example.data.service;


import com.example.data.enitys.Userinfo;
import com.example.data.repository.UserinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserinfoService {

    @Autowired
    private UserinfoRepository userinfoRepository;


    public Userinfo addUser(Userinfo userinfo) {
        return userinfoRepository.save(userinfo);
    }
    public Userinfo editUser(long id , Userinfo userinfo) {
        userinfo.setId(id);
        return userinfoRepository.save(userinfo);
    }
    public void deleteUser(long id) {
        userinfoRepository.deleteById(id);
    }
    public List<Userinfo> getAllUsers() {
        return userinfoRepository.findAll();
    }
    //update user

    public Userinfo getUser(long id,Userinfo userinfo) {
        Optional<Userinfo> existingUser = userinfoRepository.findById(id);
        if (existingUser.isPresent()) {
            Userinfo userUpdate = existingUser.get();
            userUpdate.setName(userinfo.getName());
            userUpdate.setEmail(userinfo.getEmail());
            userUpdate.setPhone(userinfo.getPhone());

            return userinfoRepository.save(userUpdate);
        }
        else {
            System.out.println("Userinfo not found");
            return null;
        }
    }
}
