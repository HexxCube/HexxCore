package me.hexxcube.mcplugin.hexxcore;

import me.hexxcube.mcplugin.hexxcore.io.FileIO;
import org.bukkit.plugin.java.JavaPlugin;

public final class HexxCore extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// Plugin startup logic
		getLogger().info("Starting HexxAlias!");
		
		// read/create file settings
		FileIO config = new FileIO("config.yml");
		
		// 
		
		
		getLogger().info("HexxAPI enabled.");
	}
	
	@Override
	public void onDisable() {
		// Plugin shutdown logic
		getLogger().info("Stopping HexxAlias!");
		
	}
	
}
