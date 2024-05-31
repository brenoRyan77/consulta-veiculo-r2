package br.com.consulta.veiculo.api.repository;

import br.com.consulta.veiculo.api.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoReposity extends JpaRepository<Veiculo, Long> {
}
