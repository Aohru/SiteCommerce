package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Role", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "Role_UK", columnNames = "NomRole") })
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "IdRole", nullable = false)
    private Long IdRole;

    @Column(name = "NomRole", length = 30, nullable = false)
    private String NomRole;

    public Long getIdRole() {
        return IdRole;
    }

    public void setRoleId(Long IdRole) {
        this.IdRole = IdRole;
    }

    public String getRoleName() {
        return NomRole;
    }

    public void setRoleName(String NomRole) {
        this.NomRole = NomRole;
    }

}