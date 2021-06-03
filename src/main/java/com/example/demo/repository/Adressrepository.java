package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;
@Repository
public interface Adressrepository extends JpaRepository<Address, Long> {

}
