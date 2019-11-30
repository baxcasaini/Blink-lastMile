package com.aws.codestar.projecttemplates.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Slf4j
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {


	@Override
	public MongoClient mongoClient() {
        try {
			MongoClientURI uri = new MongoClientURI(
					"mongodb://blink-aws:blink-aws@blinkcluster-shard-00-00-pmefj.mongodb.net:27017,blinkcluster-shard-00-01-pmefj.mongodb.net:27017,blinkcluster-shard-00-02-pmefj.mongodb.net:27017/test?ssl=true&replicaSet=BlinkCluster-shard-0&authSource=admin&retryWrites=true&w=majority");

			MongoClient mongoClient = new MongoClient(uri);
			MongoDatabase database = mongoClient.getDatabase("test");

			MongoClient mc = new MongoClient(uri);

            return mc;

        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return null;
	}

	@Override
	protected String getDatabaseName() {
		return "BlinkCluster";
	}
}
