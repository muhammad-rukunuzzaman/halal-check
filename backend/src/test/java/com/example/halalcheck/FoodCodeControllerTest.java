package com.example.halalcheck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoodCodeControllerTest {

    @Autowired
    private FoodCodeController controller;

    @Test
    void contextLoadsAndReturnsKnownCode() {
        FoodCode result = controller.check("E100");
        assertThat(result).isNotNull();
        assertThat(result.getCode()).isEqualTo("E100");
        assertThat(result.getStatus()).isEqualTo("HALAL");
    }
}
