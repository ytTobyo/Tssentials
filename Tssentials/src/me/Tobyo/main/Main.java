package me.Tobyo.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.Tobyo.commands.heal;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		
		PluginManager pm = Bukkit.getPluginManager();
		getCommand("heal").setExecutor(new heal());
	}
	
	@Override
	public void onDisable() {
		
	}
}
