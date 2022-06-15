package com.example.springboot.entity;

import com.example.springboot.request.UserRegisterRequest;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account", columnDefinition = "varchar(68)", nullable = false)
    private String account;
    @Column(name = "password", columnDefinition = "varchar(68)", nullable = false)
    private String password;


    @Column(name = "email", columnDefinition = "varchar(40)")
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<CourseSelection> courseSelection;

    public Set<CourseSelection> getCourseSelection() {
        return courseSelection;
    }

    public void setCourseSelection(Set<CourseSelection> courseSelection) {
        this.courseSelection = courseSelection;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Student(UserRegisterRequest user) {
        this.account = user.getAccount();
        this.password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}