package com.example.mongodb.User;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    
    @Configuration
    @EnableMongoRepositories
    class ApplicationConfig extends AbstractMongoClientConfiguration{

        @Override
        protected String getDatabaseName() {
            return "user-store";
        }

        
        
    }
}
