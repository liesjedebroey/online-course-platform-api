package com.courseplatform;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // DIT forceert Spring om de H2 properties te gebruiken
class CourseApiApplicationTests {

    @Test
    void contextLoads() {
    }

}
