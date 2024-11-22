package com.springkafkareactive.producer.SpringReactiveKafkaProducer.stream;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.springkafkareactive.producer.SpringReactiveKafkaProducer.kafkaproducer.WikimediaProducer;

@Service
public class WikimediaStreamConsumer {

	private WebClient webClient;

	private WikimediaProducer producer;

	public WikimediaStreamConsumer(WebClient.Builder webClientBuilder, WikimediaProducer producer) {
		this.webClient = webClientBuilder.baseUrl("https://stream.wikimedia.org/v2").build();
		this.producer = producer;
	}

	public void consumeStreamPublish() {
		webClient.get().uri("/stream/recentchange").retrieve().bodyToFlux(String.class)
				.subscribe(producer::sendMessage);
	}

}
