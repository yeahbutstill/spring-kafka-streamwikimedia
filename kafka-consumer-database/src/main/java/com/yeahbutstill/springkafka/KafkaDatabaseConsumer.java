package com.yeahbutstill.springkafka;

import com.yeahbutstill.springkafka.entity.WikiMediaData;
import com.yeahbutstill.springkafka.repository.WikiMediaDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaDatabaseConsumer {

    private final WikiMediaDataRepository wikiMediaDataRepository;

    public KafkaDatabaseConsumer(WikiMediaDataRepository wikiMediaDataRepository) {
        this.wikiMediaDataRepository = wikiMediaDataRepository;
    }

    @KafkaListener(topics = "wikimediaRecentChange", groupId = "myGroup")
    public void consume(String eventMessage) {
        log.info("Event message recieved {}", eventMessage);
        WikiMediaData wikiMediaData = WikiMediaData.builder()
                .wikiEventData(eventMessage)
                .build();
        wikiMediaDataRepository.save(wikiMediaData);
    }

}
