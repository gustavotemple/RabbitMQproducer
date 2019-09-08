package rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rabbitmq.producer.exchanges.RoutingKeyOneImpl;
import rabbitmq.producer.exchanges.RoutingKeyThreeImpl;
import rabbitmq.producer.exchanges.RoutingKeyTwoImpl;

@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Autowired
    private RoutingKeyOneImpl routingKeyOne;

    @Autowired
    private RoutingKeyTwoImpl routingKeyTwo;

    @Autowired
    private RoutingKeyThreeImpl routingKeyThree;

    @Override
    public void run(String... args) throws Exception {
        routingKeyOne.send("routingKeyOne");
        routingKeyTwo.send("routingKeyTwo");
        routingKeyThree.send("routingKeyThree");
    }
}
