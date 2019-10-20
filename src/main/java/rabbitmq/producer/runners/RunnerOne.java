package rabbitmq.producer.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rabbitmq.producer.exchanges.RoutingKeyOneImpl;

@Component
public class RunnerOne implements CommandLineRunner {

    @Autowired
    private RoutingKeyOneImpl routingKeyOne;

    @Override
    public void run(String... args) throws Exception {
        routingKeyOne.send("routingKeyOne");
    }

}
