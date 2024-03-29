package io.dpopkov.knowthenix.data.jpa;

import io.dpopkov.knowthenix.domain.entities.KeyTermEntity;
import io.dpopkov.knowthenix.domain.repositories.KeyTermRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KeyTermJpaRepository extends KeyTermRepository, CrudRepository<KeyTermEntity, Long> {

    @Override
    Optional<KeyTermEntity> findByName(String name);
}
