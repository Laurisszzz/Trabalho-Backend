package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomvc.model.pedido;

public interface PedidoRepository extends JpaRepository<pedido, Long> {
}