package club.ESC.repositories.mongodb.config;

import java.util.Base64;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.lang.NonNull;

import com.mongodb.ConnectionString;

import club.ESC.repositories.mongodb.constants.MongoConstants;

import org.springframework.util.StringUtils;

@Configuration
@PropertySource("classpath:application.yml")
public class MongoConfig{

    @Autowired
    Environment env;


    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(getConnectionUri());
    }
    

    @NonNull
    protected String getDatabaseName() {
        String databaseName = env.getProperty(MongoConstants.DATABASE_NAME_PROPERTY);
        
        //TODO: REFACTOR EXCEPTIONS
        if(databaseName == null) throw new RuntimeErrorException(new Error(MongoConstants.INCORRECT_DATABASE_NAME_MESSAGE));

        return databaseName;
    }


    @NonNull
    private ConnectionString getConnectionUri(){
        String encodedConnectionUri = env.getProperty(MongoConstants.DATABASE_URI_PROPERTY);
        String decodedConnectionUri = new String(Base64.getDecoder().decode(encodedConnectionUri));

        //TODO: REFACTOR EXCEPTIONS
        if(!StringUtils.hasText(decodedConnectionUri)) throw new RuntimeErrorException(new Error(MongoConstants.INCORRECT_DATABASE_URI_MESSAGE));
        
        return new ConnectionString(decodedConnectionUri);

    }
}
