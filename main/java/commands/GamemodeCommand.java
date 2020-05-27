package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.List;

public class GamemodeCommand implements CommandExecutor, TabCompleter {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 2) {
                Player parsedPlayer = Bukkit.getPlayer(args[1]);
                if (parsedPlayer != null) {
                    if (args[0].equals("1") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative")) {
                        sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " CREATIVE");
                        parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " CREATIVE");
                        parsedPlayer.setGameMode(GameMode.CREATIVE);
                        return true;
                    } else if (args[0].equals("0") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival")) {
                        sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " SURVIVAL");
                        parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " SURVIVAL");
                        parsedPlayer.setGameMode(GameMode.SURVIVAL);
                        return true;
                    } else if (args[0].equals("3") || args[0].equalsIgnoreCase("p") || args[0].equalsIgnoreCase("spectator")) {
                        sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " SPECTATOR");
                        parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " SPECTATOR");
                        parsedPlayer.setGameMode(GameMode.SPECTATOR);
                        return true;
                    } else if (args[0].equals("2") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure")) {
                        sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " ADVENTURE");
                        parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " ADVENTURE");
                        parsedPlayer.setGameMode(GameMode.ADVENTURE);
                        return true;
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "(!) Player not found.");
                    return true;
                }
            } else {
                sender.sendMessage(ChatColor.RED + "(!) Wrong usage!");
                return true;
            }
        } else {
            if (sender.hasPermission("gamemode.switch")) {
                if (args.length == 2) {
                    Player parsedPlayer = Bukkit.getPlayer(args[1]);
                    if (parsedPlayer != null) {
                        if (args[0].equals("1") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative")) {
                            sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " CREATIVE");
                            parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " CREATIVE");
                            parsedPlayer.setGameMode(GameMode.CREATIVE);
                        } else if (args[0].equals("0") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival")) {
                            sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " SURVIVAL");
                            parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " SURVIVAL");
                            parsedPlayer.setGameMode(GameMode.SURVIVAL);
                        } else if (args[0].equals("3") || args[0].equalsIgnoreCase("p") || args[0].equalsIgnoreCase("spectator")) {
                            sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " SPECTATOR");
                            parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " SPECTATOR");
                            parsedPlayer.setGameMode(GameMode.SPECTATOR);
                        } else if (args[0].equals("2") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure")) {
                            sender.sendMessage(ChatColor.GOLD + "The player's gamemode has been succesfully changed to: " + ChatColor.GREEN + " ADVENTURE");
                            parsedPlayer.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " ADVENTURE");
                            parsedPlayer.setGameMode(GameMode.ADVENTURE);
                        }
                    } else {
                        sender.sendMessage(ChatColor.RED + "(!) Player not found.");
                    }
                } else if (args.length == 1) {
                    Player player = (Player) sender;

                    if (args[0].equals("1") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative")) {
                        player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " CREATIVE");
                        player.setGameMode(GameMode.CREATIVE);
                    } else if (args[0].equals("0") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival")) {
                        player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " SURVIVAL");
                        player.setGameMode(GameMode.SURVIVAL);
                    } else if (args[0].equals("3") || args[0].equalsIgnoreCase("p") || args[0].equalsIgnoreCase("spectator")) {
                        player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " SPECTATOR");
                        player.setGameMode(GameMode.SPECTATOR);
                    } else if (args[0].equals("2") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure")) {
                        player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to: " + ChatColor.GREEN + " ADVENTURE");
                        player.setGameMode(GameMode.ADVENTURE);
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "(!) Wrong usage!");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "(!) You don't have permissions to do that!");
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
