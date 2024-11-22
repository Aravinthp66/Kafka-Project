package com.springkafkareactive.producer.SpringReactiveKafkaProducer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springkafkareactive.producer.SpringReactiveKafkaProducer.kafkaproducer.WikimediaProducer;
import com.springkafkareactive.producer.SpringReactiveKafkaProducer.stream.WikimediaStreamConsumer;

@RestController
@RequestMapping("/api/v1")
public class WikimediaController {
	@Autowired
	private WikimediaProducer wikimediaProducer;

	@Autowired
	WikimediaStreamConsumer streamConsumer;

	@PostMapping("/sendMessage")
	public ResponseEntity<String> sendMessage(@RequestBody String mesg) {
		wikimediaProducer.sendMessage(mesg);
		return ResponseEntity.ok("Start Successful");
	}

	@PostMapping("/wikiMedia")
	public ResponseEntity<String> messagePuplisher() {
		streamConsumer.consumeStreamPublish();
		return ResponseEntity.ok("Message Puplish Start Successful");
	}

	/*
	 * @PostMapping("/sendUserMessage") public ResponseEntity<String>
	 * sendUserMessage(@RequestBody User mesg) {
	 * kafkaJsonProducer.sendJsonMessage(mesg); return
	 * ResponseEntity.ok("Messege Send user Successful"); }
	 */

}