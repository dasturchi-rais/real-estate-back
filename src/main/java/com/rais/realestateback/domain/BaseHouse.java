package com.rais.realestateback.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;

import java.math.BigDecimal;

@Data
@ToString
@MappedSuperclass
public abstract class BaseHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String address;

    private Integer price;

    private Byte rooms;

    private Double area;

    private Boolean furnished;

    private String contactPhone;

    @Column(name = "posted_at")
    @CreationTimestamp
    private java.time.LocalDateTime postedAt;
}
