package dev.futurepath.controllers;

import dev.futurepath.controllers.exceptions.NoTeamSelectedException;
import dev.futurepath.controllers.exceptions.WrongNumberException;
import dev.futurepath.controllers.exceptions.WrongNameException;
import dev.futurepath.model.Player;
import dev.futurepath.model.Team;
import dev.futurepath.model.daos.IDao;
import dev.futurepath.model.daos.PlayerDao;
import dev.futurepath.views.CreatePlayerPanel;
import dev.futurepath.views.DeletePlayerPanel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author anselm
 */
public class PlayerController {

    private CreatePlayerPanel createPanel;
    private DeletePlayerPanel deletePanel;

    public PlayerController(CreatePlayerPanel createPanel) {
        this.createPanel = createPanel;
    }
    public PlayerController(DeletePlayerPanel deletePanel){
        this.deletePanel= deletePanel;
    }
    
    public void createPlayer() throws NoTeamSelectedException, WrongNameException, WrongNumberException {
        Player player = getPlayerFromTheInteface();
        if(player.getTeam() == null)
            throw new NoTeamSelectedException();
        if(player.getName().trim().isEmpty())
            throw new WrongNameException();
        if(player.getNumber() < 0 || player.getNumber() > 99)
            throw new WrongNumberException();
        setPlayerIntoTheInterface(new PlayerDao().create(player));
    }

    private Player getPlayerFromTheInteface() {
       Player player = new Player();
       player.setName(createPanel.getTxtName().getText());
       player.setNumber(Integer.parseInt(createPanel.getTxtNumber().getText()));
       player.setTeam((Team) createPanel.getCbTeam().getSelectedItem());
       return player;
    }

    private void setPlayerIntoTheInterface(Player player) {
       createPanel.getLblId().setText("" + player.getId());
       createPanel.getTxtName().setText(player.getName());
       createPanel.getTxtNumber().setText("" + player.getNumber());
       createPanel.getCbTeam().setSelectedItem(player.getTeam());
    }
    public void deletePlayer(){
        //deletePanel.
        List<Player> players = new PlayerDao().readAll();
        players.forEach( (player1) -> {
                deletePanel.getListPlayers().addItem(player1);
            });
        Player player = (Player) deletePanel.getListPlayers().getSelectedItem();
        setPlayerIntoTheInterface(new PlayerDao().delete(player.getId()));
        
    }
  
}
