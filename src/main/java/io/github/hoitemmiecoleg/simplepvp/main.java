package io.github.hoitemmiecoleg.simplepvp;

import io.github.hoitemmiecoleg.simplepvp.commands.pvp;
import io.github.hoitemmiecoleg.simplepvp.events.PlayerJoin;
import io.github.hoitemmiecoleg.simplepvp.events.PlayerTeleport;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("SimplePvP has been enabled");

        getServer().getPluginManager().registerEvents(new PlayerTeleport(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

        this.getCommand("pvp").setExecutor(new pvp());

        pvp call = new pvp();
        call.run();
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
