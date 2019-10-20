package rabbitmq.producer.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rabbitmq.producer.exchanges.RoutingKeyTwoImpl;

@Component
public class RunnerTwo implements CommandLineRunner {

    @Autowired
    private RoutingKeyTwoImpl routingKeyTwo;

    @Override
    public void run(String... args) throws Exception {
        routingKeyTwo.send("routingKeyTwo");
    }

}
