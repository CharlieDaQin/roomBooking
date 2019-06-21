package com.roombooking.demo.entity;

import com.roombooking.demo.utils.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String username;

    @Column(length = 20)
    private String nickName;

    @Column(length = 36)
    private String password;

    private String userImg;

    @Column(length = 20)
    private String realName;

    @Column(length = 20)
    private String email;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Sex gender;

    @Temporal(TemporalType.TIMESTAMP)
    private Date Birthday;

    private int isVip;

    private String address;

    private String idCard;

    private String idCardImg;

    private String paymentPassword;//?

    private int state;//0未实名 1实名认证成功 2 加入黑名单

    @Temporal(TemporalType.TIMESTAMP)
    private Date registerTime;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orderList= new ArrayList<Order>();


}
