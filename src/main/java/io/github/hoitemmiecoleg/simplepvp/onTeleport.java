package io.github.hoitemmiecoleg.simplepvp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import static org.bukkit.Bukkit.getLogger;

public class onTeleport implements Listener {

    public World pvp = Bukkit.getWorld("pvp1");
    Location spawn1 = new Location(pvp, 10, 7, 5);

    @EventHandler
    public void onTeleportEvent(PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        Location from = event.getFrom();
        Location to = event.getTo();
        Bukkit.broadcastMessage("Welcome to the server!");
        Bukkit.broadcastMessage("Player has teleported from " + from.getWorld().getName() + "to " + to.getWorld().getName());
        //if (to.getWorld().getName().equals(pvp.getName())) {
            //double spawn = Math.random() * 2 + 1;
            //if (spawn == 1) {
                //player.teleport(spawn1);
            //}
        //}
    }
}

