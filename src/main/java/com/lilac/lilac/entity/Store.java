package com.lilac.lilac.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
public class Store extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private String storename;

    private String address;
    private String subscription;
    private String phonenumber;
    private String url;
    private String imgpath;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private String city;
}
