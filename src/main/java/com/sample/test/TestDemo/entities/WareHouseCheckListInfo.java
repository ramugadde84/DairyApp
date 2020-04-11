package com.sample.test.TestDemo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "WARE_HOUSE_CHECKLIST")
public class WareHouseCheckListInfo {

    @Id
    @Column(name = "CHECK_LIST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CHECK_LIST_INFO")
    @NotNull
    private String checkListInfo;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "wareHouseCheckListInfo")
    private List<WareHouseCheckOutInfo> wareHouseCheckOutInfos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckListInfo() {
        return checkListInfo;
    }

    public void setCheckListInfo(String checkListInfo) {
        this.checkListInfo = checkListInfo;
    }
}
