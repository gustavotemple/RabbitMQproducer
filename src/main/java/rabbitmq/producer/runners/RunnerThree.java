package rabbitmq.producer.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rabbitmq.producer.exchanges.RoutingKeyThreeImpl;

@Component
public class RunnerThree implements CommandLineRunner {

    @Autowired
    private RoutingKeyThreeImpl routingKeyThree;

    @Override
    public void run(String... args) throws Exception {
        routingKeyThree.send("routingKeyThree");
    }

}
