package com.sample.test.TestDemo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "WARE_HOUSE_DAILY_CHECKOUT")
public class WareHouseCheckOutInfo {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="IS_ACCEPTED")
    private String isAccepted;

    @Column(name="CREATED_DATE")
    private Date createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERID", nullable = false)
    private UserDataInfo userDataInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHECK_LIST_ID", nullable = false)
    private WareHouseCheckListInfo wareHouseCheckListInfo;

    public UserDataInfo getUserDataInfo() {
        return userDataInfo;
    }

    public void setUserDataInfo(UserDataInfo userDataInfo) {
        this.userDataInfo = userDataInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
