package com.rais.realestateback.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "sell_houses")
@EqualsAndHashCode(callSuper = true)
public class SellHouse extends BaseHouse {
}
