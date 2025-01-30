package fr.tevtev.Minecraft_Plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.Console;

public class CommandTeva implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player joueur = (Player) commandSender;
            joueur.sendMessage(ChatColor.RED + "Tu est un joueur" + joueur.getName());
        }
        else if(commandSender instanceof ConsoleCommandSender){
            commandSender.sendMessage("Tu es dans la console");
        }
        return true;
    }
}
