package io.github.hoitemmiecoleg.simplepvp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PlayerTeleportEventListener implements Listener {
    @EventHandler
    public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
        if (!event.getTo().getWorld().equals(Bukkit.getWorld("pvp1"))) {
            event.getPlayer().setScoreboard(Bukkit.getScoreboardManager().getMainScoreboard());
        }
    }
}
