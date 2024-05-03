package com.example.H2DataBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    public List<Student> findByName(String name);

    @Query("SELECT u FROM Student u WHERE u.email LIKE %:email%")
    List<Student> findUserByEmail(String email);


}
