package br.org.adotapet.repository;

import br.org.adotapet.entity.AnimalPerdido;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wellington Felipe Fucks
 *
 * @version 1.0
 * @since 1.0, 30/03/2017
 */
public interface IAnimalPerdidoRepository extends  CrudRepository<AnimalPerdido, Long>{

}
