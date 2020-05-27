package commands;

import events.PrivateMessageReceiveEvent;
import events.PrivateMessageSentEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.xml.bind.DatatypeConverter;

public class PrivateMessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(!(commandSender instanceof  Player)){
            commandSender.sendMessage(ChatColor.RED+"Only players can execute this command!");
            return true;
        }

        if(command.getName().equalsIgnoreCase("msg")){
            if(args.length >= 2){
                Player player = null;
                for(Player playerF : Bukkit.getOnlinePlayers()){
                    if(playerF.getName().equalsIgnoreCase(args[0])){
                        player = playerF;
                    }
                }
                if(player != null) {
                    StringBuilder str = new StringBuilder();
                    for( int i = 0; i < args.length; i++ ) {
                        str.append(args[i] + " " );
                    }
                    if(!str.toString().trim().equalsIgnoreCase("")){
                        PrivateMessageSentEvent event = new PrivateMessageSentEvent((Player) commandSender,player,str.toString().trim());
                        Bukkit.getPluginManager().callEvent(event);
                        if(!event.isCancelled()){
                            event.getFrom().sendMessage("§bTo "+event.getTo().getName()+": "+ "§7 "+event.getMessage());
                            PrivateMessageReceiveEvent eventr = new PrivateMessageReceiveEvent(event.getMessage(),event.getFrom(),event.getTo());
                            Bukkit.getPluginManager().callEvent(eventr);
                            if(!eventr.isCancelled()){
                                event.getTo().sendMessage("§bFrom "+event.getFrom().getName()+": "+ "§7 "+event.getMessage());
                            }
                        }
                    }else{
                        commandSender.sendMessage(ChatColor.RED+"Please enter a valid message");
                    }
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
