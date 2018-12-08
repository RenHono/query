package cn.sinvo.fpp.query.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import ch.qos.logback.core.status.Status;

/**
 * 
 * @author RenHono fpp The Security System that Seals the Savage Science Smartly
 *         by its Supreme Sagacity and Strength
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController())
				.build();
	}

	@Test
	public void testHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(
				MediaType.APPLICATION_JSON));
				
	}
}
