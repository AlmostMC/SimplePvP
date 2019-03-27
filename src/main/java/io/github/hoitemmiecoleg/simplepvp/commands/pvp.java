package io.github.hoitemmiecoleg.simplepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;

public class pvp implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            World pvp = Bukkit.getWorld("pvp1");
            Player player = (Player) sender;

            Location spawn0 = new Location(pvp, 10, 10, 10);
            Location spawn1 = new Location(pvp, 10, 10, 10);
            Location spawn2 = new Location(pvp, 10, 10, 10);
            Location spawn3 = new Location(pvp, 10, 10, 10);
            Location spawn4 = new Location(pvp, 10, 10, 10);
            Location spawn5 = new Location(pvp, 10, 10, 10);
            Location spawn6 = new Location(pvp, 10, 10, 10);
            Location spawn7 = new Location(pvp, 10, 10, 10);
            Location spawn8 = new Location(pvp, 10, 10, 10);
            Location spawn9 = new Location(pvp, 10, 10, 10);

            Random rand = new Random();
            int spawn = rand.nextInt(10);
            if (spawn == 0) {
                player.teleport(spawn0);
            }
            if (spawn == 1) {
                player.teleport(spawn1);
            }
            if (spawn == 2) {
                player.teleport(spawn2);
            }
            if (spawn == 3) {
                player.teleport(spawn3);
            }
            if (spawn == 4) {
                player.teleport(spawn4);
            }
            if (spawn == 5) {
                player.teleport(spawn5);
            }
            if (spawn == 6) {
                player.teleport(spawn6);
            }
            if (spawn == 7) {
                player.teleport(spawn7);
            }
            if (spawn == 8) {
                player.teleport(spawn8);
            }
            if (spawn == 9) {
                player.teleport(spawn9);
            }

            return true;
        }
        else {
            return false;
        }
    }
}
