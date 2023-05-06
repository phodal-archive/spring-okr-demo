package com.rest.springbootemployee.service;

import com.rest.springbootemployee.controller.dto.ObjectiveDTO;
import com.rest.springbootemployee.entity.Objective;
import com.rest.springbootemployee.repository.ObjectiveRepository;
import org.springframework.stereotype.Service;

@Service
public class ObjectiveService {
    ObjectiveRepository objectiveRepository;

    public ObjectiveService(ObjectiveRepository objectiveRepository) {
        this.objectiveRepository = objectiveRepository;
    }

    public Objective createObjective(String teamId, ObjectiveDTO objectiveDTO) {
        Objective objective = new Objective();
        objective.setName(objectiveDTO.getName());
        objective.setDescription(objectiveDTO.getDescription());
        objective.setType(objectiveDTO.getType());
        return objectiveRepository.save(objective);
    }

    public Objective updateObjective(String teamId, String objectiveId, ObjectiveDTO objectiveDTO) {
        Objective objective = objectiveRepository.findById(objectiveId).get();
        objective.setName(objectiveDTO.getName());
        objective.setDescription(objectiveDTO.getDescription());
        objective.setType(objectiveDTO.getType());
        return objectiveRepository.save(objective);
    }
}
