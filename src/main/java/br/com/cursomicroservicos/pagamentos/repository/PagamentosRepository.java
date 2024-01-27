package br.com.cursomicroservicos.pagamentos.repository;


import br.com.cursomicroservicos.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PagamentosRepository extends JpaRepository<Pagamento, Long> {
}
