package com.sample.springboot.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER_DATA")
@NamedQueries({@NamedQuery(name = "fetchUserData",query = "select u from User u"),
        @NamedQuery(name="fetchUserDataByName",query = "select u from User u " +
                "where u.username=:username")})
public class User implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)*/
    private Long id;

    @Column(name = "USERNAME", unique = true)
    @NotNull
    private String username;

    @Column(name = "PASSWORD")
    @NotNull
    private String password;

    @Column(name = "FIRSTNAME")
    @NotNull
    private String firstname;

    @Column(name = "LASTNAME")
    @NotNull
    private String lastname;

    @Column(name = "EMAIL")
    @NotNull
    private String email;

    @Column(name = "ENABLED")
    @NotNull
    private Boolean enabled;

    @Column(name = "LASTPASSWORDRESTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date lastPasswordResetDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "USER_AUTHORITY",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "USER_AUTHORITY_ID", referencedColumnName = "AUTHORITY_ID")})
    private List<Authority> authorities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }
}
