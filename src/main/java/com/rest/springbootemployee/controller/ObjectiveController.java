package com.rest.springbootemployee.controller;

import com.rest.springbootemployee.controller.dto.ObjectiveDTO;
import com.rest.springbootemployee.controller.dto.ObjectiveResponse;
import com.rest.springbootemployee.controller.mapper.ObjectiveMapper;
import com.rest.springbootemployee.entity.Objective;
import com.rest.springbootemployee.service.ObjectiveService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ObjectiveController {
    ObjectiveService objectiveService;

    ObjectiveMapper objectiveMapper;

    public ObjectiveController(ObjectiveService objectiveService, ObjectiveMapper objectiveMapper) {
        this.objectiveService = objectiveService;
        this.objectiveMapper = objectiveMapper;
    }

    @PostMapping("/teams/{teamId}/objectives")
    public ObjectiveResponse createObjective(@PathVariable String teamId, @RequestBody ObjectiveDTO objectiveDTO) {
        if (objectiveDTO.getName() == null || objectiveDTO.getName().isEmpty()) {
            throw new RuntimeException("Objective name is required");
        }

        if (teamId == null || teamId.isEmpty()) {
            throw new RuntimeException("Team id is required");
        }

        Objective objective = objectiveService.createObjective(teamId, objectiveDTO);
        return objectiveMapper.toResponse(objective);
    }
}
