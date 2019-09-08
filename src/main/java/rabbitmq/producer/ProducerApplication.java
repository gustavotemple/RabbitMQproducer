package rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rabbitmq.producer.exchanges.ExchangeOneImpl;
import rabbitmq.producer.exchanges.ExchangeTwoImpl;

@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Autowired
    private ExchangeOneImpl exchangeOne;

    @Autowired
    private ExchangeTwoImpl exchangeTwo;

    @Override
    public void run(String... args) throws Exception {
        exchangeOne.send("test1");
        exchangeTwo.send("test2");
    }
}
