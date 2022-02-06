package com.store.storeapi.repositories;

import com.store.storeapi.entities.Subsidiary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubsidiaryRepository extends JpaRepository<Subsidiary, Long> {

    Page<Subsidiary> findAll(Pageable page);
}
