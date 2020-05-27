import commands.GamemodeCommand;
import listeners.DMListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerManager extends JavaPlugin {

    public static long time;
    @Override
    public void onEnable() {
        getCommand("gmc").setExecutor(new GamemodeCommand());
        getCommand("gms").setExecutor(new GamemodeCommand());
        getCommand("gma").setExecutor(new GamemodeCommand());
        getCommand("gmp").setExecutor(new GamemodeCommand());
        Bukkit.getPluginManager().registerEvents(new DMListener(),this);
        GamemodeCommand gamemodeCommand = new GamemodeCommand();
        getCommand("gamemode").setExecutor(gamemodeCommand);
        getCommand("gamemode").setTabCompleter(gamemodeCommand);

    }
}
