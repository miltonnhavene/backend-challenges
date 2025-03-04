package com.io.tiny.dev.library_api.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_SEQUENCE")

    private Long id;
    private String name;
    private String email;
    private String password;
    @ElementCollection(targetClass = UserRules.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_rules", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "rules")
    private Set<UserRules> rules;

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserRules> getRoles() {
        return rules;
    }

    public void setRoles(Set<UserRules> rules) {
        this.rules = rules;
    }
}
