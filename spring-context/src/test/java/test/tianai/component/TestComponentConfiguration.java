package test.tianai.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class TestComponentConfiguration {

    @Bean
    public TestComponent3 testComponent3() {
        return new TestComponent3();
    }
}
