import com.max.test.Car;
import com.max.test.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyTest.TestConfig.class)
//@ActiveProfiles("")
//@TestPropertySource("classpath:someFile.properties")
//@TestPropertySource({"host = localhost", "port = 8080"})
public class MyTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    Car car;

    @Test
    public void test() {
        context.getBean(Car.class).drive();
        car.drive();
    }


    @Configuration
    @ComponentScan("com.max.test")
    static class TestConfig {
    }


}
