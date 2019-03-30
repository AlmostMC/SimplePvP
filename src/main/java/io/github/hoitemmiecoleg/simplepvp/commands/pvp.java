package io.github.hoitemmiecoleg.simplepvp.commands;

import jdk.nashorn.internal.codegen.CompilerConstants;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class pvp extends TimerTask implements CommandExecutor {
    public Scoreboard pvpBoard = Bukkit.getScoreboardManager().getNewScoreboard();
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            World pvp = Bukkit.getWorld("pvp1");
            Player player = (Player) sender;

            Location spawn0 = new Location(pvp, -669.5, 80, -896.5);
            Location spawn1 = new Location(pvp, -686.3, 61.125, -934.7, 48, 18);
            Location spawn2 = new Location(pvp, -710.3, 62, -842.3, 126, 11);
            Location spawn3 = new Location(pvp, -605.7, 62, -915.925, -117, 25);
            Location spawn4 = new Location(pvp, -568.5, 68.5, -879.5);
            Location spawn5 = new Location(pvp, -728.5, 86, -935.5, -63, 18);
            Location spawn6 = new Location(pvp, 10, 10, 10);
            Location spawn7 = new Location(pvp, 10, 10, 10);
            Location spawn8 = new Location(pvp, 10, 10, 10);
            Location spawn9 = new Location(pvp, 10, 10, 10);

            Random rand = new Random();
            int spawn = rand.nextInt(6);
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


            //Inventory and Player settings
            player.setHealth(20.0);
            player.setLevel(0);
            player.setExp(0);
            player.setFoodLevel(20);
            player.setFireTicks(0);
            player.setGameMode(GameMode.ADVENTURE);

            ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
            sword.getItemMeta().addEnchant(Enchantment.KNOCKBACK, 3, true);sword.getItemMeta().addEnchant(Enchantment.DAMAGE_ALL, 3, true);
            sword.getItemMeta().setUnbreakable(true);

            ItemStack bow = new ItemStack(Material.BOW, 1);
            bow.getItemMeta().addEnchant(Enchantment.ARROW_KNOCKBACK, 3, true);bow.getItemMeta().addEnchant(Enchantment.ARROW_INFINITE, 1, true);
            bow.getItemMeta().setUnbreakable(true);

            ItemStack arrow = new ItemStack(Material.ARROW, 1);

            ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
            chestplate.getItemMeta().addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            chestplate.getItemMeta().setUnbreakable(true);

            ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
            leggings.getItemMeta().addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            leggings.getItemMeta().setUnbreakable(true);

            ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
            boots.getItemMeta().addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            boots.getItemMeta().setUnbreakable(true);

            player.getInventory().clear();
            player.getInventory().setItem(0, sword);
            player.getInventory().setItem(1, bow);
            player.getInventory().setItem(9, arrow);
            player.getInventory().setChestplate(chestplate);
            player.getInventory().setLeggings(leggings);
            player.getInventory().setBoots(boots);
            player.updateInventory();


            player.setScoreboard(pvpBoard);

            return true;
        }
        else {
            return false;
        }
    }
    public void ScoreboardChange() {
        Objective kills = pvpBoard.registerNewObjective("kills", "playerKillCount");
        kills.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD + "- " + ChatColor.RESET.toString() + ChatColor.GOLD + "Goldstrike Network");

        Score killTitle = kills.getScore(ChatColor.RED + "Kills");
        killTitle.setScore(1000);

        String boardPosition = pvpBoard.getObjective(DisplaySlot.SIDEBAR).getName();


        Objective stats = pvpBoard.registerNewObjective("stats", "dummy");
        stats.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD + "- " + ChatColor.RESET.toString() + ChatColor.GOLD + "Goldstrike Network");

        Score game = stats.getScore(ChatColor.GOLD.toString() + ChatColor.BOLD + "PVP");
        killTitle.setScore(1);


        if (boardPosition.equals("kills")) {
            stats.setDisplaySlot(DisplaySlot.SIDEBAR);
        }
        else {
            kills.setDisplaySlot(DisplaySlot.SIDEBAR);
        }
    }
    public void run()
    {
        final pvp call = new pvp();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                call.ScoreboardChange();
            }
        }, 4000);
    }
}