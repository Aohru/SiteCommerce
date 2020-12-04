package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "USER")
public class User implements Serializable, UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUser", nullable = false)
    private Integer userId;

    @Column(name = "NomUser", length = 36, nullable = false)
    private String username;

    @Column(name = "Password", length = 128, nullable = false)
    private String password;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    @Override
    public boolean isEnabled() {
        return false;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }
}