package com.example.demo;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationTests {

	@SneakyThrows
    @Test
	void unitTest1() {
		Thread.sleep(4000);
	}

}
