package test.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof TestEvent) {
            System.out.println("-----------------------");
            ((TestEvent) event).print();
        }

    }
}
