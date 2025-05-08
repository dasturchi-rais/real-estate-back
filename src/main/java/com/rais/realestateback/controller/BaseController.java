package com.rais.realestateback.controller;

import org.springframework.http.ResponseEntity;

public interface BaseController<R> {
     ResponseEntity<?> create(R request);
     ResponseEntity<?> update(R request);
     ResponseEntity<?> delete(R request);
     ResponseEntity<?> findById(Long id);
}
