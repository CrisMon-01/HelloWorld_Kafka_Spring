# EXAMPLE OF KAFKA IN SPRING BOOT

## Simple Application with a producer end a consumer

What we need:
* kafka installed on the local machine (in the code we have same reference for this)
* zookeeper 
* the topic: Test_Topic_Kafka (bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic)
* Java 7+
* STS

Run (From the kafka binary folder):
* bin/zookeeper-server-start.sh config/zookeeper.properties (Start Zookeeper)
* bin/kafka-server-start.sh config/server.properties
* Start Producer and Consumer

Producer side:
* http://localhost:8081/kafka/publish/$Message

Consumer side:
* you can see the logs