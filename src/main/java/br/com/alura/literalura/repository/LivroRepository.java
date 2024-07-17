package br.com.alura.literalura.repository;

import br.com.alura.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    boolean existsByTitulo(String titulo);

    Livro findByTitulo(String titulo);

    @Query("SELECT DISTINCT l.idioma FROM Livro l ORDER BY l.idioma")
    List<String> buscarIdiomas();

    @Query("SELECT l FROM Livro l WHERE idioma = :idiomaPesquisa")
    List<Livro> buscarPorIdiomas(String idiomaPesquisa);

    List<Livro> findTop10ByOrderByNumeroDownloadsDesc();
}
