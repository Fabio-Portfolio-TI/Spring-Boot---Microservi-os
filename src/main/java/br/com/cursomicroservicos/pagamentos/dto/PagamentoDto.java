package br.com.cursomicroservicos.pagamentos.dto;

import br.com.cursomicroservicos.pagamentos.model.Status;
import lombok.Data;

import java.math.BigDecimal;

@Data // Possui todos os métodos Getters e Setters do Lombok
public class PagamentoDto {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long pedidoId;
    private Long formaDePagamentoId;
}
