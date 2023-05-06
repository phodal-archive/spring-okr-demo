package com.rest.springbootemployee.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.springbootemployee.controller.dto.ObjectiveDTO;
import com.rest.springbootemployee.entity.Objective;
import com.rest.springbootemployee.repository.ObjectiveRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class ObjectiveControllerTest {
    @Autowired
    MockMvc client;

    @Autowired
    ObjectiveRepository objectiveRepository;

    @BeforeEach
    public void clearDB() {
        objectiveRepository.deleteAll();
    }

    @Test
    void should_create_objective_when_perform_update_objective() throws Exception {
        ObjectiveDTO objectiveDTO = new ObjectiveDTO("objective", "description", "type");

        String updateJson = new ObjectMapper().writeValueAsString(objectiveDTO);
        client.perform(MockMvcRequestBuilders.post("/teams/1/objectives")
                        .contentType("application/json")
                        .content(updateJson))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("objective"));

        assertEquals(1, objectiveRepository.findAll().size());
    }

    // POST /teams/{teamId}/objectives
    // ObjectiveDTO: { "name": string, "description": string, "type": string }
    // ObjectiveResponse: { "id": string, "name": string, "description": string, "type": string }
    @Test
    void should_get_objective_when_perform_get_objective_by_id() throws Exception {
        //given
        String objectiveId = new ObjectId().toString();
        objectiveRepository.save(new Objective(objectiveId, "objective", "description", "type"));

        //when & then
        client.perform(MockMvcRequestBuilders.get("/teams/1/objectives/" + objectiveId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(objectiveId))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("objective"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.description").value("description"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.type").value("type"));
    }
}
