package com.sir.richard.boss.rest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Slf4j
public class OrderRestControllerTest {

/*
    public static String json_SubSystem = "{\r\n" +
            "   \"id\":%d,\r\n" +
            "   \"code\":\"%s\",\r\n" +
            "   \"name\":\"%s\",\r\n" +
            "   \"requestFormat\":\"JSON\"" +
            "}";
*/

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testOrderByRestTemplate() throws Exception {
        final long id = 10714L;
        String body = restTemplate.getForObject("/rest/v1/orders/" + id, String.class);
        Assertions.assertTrue(body.contains("order"));

    }


    @Test
    public void testOrderByRest() throws Exception {
        final long id = 10714L;

        //insert
        /*
        this.mockMvc.perform(
                        post("/dictionary/SubSystem")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(String.format(json_SubSystem, id, "CORE", "Core module"))
                                .header(Defaults.X_Request_ID, "i-6bNJRndEur5z0uSVkzzw"))
                .andExpect(header().string(Defaults.X_Request_ID, "i-6bNJRndEur5z0uSVkzzw"))
                .andExpect(status().is(200))
                .andDo(print());
        assertEquals(true, subSystemBL.findById(id).isPresent());

        */

        //update
        /*
        this.mockMvc.perform(
                        put("/dictionary/SubSystem/" + id)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(String.format(json_SubSystem, id, "CORE_NEW", "New core module name"))
                                .header(Defaults.X_Request_ID, "i-6bNJRndEur5z0uSVkzzw"))
                .andExpect(header().string(Defaults.X_Request_ID, "i-6bNJRndEur5z0uSVkzzw"))
                .andExpect(status().is(200))
                .andDo(print());
        Optional<SESubSystem> bpt = subSystemBL.findById(id);
        assertEquals(true, bpt.isPresent());
        assertEquals("CORE_NEW", bpt.get().getCode());
        assertEquals("New core module name", bpt.get().getName());

        */

        // view
        this.mockMvc.perform(
                        get("/rest/v1/orders/" + id)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(""))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andDo(print());

        //delete
        /*
        this.mockMvc.perform(
                        delete("/dictionary/SubSystem/" + id)
                                .contentType(MediaType.APPLICATION_JSON)
                                .header(Defaults.X_Request_ID, "i-6bNJRndEur5z0uSVkzzw"))
                .andExpect(header().string(Defaults.X_Request_ID, "i-6bNJRndEur5z0uSVkzzw"))
                .andExpect(status().is(200))
                .andDo(print());
        assertEquals(false, subSystemBL.findById(id).isPresent());

        */
    }
}
