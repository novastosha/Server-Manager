import commands.GamemodeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerManager extends JavaPlugin {

    public static long time;
    @Override
    public void onEnable() {
        GamemodeCommand gamemodeCommand = new GamemodeCommand();
        getCommand("gamemode").setExecutor(gamemodeCommand);
        getCommand("gamemode").setTabCompleter(gamemodeCommand);
    }
}
