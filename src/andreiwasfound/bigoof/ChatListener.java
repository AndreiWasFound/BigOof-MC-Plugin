package andreiwasfound.bigoof;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private Main plugin;
    public ChatListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if (e.getMessage().equalsIgnoreCase("oof")) {
            Bukkit.getScheduler().runTask(plugin, new Runnable() {
                public void run() {
                    e.getPlayer().kickPlayer("Big Oof");
                }
            });
        }
    }
}
