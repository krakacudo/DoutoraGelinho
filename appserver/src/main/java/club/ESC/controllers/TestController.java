package club.ESC.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import club.ESC.repos.mongodb.IMongoRepository;
import club.ESC.model.Player;

import java.util.List;

@RestController
public class TestController {

    private final IMongoRepository mongoRepository;

    public TestController(IMongoRepository mongoRepository){
        this.mongoRepository = mongoRepository;
    }

    @GetMapping("/api")
    public ResponseEntity<List<Player>> amazing() {
        List<Player> players = mongoRepository.getPlayers();
        return ResponseEntity.ok(players);
    }
    
}
