package io.github.hoitemmiecoleg.simplepvp;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;

import java.util.UUID;

public class SimplePvP extends JavaPlugin {
    private boolean disable = false;
    public double pvpX;
    public double pvpY;
    public double pvpZ;
    public World pvp = Bukkit.getWorld("pvp1");

    public void PlayerChangedWorldEvent(Player player) {
        World from = player.getWorld();
        if (from.getName().equals(pvp.getName())) {

        }
    }

    Location playerLocation = new Location(pvp, pvpX, pvpY, pvpZ);

    @Override
    public void onEnable() {
        getLogger().info("SimplePvP has started.");

    }
    @Override
    public void onDisable() {
        getLogger().info("SimplePvP has been disabled.");
    }
}
