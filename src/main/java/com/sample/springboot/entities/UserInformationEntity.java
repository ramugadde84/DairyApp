package com.sample.springboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USER_INFORMATION")
@NamedQuery(name = "fetchAllUserInformation",query = "select u from UserInformationEntity u")
public class UserInformationEntity implements Serializable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_name_seq")
    @SequenceGenerator(name = "user_name_seq", sequenceName = "user_name_seq", allocationSize = 1)*/
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
