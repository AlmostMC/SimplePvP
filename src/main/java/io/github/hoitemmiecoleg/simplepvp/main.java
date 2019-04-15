package io.github.hoitemmiecoleg.simplepvp;

import io.github.hoitemmiecoleg.simplepvp.commands.pvpCommand;
import io.github.hoitemmiecoleg.simplepvp.listeners.PlayerDeathEventListener;
import io.github.hoitemmiecoleg.simplepvp.listeners.PlayerJoinEventListener;
import io.github.hoitemmiecoleg.simplepvp.listeners.PlayerTeleportEventListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("SimplePvP has been enabled");

        getServer().getPluginManager().registerEvents(new PlayerTeleportEventListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinEventListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeathEventListener(), this);

        this.getCommand("pvp").setExecutor(new pvpCommand());
    }

    @Override
    public void onLoad() {
        getLogger().info("Simple PvP has loaded");
    }
    @Override
    public void onDisable() {
        getLogger().info("SimplePvP has been disabled.");
    }
}
