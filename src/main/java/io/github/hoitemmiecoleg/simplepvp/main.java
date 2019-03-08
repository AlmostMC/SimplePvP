package io.github.hoitemmiecoleg.simplepvp;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SimplePvP is starting!");
        getServer().getPluginManager().registerEvents(new onTeleport(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("SimplePvP has been disabled.");
    }
}
