package com.aws.codestar.projecttemplates.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Slf4j
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Value(value = "${spring.data.mongodb.database}")
	private String db;
    @Value(value = "${spring.data.mongodb.username}")
    private String username;
    @Value(value = "${spring.data.mongodb.password}")
    private String password;
	@Value(value = "${spring.data.mongodb.host}")
	private String host;
	@Value(value = "${spring.data.mongodb.port}")
	private String port;
	@Value(value = "${spring.data.mongodb.uri}")
	private String uriString;

	@Override
	public MongoClient mongoClient() {
        try {
            String encoded_pwd = URLEncoder.encode(password, "UTF-8");

            String client_url = "mongodb://blink-aws:blink-aws@blinkcluster-shard-00-00-pmefj.mongodb.net:27017,blinkcluster-shard-00-01-pmefj.mongodb.net:27017,blinkcluster-shard-00-02-pmefj.mongodb.net:27017/test?ssl=true&replicaSet=BlinkCluster-shard-0&authSource=admin&retryWrites=true&w=majority";
            MongoClientURI uri = new MongoClientURI(client_url);

            return new MongoClient(uri);

        } catch (UnsupportedEncodingException ex) {
            log.error(ex.getMessage());
        }
        return null;
	}

	@Override
	protected String getDatabaseName() {
		return db;
	}
}
