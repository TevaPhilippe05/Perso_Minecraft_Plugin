package fr.tevtev.Minecraft_Plugin;

import fr.tevtev.Minecraft_Plugin.commands.CommandTeva;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Ouverture");
        this.getCommand("teva").setExecutor(new CommandTeva());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Fermeture");
    }
}
