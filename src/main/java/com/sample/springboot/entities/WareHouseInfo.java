package com.sample.springboot.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "WARE_HOUSE_INFO")
public class WareHouseInfo {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "WARE_HOUSE_ID")
    @NotNull
    private String wareHouseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(String wareHouseId) {
        this.wareHouseId = wareHouseId;
    }
}
