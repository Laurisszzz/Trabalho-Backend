package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomvc.model.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Long> {
}