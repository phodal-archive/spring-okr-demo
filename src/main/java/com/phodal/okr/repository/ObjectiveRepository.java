package com.phodal.okr.repository;

import com.phodal.okr.entity.Objective;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectiveRepository extends MongoRepository<Objective, String> {

}
