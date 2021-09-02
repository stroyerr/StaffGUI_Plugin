package me.stroyer.staffgui.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("").setExecutor(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
