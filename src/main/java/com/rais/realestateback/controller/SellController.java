package com.rais.realestateback.controller;

import com.rais.realestateback.domain.SellHouse;
import com.rais.realestateback.service.SellService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/sell")
@RequiredArgsConstructor
public class SellController implements BaseController<SellHouse>{
    private final SellService sellService;

    @Override
    public ResponseEntity<?> create(SellHouse request) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(SellHouse request) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(SellHouse request) {
        return null;
    }

    @Override
    public ResponseEntity<?> findById(Long id) {
        return null;
    }
}
