package com.lilac.lilac.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Like extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "like_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Like(Store store, User user) {
        this.store = store;
        this.user = user;
    }

    public Like() {

    }
}
