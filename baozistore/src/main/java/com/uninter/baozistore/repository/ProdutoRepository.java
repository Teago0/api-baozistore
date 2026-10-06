package com.uninter.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uninter.baozistore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}