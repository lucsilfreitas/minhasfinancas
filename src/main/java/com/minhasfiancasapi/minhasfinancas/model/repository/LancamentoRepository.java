package com.minhasfiancasapi.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhasfiancasapi.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
