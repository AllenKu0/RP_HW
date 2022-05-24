package com.example.springboot.repository;

import com.example.springboot.entity.Authenticator;
import com.example.springboot.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
//    Optional<Teacher> findTeacherByName(String name);
}
