package com.github.flpaugus.ms_pagamento.repository;

import com.github.flpaugus.ms_pagamento.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {


}
