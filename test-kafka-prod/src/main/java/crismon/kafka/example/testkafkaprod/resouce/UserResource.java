package crismon.kafka.example.testkafkaprod.resouce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {
	
	@Autowired
	KafkaTemplate<String , String> kafkatemplate;
	
	public static final String topic = "Test_Topic_Kafka";
	
	@GetMapping("/publish/{message}")
	public String post(@PathVariable("message") final String message) {
		
		kafkatemplate.send(topic,message);
		
		return "Published successfully";
	}

}
