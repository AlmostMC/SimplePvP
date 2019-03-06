package io.github.hoitemmiecoleg.simplepvp;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;

public class SimplePvP extends JavaPlugin {
    public boolean disable = false;

    Location playerLocation = new Location(World pvp1, double 7, double 32, double 5)

    @Override
    public void onEnable() {
        getLogger().info("SimplePvP has started.");

        while (disable = false) {
            if (playerLocation.distance(player) < 1.5) {}
        }

    }
    @Override
    public void onDisable() {
        getLogger().info("SimplePvP has been disabled.");
    }
}