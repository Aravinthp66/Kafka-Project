package com.springkafka.consumer.SpringKafkaConsumer.confic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaProducerConfic {

	@Bean
	public NewTopic newTopicRR() {
		return TopicBuilder.name("newTopicRR").build();
	}

}
