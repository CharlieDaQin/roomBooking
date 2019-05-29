package com.roombooking.demo.entity;

import com.roombooking.demo.utils.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//主键

    private int roomNo;//房间编号

    private Double price;//价格
    @Column(length = 20)
    private String name;//客房名字

    @Enumerated(EnumType.STRING)
    private RoomType type;

    private int state;//0为空，1非空

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Order> orderList = new ArrayList<Order>();


}
