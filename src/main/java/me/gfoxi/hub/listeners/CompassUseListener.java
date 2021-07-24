package me.gfoxi.hub.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class CompassUseListener implements Listener {

    @EventHandler
    public void onInterract(PlayerInteractEvent event) {
        Player p = event.getPlayer();

        if (p.getItemInHand().equals(Material.COMPASS)) {
            Inventory inv = Bukkit.createInventory(null,54, "&3&lWybierz tryb");

            p.openInventory(inv);
        }
        else {
            return;
        }
    }
}
