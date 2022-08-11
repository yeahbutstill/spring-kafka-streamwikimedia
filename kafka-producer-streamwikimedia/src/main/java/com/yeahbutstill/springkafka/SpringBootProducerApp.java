package com.yeahbutstill.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApp implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootProducerApp.class);

    }

    @Autowired
    private WikiMediaChangesProducer wikiMediaChangesProducer;
    @Override
    public void run(String... args) throws Exception {
        wikiMediaChangesProducer.sendMessage();
    }
}
