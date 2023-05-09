package com.phodal.okr.service;

import com.phodal.okr.entity.Objective;
import com.phodal.okr.controller.dto.ObjectiveDTO;
import com.phodal.okr.repository.ObjectiveRepository;
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
