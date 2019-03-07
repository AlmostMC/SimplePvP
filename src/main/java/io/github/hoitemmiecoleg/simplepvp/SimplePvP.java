package io.github.hoitemmiecoleg.simplepvp;
import org.bukkit.plugin.java.JavaPlugin;



public class SimplePvP extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SimplePvP has started.");

    }
    @Override
    public void onDisable() {
        getLogger().info("SimplePvP has been disabled.");
    }
}
