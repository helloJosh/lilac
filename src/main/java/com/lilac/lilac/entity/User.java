package com.lilac.lilac.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    /** API 제공자  ex) google, facebook, naver */
    private String provider;
    /** API 제공자의 PK ex) 12321453 */
    private String providerId;
    @Column(nullable=false, unique = true)
    private String username;
    @Column(nullable=false, length = 100, unique = true)
    private String email;
    @Column(nullable=false, length = 100)
    private String password;
    private String nickname;
    private String gender;

    @OneToMany(mappedBy = "user")
    private List<Store> userStores = new ArrayList<>();

    @Builder
    public User(Long id, String provider, String providerId, String username, String email, String password, String nickname, String gender) {
        this.id = id;
        this.provider = provider;
        this.providerId = providerId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
    }

    public void edit(User user){
        nickname = user.getNickname();
        gender = user.getGender();
    }
}
