package io.github.hoitemmiecoleg.simplepvp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerTeleportEvent extends PlayerMoveEvent {

    public World pvp = Bukkit.getWorld("pvp1");
    Location spawn1 = new Location(pvp, 10, 7, 5);

    public PlayerTeleportEvent(Player player, Location from, Location to) {
        super(player, from, to);
        if (from.getWorld().getName().equals(pvp.getName())) {
            double spawn = Math.random() * 2 + 1;
            if (spawn == 1) {
                player.teleport(spawn1);
            }
        }
    }
}
