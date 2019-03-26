package io.github.hoitemmiecoleg.simplepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class pvp implements CommandExecutor {
    public World pvp = Bukkit.getWorld("pvp1");
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("pvp")) {
            Location spawn1 = new Location(pvp, 10, 10, 10);
            Player player = (Player) sender;
            player.teleport(spawn1);
            return true;
        }
        else {
            return false;
        }
    }
}
