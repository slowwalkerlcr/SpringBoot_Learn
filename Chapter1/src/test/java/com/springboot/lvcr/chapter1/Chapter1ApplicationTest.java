package com.springboot.lvcr.chapter1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import com.springboot.lvcr.web.HelloWorldController;

@RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = MockServletContext.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class Chapter1ApplicationTest {
	private MockMvc mvc;

	@Before
	public void setUp() {
		try {
			mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController())
					.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getHello() {
		try {
			mvc.perform(
					MockMvcRequestBuilders.get("/hello").accept(
							MediaType.APPLICATION_JSON)).andExpect(status().isOk())
					.andExpect(content().string(equalTo("hello world")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
