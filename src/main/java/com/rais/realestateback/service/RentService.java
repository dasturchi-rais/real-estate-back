package com.rais.realestateback.service;

import com.rais.realestateback.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RentService implements BaseService {
    private final RentRepository rentRepository;
}
