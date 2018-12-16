import com.max.test.controllers.MyController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.ServletWebRequest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration
@WebAppConfiguration
public class TestController {

    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Autowired
    MockServletContext servletContext;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;

    @Autowired
    MockHttpServletResponse response;

    @Autowired
    ServletWebRequest webRequest;

    @Before
    public void setup() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        mockMvc = MockMvcBuilders.standaloneSetup(new MyController()).alwaysExpect(status().isOk()).build();
    }

    @Test
    public void testGet() throws Exception {
        mockMvc.perform(get("/test").accept(MediaType.TEXT_HTML));
    }

    @Test
    public void testPost() throws Exception {
        mockMvc.perform(post("/testJson").accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("Slava"))
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    @Test
    public void testParams() throws Exception {
//        mockMvc.perform(put("/testParams").param("id", "22"));
//        mockMvc.perform(put("/testParams/{id}", 25));
        MvcResult result = mockMvc.perform(put("/testParams?id={id}", "22")).andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }


    @Configuration
    @ComponentScan("com.max.test")
    static class Context {
    }
}
