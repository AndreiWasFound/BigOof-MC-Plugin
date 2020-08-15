package andreiwasfound.bigoof;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        printToConsole("Events are trying to register");
        registerEvents();
        printToConsole("Events have been registered successfully");
    }

    @Override
    public void onDisable() {

    }

    private void registerEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new ChatListener(this), this);
    }

    public void printToConsole(String msg) {
        this.getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_GREEN + "BigOof" + ChatColor.DARK_GRAY + "]" + ChatColor.RESET + " " + msg);
    }
}
