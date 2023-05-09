package com.phodal.okr.controller;

import com.phodal.okr.controller.dto.ObjectiveDTO;
import com.phodal.okr.controller.dto.ObjectiveResponse;
import com.phodal.okr.controller.mapper.ObjectiveMapper;
import com.phodal.okr.entity.Objective;
import com.phodal.okr.service.ObjectiveService;
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
