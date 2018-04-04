package com.kafka;

import java.util.Properties;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import kafka.javaapi.producer.Producer;

public class PublishMessageToKafka {
	private Producer<String, String> producer;
	
	public static void main(String[] args) {
		  new PublishMessageToKafka().publish();
	}

	private void publish() {

		Properties props = new Properties();
		props.put("metadata.broker.list", "broker configuration");
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("key.serializer.class", "kafka.serializer.StringEncoder");
		ProducerConfig config = new ProducerConfig(props);
		producer = new Producer<String, String>(config);
		
		//read the testData json or xml or any format.
		
		KeyedMessage<String, String> data = new KeyedMessage<String, String>("topic name", "testData");
		System.out.println("input payload with updated time stamp = " + "");

		producer.send(data);
		
		System.out.println("Data published to the topic Successfully");
		
	}
}
