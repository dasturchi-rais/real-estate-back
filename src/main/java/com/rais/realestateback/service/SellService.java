package com.rais.realestateback.service;

import com.rais.realestateback.repository.SellRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SellService implements BaseService{
    private final SellRepository sellRepository;
}
