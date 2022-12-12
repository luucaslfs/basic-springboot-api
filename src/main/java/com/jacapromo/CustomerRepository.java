package com.jacapromo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository <Customer, Integer> {
}
