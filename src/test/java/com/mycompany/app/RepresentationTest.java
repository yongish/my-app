package com.mycompany.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;

public class RepresentationTest {
    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();
    private static final String PART_JSON = "fixtures/part.json";
    private static final String TEST_PART_NAME = "testPartName";
    private static final String TEST_PART_CODE = "testPartCode";

    @Test
    public
}
