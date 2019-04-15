package io.github.hoitemmiecoleg.simplepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import io.github.hoitemmiecoleg.simplepvp.pvp;

public class pvpCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            new pvp().activatePVP(player);
            return true;
        }
        else {
            return false;
        }
    }
}