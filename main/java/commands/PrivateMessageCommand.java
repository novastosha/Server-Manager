package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PrivateMessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("msg")){
            if(args.length == 2){
                Player player = null;
                for(Player playerF : Bukkit.getOnlinePlayers()){
                    if(playerF.getName().equalsIgnoreCase(args[0])){
                        player = playerF;
                    }
                }
                if(player != null) {
                    
                    return true;
                }else{
                    commandSender.sendMessage(ChatColor.RED+"Could not find that player");
                    return true;
                    }

            }else{
                if(args.length == 0){
                    commandSender.sendMessage(ChatColor.RED+"Please type a player's name!");
                }
                if(args.length == 1){
                    commandSender.sendMessage(ChatColor.RED+"Please type a message!");
                }
                return true;
            }
        }
        return true;
    }
}
