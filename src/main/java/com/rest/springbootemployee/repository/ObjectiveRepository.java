package com.rest.springbootemployee.repository;

import com.rest.springbootemployee.entity.Objective;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectiveRepository extends MongoRepository<Objective, String> {

}
