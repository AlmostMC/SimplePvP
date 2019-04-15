package io.github.hoitemmiecoleg.simplepvp.listeners;

import io.github.hoitemmiecoleg.simplepvp.pvp;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathEventListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if (event.getEntity().getLocation().getWorld().equals(Bukkit.getWorld("pvp1"))) {
            event.setCancelled(true);
            new pvp().activatePVP(event.getEntity());
        }
    }
}
