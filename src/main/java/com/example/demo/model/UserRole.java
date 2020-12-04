package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "User_Role", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "Role_UK", columnNames = { "IdUser", "IdRole" }) })
public class UserRole {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdUser", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdRole", nullable = false)
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAppUser() {
        return user;
    }

    public void setAppUser(User appUser) {
        this.user = appUser;
    }

    public Role getAppRole() {
        return role;
    }

    public void setAppRole(Role appRole) {
        this.role = appRole;
    }

}