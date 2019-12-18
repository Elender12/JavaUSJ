package dev.futurepath.model.repository;

import dev.futurepath.model.Player;
import dev.futurepath.model.Team;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anselm
 */
public class SingletonDataRepository {
    
    private static SingletonDataRepository INSTANCE;
    
    private Map<Integer, Team> teams;
    private Map<Integer, Player> players;

    private SingletonDataRepository() {
        teams = new HashMap<>();
        players = new HashMap<>();
    }

    public static SingletonDataRepository getInstance() {
        if(INSTANCE == null)
            INSTANCE = new SingletonDataRepository();
        return INSTANCE;
    }

    public Map<Integer, Player> getPlayers() {
        return players;
    }

    public Map<Integer, Team> getTeams() {
        return teams;
    }
    
}
