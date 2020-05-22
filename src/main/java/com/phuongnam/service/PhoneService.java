package com.phuongnam.service;

import com.phuongnam.model.Phone;

import java.util.Optional;

public interface PhoneService{
    Iterable<Phone> findAll();

    Optional<Phone> findById(Long id);

    void save(Phone phone);

    void remove(Long id);
}
