package me.Tobyo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Tobyo.utils.Var;

public class heal implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player){
			Player p = (Player)sender;
			if(p.hasPermission("Tssentials.heal")){
				p.setHealth(10*2);
				p.setFoodLevel(20);
				p.sendMessage(Var.pr+"§aDu wurdest geheilt!");
			}else if(p.hasPermission("Tssentials.heal.other")){
				if(Bukkit.getPlayer(args[0]) != null){
						Player target = Bukkit.getPlayer(args[0]);
						target.setHealth(10*2);
						target.setFoodLevel(20);
						target.sendMessage(Var.pr+"§aDu wurdest geheilt!");
				}else{
					p.sendMessage(Var.pr+"§cDer Spieler den du heilen willst ist nicht online!");
				}
			}else{
				p.sendMessage(Var.noperms);
			}
		}else{
			sender.sendMessage(Var.pr+"§cDu bist kein Spieler!");
		}
		return false;
	}

}
