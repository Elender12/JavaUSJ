package dev.futurepath.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Plain old java object representing a team.
 * 
 * @author anselm
 */
public class Team {
    
    private int id;
    
    private String name;
    
    private List<Player> players;

    public Team() {
        this.id = 0;
        this.name = "";
        this.players = new ArrayList<>();
    }

    public Team(int id, String name, List<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        if(players == null)
            players = new ArrayList<>();
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    
    @Override
    public String toString() {
        return getId() + " - " + getName();
    }
    
    public void listPlayers() {
        for(Player member : players)
            System.out.println(member);
    }
    
}
