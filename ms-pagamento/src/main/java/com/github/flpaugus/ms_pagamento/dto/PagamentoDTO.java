package com.github.flpaugus.ms_pagamento.dto;

import com.github.flpaugus.ms_pagamento.entity.Pagamento;
import com.github.flpaugus.ms_pagamento.entity.Status;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter


public class PagamentoDTO {
    private Long id;
    @NotNull(message = "Campo obrigatório")
    @Positive(message = "O valor do pagamento deve ser um número positivo")
    private BigDecimal valor;
    @Size(min = 2, max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String nome;

    @Size(min = 16, max = 19, message = "O número do cartão deve ter no máximo 19 caracteres")
    private String numeroDoCartao;

    @Size(min = 5,max = 5, message = "A validade do cartão deve ter no máximo 5 caracteres")
    private String validade;

    @Size(min = 3, max = 3, message = "Código de segurança deve ter 3 caracteres")
    private String codigoDeSeguranca;

    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull(message = "Não pode ser nulo")
    private Long pedidoId;
    @NotNull(message = "não pode ser nulo")
    private Long formaDePagamentoId;

    public PagamentoDTO(Pagamento entity) {
        id = entity.getId();
        valor = entity.getValor();
        nome = entity.getNome();
        numeroDoCartao = entity.getNumeroDoCartao();
        validade = entity.getValidade();
        codigoDeSeguranca = entity.getCodigoDeSeguranca();
        status = entity.getStatus();
        pedidoId = entity.getPedidoId()
        formaDePagamentoId = entity.getFormaDePagamentoId();
    }
}




