package com.example.data.repository;


import com.example.data.enitys.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoRepository extends JpaRepository<Userinfo, Long> {

}
