package Event;

import cyanuront.core.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;


public class deathEvent implements Listener {

    private Main main = (Main)Main.getPlugin(Main.class);
    @EventHandler
    public void totems(EntityResurrectEvent e){
        boolean totems = this.main.getConfig().getBoolean("totems");

        double random = Math.random();
        double redondeado = Math.round(random);
        //el random saca numero entre 0 y 1

        if (redondeado == 0 && totems) {
            e.setCancelled(true);

        }
    }



}
