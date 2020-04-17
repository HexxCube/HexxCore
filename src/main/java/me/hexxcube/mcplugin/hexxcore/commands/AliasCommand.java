package me.hexxcube.mcplugin.hexxcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class AliasCommand extends HexxCommand {
	public String originName;
	public String aliasName;
	public String permissionLevel;
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 2) {
			
			return true;
		} else {
			System.out.println();
		}
		
		
		return false;
	}
}
