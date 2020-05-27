import commands.GamemodeCommand;
import commands.PrivateMessageCommand;
import listeners.DMListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerManager extends JavaPlugin {

    public static long time;
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new DMListener(),this);

        GamemodeCommand gamemodeCommand = new GamemodeCommand();
        getCommand("gamemode").setExecutor(gamemodeCommand);
        getCommand("msg").setExecutor(new PrivateMessageCommand());
        getCommand("gamemode").setTabCompleter(gamemodeCommand);

    }
}
