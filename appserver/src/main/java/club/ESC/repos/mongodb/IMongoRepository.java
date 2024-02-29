package club.ESC.repos.mongodb;

import java.util.List;

import club.ESC.model.Player;

public interface IMongoRepository {
    List<Player> getPlayers();
}
