package com.example.anagrama.repository;

import com.example.anagrama.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Exemplo de implementação segura contra SQL Injection usando Spring Data JPA.
 * O uso de @Query com parâmetros nomeados (@Param) previne SQL Injection pois
 * os parâmetros são tratados como valores e não como parte do SQL
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT p FROM Produto p WHERE p.nome = :nome")
    Produto buscarPorNome(@Param("nome") String nome);

    @Query("SELECT p FROM Produto p WHERE p.preco >= :precoMinimo")
    List<Produto> buscarPorPrecoMinimo(@Param("precoMinimo") Double precoMinimo);

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE CONCAT('%',:termo,'%') OR p.descricao LIKE CONCAT('%',:termo,'%')")
    List<Produto> buscarPorTermo(@Param("termo") String termo);
}