package com.springkafkareactive.producer.SpringReactiveKafkaProducer.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WikimediaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String mesg) {
		// log.info(String.format("Sending message throug aravinthTopics::", mesg));
		// log.info(mesg);
		kafkaTemplate.send("newTopicRR", mesg);

	}

}
