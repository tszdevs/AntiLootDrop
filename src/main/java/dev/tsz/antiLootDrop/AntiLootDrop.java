package dev.tsz.antiLootDrop;

import org.bukkit.plugin.java.JavaPlugin;
import dev.tsz.antiLootDrop.listeners.DropCleanupListener;

public final class AntiLootDrop extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DropCleanupListener(this), this);

        getLogger().info("AntiLootDrop is Running! Made by @tszdev");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
