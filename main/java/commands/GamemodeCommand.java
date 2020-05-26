package commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.hasPermission("gamemode.switch")){
            if(command.getName().equalsIgnoreCase("gmc")){
                if(player.getGameMode() != GameMode.CREATIVE) {
                    player.sendMessage("§3Your gamemode is now: §bCreative");
                    player.setGameMode(GameMode.CREATIVE);
                }
            }
            if(command.getName().equalsIgnoreCase("gma")){
                if(player.getGameMode() != GameMode.ADVENTURE) {
                    player.sendMessage("§3Your gamemode is now: §bAdventure");
                    player.setGameMode(GameMode.ADVENTURE);
                }
            }
            if(command.getName().equalsIgnoreCase("gms"))
            {
                if(player.getGameMode() != GameMode.SURVIVAL) {

                    player.sendMessage("§3Your gamemode is now: §bSurvival");
                    player.setGameMode(GameMode.SURVIVAL);
                }
            }
            if(command.getName().equalsIgnoreCase("gmp")){

                if(player.getGameMode() != GameMode.SPECTATOR) {
                    player.sendMessage("§3Your gamemode is now: §bSpectator");
                    player.setGameMode(GameMode.SPECTATOR);
                }
            }
        }else{
            player.sendMessage("§cYou don't have permission!");
        }
        return true;
    }
}
