package cyanuront.core;

import Event.PlayerVegan;
import Event.creatureEvent;
import Event.deathEvent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {


    ConsoleCommandSender cmd = Bukkit.getConsoleSender();
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new deathEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerVegan(), this);
        getServer().getPluginManager().registerEvents(new creatureEvent(), this);

        saveDefaultConfig();
        mensaje();
    }
    @Override
    public void onDisable() {
        System.out.println("§cCyanuront 2 Disable");
    }

    private void mensaje(){

        cmd.sendMessage("");
        cmd.sendMessage("§b█▀▀ █  █ █▀▀█ █▀▀▄ █  █ █▀▀█ █▀▀█ █▀▀▄ ▀▀█▀▀   █▀█ ");
        cmd.sendMessage("§b█   █▄▄█ █▄▄█ █  █ █  █ █▄▄▀ █  █ █  █   █      ▄▀");
        cmd.sendMessage("§b▀▀▀ ▄▄▄█ ▀  ▀ ▀  ▀  ▀▀▀ ▀ ▀▀ ▀▀▀▀ ▀  ▀   ▀     █▄▄");
        cmd.sendMessage("");
        System.out.println("§aCyanuront 2 by RodrigoLeon");
        cmd.sendMessage("");
    }


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("cyanuront2")) {

            if (args.length == 0) {
                sender.sendMessage("§x§0§8§4§c§f§b[§x§1§9§5§d§f§bC§x§2§9§6§d§f§by§x§3§a§7§e§f§ca§x§4§a§8§f§f§cn§x§5§b§a§0§f§cu§x§6§b§b§0§f§cr§x§7§c§c§1§f§co§x§8§c§d§2§f§dn§x§9§d§e§2§f§dt§x§a§d§f§3§f§d] §eComandos");
                sender.sendMessage("§7- /cyanuront2 reload");
            }
            if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("cyanuront2.reload")) {
                    sender.sendMessage("§x§0§8§4§c§f§b[§x§1§9§5§d§f§bC§x§2§9§6§d§f§by§x§3§a§7§e§f§ca§x§4§a§8§f§f§cn§x§5§b§a§0§f§cu§x§6§b§b§0§f§cr§x§7§c§c§1§f§co§x§8§c§d§2§f§dn§x§9§d§e§2§f§dt§x§a§d§f§3§f§d]"
                            + "§ePlugin bien hecho y recagado :D");
                    this.reloadConfig();
                }else{
                    sender.sendMessage("§x§0§8§4§c§f§b[§x§1§9§5§d§f§bC§x§2§9§6§d§f§by§x§3§a§7§e§f§ca§x§4§a§8§f§f§cn§x§5§b§a§0§f§cu§x§6§b§b§0§f§cr§x§7§c§c§1§f§co§x§8§c§d§2§f§dn§x§9§d§e§2§f§dt§x§a§d§f§3§f§d]"
                            + " §ePermisos insuficientes?");

                }
            }
        }
        return false;
    }

}

