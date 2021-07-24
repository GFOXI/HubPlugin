package me.gfoxi.hub.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropItemsListener implements Listener {

    @EventHandler
    public void onDropItems(PlayerDropItemEvent event) {

        event.setCancelled(true);

    }

}
