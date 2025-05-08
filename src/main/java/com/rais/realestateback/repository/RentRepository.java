package com.rais.realestateback.repository;

import com.rais.realestateback.domain.RentHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<RentHouse, Long> {
}
