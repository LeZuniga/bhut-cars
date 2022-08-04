package com.test.bhut.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.bhut.model.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {
    public List<Cars> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}