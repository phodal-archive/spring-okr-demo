package com.rest.springbootemployee.controller.mapper;

import com.rest.springbootemployee.entity.Objective;
import com.rest.springbootemployee.controller.dto.ObjectiveResponse;
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
