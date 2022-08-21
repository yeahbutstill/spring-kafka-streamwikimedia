# spring-kafka-streamwikimedia
```shell
# open terminal
bin/zookeeper-server-start.sh config/zookeeper.properties

# open terminal
bin/kafka-server-start.sh config/server.properties

# open terminal
bin/kafka-console-producer.sh --topic wikimediaRecentChange --bootstrap-server localhost:9092

# open terminal
bin/kafka-console-consumer.sh --topic wikimediaRecentChange --bootstrap-server localhost:9092
```

# Setup docker mysql
```docker
docker run --rm \
--name=wikimedia-db \
-e MYSQL_DATABASE=wikimediadb \
-e MYSQL_USER=yukbelajar \
-e MYSQL_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e MYSQL_ROOT_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e TZ=Asia/Jakarta \
-p 6603:3306 \
-v "$PWD/docker/wikimedia-db/conf.d":/etc/mysql/conf.d \
-v "$PWD/storage/docker/wikimedia-db-data":/var/lib/mysql \
mysql
```