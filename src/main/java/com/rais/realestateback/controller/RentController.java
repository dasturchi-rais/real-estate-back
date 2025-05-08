package com.rais.realestateback.controller;

import com.rais.realestateback.domain.RentHouse;
import com.rais.realestateback.service.RentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/rent")
@RequiredArgsConstructor
public abstract class RentController implements BaseController<RentHouse>{
    private final RentService rentService;

    @Override
    public ResponseEntity<?> create(RentHouse request) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(RentHouse request) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(RentHouse request) {
        return null;
    }

    @Override
    public ResponseEntity<?> findById(Long id) {
        return null;
    }
}
