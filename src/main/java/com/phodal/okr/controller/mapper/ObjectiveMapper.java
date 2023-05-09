package com.phodal.okr.controller.mapper;

import com.phodal.okr.controller.dto.ObjectiveResponse;
import com.phodal.okr.entity.Objective;
import org.springframework.stereotype.Component;

@Component
public class ObjectiveMapper {
    public ObjectiveResponse toResponse(Objective objective) {
        ObjectiveResponse objectiveResponse = new ObjectiveResponse();
        objectiveResponse.setId(objective.getId());
        objectiveResponse.setName(objective.getName());
        objectiveResponse.setDescription(objective.getDescription());
        objectiveResponse.setType(objective.getType());
        return objectiveResponse;
    }
}
