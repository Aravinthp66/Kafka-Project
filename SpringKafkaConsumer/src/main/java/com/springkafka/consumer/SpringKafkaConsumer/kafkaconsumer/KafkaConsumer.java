package com.springkafka.consumer.SpringKafkaConsumer.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "newTopicRR", groupId = "myGroup")
	void consumeMessage(String mesg) {

		try {
			System.out.println(mesg);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
