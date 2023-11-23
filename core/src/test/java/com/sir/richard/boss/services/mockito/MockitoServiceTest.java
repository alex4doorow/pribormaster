package com.sir.richard.boss.services.mockito;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockingDetails;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

@Slf4j
public class MockitoServiceTest {

    // https://habr.com/ru/articles/444982/

    private DataService dataServiceMock;

    @BeforeEach
    public void setUp() {

        dataServiceMock = Mockito.mock(DataService.class);
        log.info("{}", dataServiceMock);
        MockingDetails mockingDetails = Mockito.mockingDetails(dataServiceMock);
        log.info("{}", mockingDetails);
        log.info("is mock: {}", mockingDetails.isMock());

        List<String> data = new ArrayList<>();
        data.add("dataItem 1");
        data.add("dataItem 2");
        Mockito.when(dataServiceMock.getData()).thenReturn(data);
        Mockito.when(dataServiceMock.getDataById(any())).thenReturn("dataItem 55");
/*
        Mockito.when(dataServiceMock.getDataById("idValue"))
                .thenReturn("dataItem 57");
*/
        Mockito.when(dataServiceMock.getDataById(Mockito.eq("idValue")))
                .thenReturn("dataItem 56");
        Mockito.when(dataServiceMock.getDataById(
                        Mockito.argThat(arg -> arg == null || arg.length() > 8)))
                .thenReturn("dataItem 58");
        Mockito.when(dataServiceMock.getDataById("invalidId"))
                .thenThrow(new IllegalArgumentException());
    }

    @Test
    public void testOne() {
        log.info("{}", dataServiceMock.getData());
        log.info("{}", dataServiceMock.getDataById("1"));
        log.info("{}", dataServiceMock.getDataById("idValue"));
        log.info("{}", dataServiceMock.getDataById("idValue11"));
        log.info("{}", dataServiceMock.getDataById(null));

        Mockito.verify(dataServiceMock, Mockito.times(4)).getDataById(Mockito.any());
        Mockito.verify(dataServiceMock, Mockito.times(1)).getDataById("idValue11");



    }

    @Test
    public void testOne_withThrows() {
/*
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        }, "NumberFormatException was expected");

        Assertions.assertEquals("For input string: \"One\"", thrown.getMessage());
*/
        RuntimeException rThrown = Assertions.assertThrows(RuntimeException.class, () -> {
            dataServiceMock.getDataById("invalidId");
        }, "RuntimeException was expected");
    }
}
