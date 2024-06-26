package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface FruitaJPARepository extends CrudRepository<FruitaDTO, Integer> {

    @Override
    Iterable<FruitaDTO> findAll();

    @Override
    Optional<FruitaDTO> findById(Integer integer);

    @Override
    void deleteById(Integer integer);

    @Override
    <S extends FruitaDTO> S save(S entity);

    // TODO Check wether or not we need another method to update

}
