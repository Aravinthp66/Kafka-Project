package com.springkafkareactive.producer.SpringReactiveKafkaProducer.confic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	@Bean
	public WebClient.Builder clientBuilder() {
		return WebClient.builder();
	}
}
