package com.example.CRUDSpringBoot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsInterface extends CrudRepository<StudentsModel, Integer> {
}
