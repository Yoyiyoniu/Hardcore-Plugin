package Event;

import cyanuront.core.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class creatureEvent implements Listener {

    private Main main = (Main)Main.getPlugin(Main.class);
    int duracion = 72000;
    int power = 5;
    @EventHandler
    public void creatureEvents(CreatureSpawnEvent e) {

        //efectos
        boolean velocidad = this.main.getConfig().getBoolean("velocidad");
        boolean salto = this.main.getConfig().getBoolean("salto");
        boolean invisivilidad = this.main.getConfig().getBoolean("invisivilidad");
        boolean spawnExplosion = this.main.getConfig().getBoolean("spawnExplosion");
        boolean velocidadacuatica = this.main.getConfig().getBoolean("velocidadacuatica");


        if (salto) {
            e.getEntity().addPotionEffect(new PotionEffect
                    (PotionEffectType.JUMP, duracion, power, false, true, false));
        }
        if (velocidad) {
            e.getEntity().addPotionEffect(new PotionEffect
                    (PotionEffectType.SPEED, duracion, 4, false, true, false));
        }
        if (invisivilidad) {
            e.getEntity().addPotionEffect(new PotionEffect
                    (PotionEffectType.INVISIBILITY, duracion, power, false, true, false));
        }
        if (velocidadacuatica) {
            e.getEntity().addPotionEffect(new PotionEffect
                    (PotionEffectType.WATER_BREATHING, duracion, power, false, true, false));
            e.getEntity().addPotionEffect(new PotionEffect
                    (PotionEffectType.DOLPHINS_GRACE, duracion, power, false, true, false));
        }
        if (spawnExplosion) {
            e.getLocation().createExplosion(20);
        }
    }
}
