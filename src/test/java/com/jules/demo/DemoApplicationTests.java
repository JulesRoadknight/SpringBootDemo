package com.jules.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	private HelloController helloController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testControllerLoads() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get(String.valueOf('/')))
				.andExpect(status().isOk())
				.andExpect(content().string("Sup."));
	}

}
