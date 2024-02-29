package club.ESC.repos.mongodb;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import club.ESC.model.Player;

@Repository
public class MongoRepository implements IMongoRepository{
    
    
    private final MongoTemplate mongoTemplate;

    public MongoRepository(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    } 


    public List<Player> getPlayers(){
        return mongoTemplate.find(new Query(), Player.class);
    }
}