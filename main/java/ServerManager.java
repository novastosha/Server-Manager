import commands.GamemodeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerManager extends JavaPlugin {

    public static long time;
    @Override
    public void onEnable() {
        getCommand("gmc").setExecutor(new GamemodeCommand());
        getCommand("gms").setExecutor(new GamemodeCommand());
        getCommand("gma").setExecutor(new GamemodeCommand());
        getCommand("gmp").setExecutor(new GamemodeCommand());
    }
}
