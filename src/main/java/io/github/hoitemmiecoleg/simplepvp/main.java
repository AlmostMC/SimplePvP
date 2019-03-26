package io.github.hoitemmiecoleg.simplepvp;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;


public class main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("SimplePvP has been enabled");
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Team red = board.registerNewTeam("red");
    }

    @Override
    public void onLoad() {
        getServer().getPluginManager().registerEvents(new onTeleport(), this);
        getLogger().info("Simple PvP has loaded");
    }
    @Override
    public void onDisable() {
        getLogger().info("SimplePvP has been disabled.");
    }
}
