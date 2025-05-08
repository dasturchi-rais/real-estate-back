package com.rais.realestateback.repository;

import com.rais.realestateback.domain.SellHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRepository extends JpaRepository<SellHouse, Long> {
}
