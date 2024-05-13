package br.com.springboot.netflix.gateway;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiGatewayRouteTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testRouteToUserService() throws Exception {
		mockMvc.perform(get("/user-service/users/1"))
				.andExpect(status().isOk());
	}
}