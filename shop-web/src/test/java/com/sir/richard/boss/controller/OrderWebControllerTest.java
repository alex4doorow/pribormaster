package com.sir.richard.boss.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class OrderWebControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testOrderByWeb() throws Exception {
        final Long id = 10714L;
/*
        this.mockMvc.perform(
                        get("/web/orders/" + id)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(""))
                .andExpect(status().is(200));
                //.andDo(print());
  */
    }

}
