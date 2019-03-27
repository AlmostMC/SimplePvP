package io.github.hoitemmiecoleg.simplepvp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class onTeleport implements Listener {

    World pvp = Bukkit.getWorld("pvp1");

    @EventHandler
    public void onTeleportEvent(PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        Location from = event.getFrom();
        Location to = event.getTo();
        Bukkit.broadcastMessage("Player has teleported from " + from.getWorld().getName() + " to " + to.getWorld().getName());
        double spawnX = -737;
        double spawnY = 56;
        double spawnZ = -892;
        Location spawn = new Location(pvp, spawnX, spawnY, spawnZ);
        if (to.getWorld().getName().equals(pvp.getName())) {
            player.teleport(spawn);
        }
    }
}
