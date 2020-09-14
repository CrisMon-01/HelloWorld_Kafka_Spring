package crismon.kafka.example.testkafkaconsumer.Listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "Test_Topic_Kafka")
	public void consumer(String message) {
		System.out.println("Consumed Message: "+message);
	}

}
