package com.rais.realestateback.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "rent_houses")
@EqualsAndHashCode(callSuper = true)
public class RentHouse extends BaseHouse {
}