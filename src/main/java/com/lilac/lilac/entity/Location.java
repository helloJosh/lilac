package com.lilac.lilac.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Location extends BaseEntity  {
    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private Long id;

    @OneToMany(mappedBy = "location")
    private List<Store> locationStores = new ArrayList<>();
}
