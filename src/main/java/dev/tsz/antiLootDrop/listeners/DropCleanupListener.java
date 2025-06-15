package dev.tsz.antiLootDrop.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.plugin.Plugin;

public class DropCleanupListener implements Listener {

    private final Plugin plugin;

    public DropCleanupListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onItemSpawn(ItemSpawnEvent event) {
        Item item = event.getEntity();
        Bukkit.getScheduler().runTaskLater(plugin, item::remove, 1L); // Remove after 1 tick
    }
}
