package com.example.demo;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTests {

	@SneakyThrows
    @Test
	void unitTest1() {
		Thread.sleep(200);
	}


	@SneakyThrows
	@Test
	void unitTest2() {
		Thread.sleep(200);
	}

	@SneakyThrows
	@Test
	void unitTest3() {
		Thread.sleep(200);
	}

}
