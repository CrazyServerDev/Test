package de.crazyserverdev.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	
	@Override
	public void onEnable() {
Bukkit.getConsoleSender().sendMessage("aktiv");
	}

}
