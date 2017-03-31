package br.org.adotapet.repository;

import br.org.adotapet.entity.Anuncio;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wellington Felipe Fucks
 *
 * @version 1.0
 * @since 1.0, 30/03/2017
 */
public interface IAnuncionRepository extends CrudRepository<Anuncio, Long>{

}
