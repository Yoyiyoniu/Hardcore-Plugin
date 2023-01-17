package Event;

import cyanuront.core.Main;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerVegan implements Listener {

    private Main main = (Main)Main.getPlugin(Main.class);
    int dur = 200;//es en ticks
    int power = 4;//poder del efecto
    @EventHandler
    public void onEat(PlayerItemConsumeEvent e){
        boolean veganos = this.main.getConfig().getBoolean("veganos");
        boolean antiLeche = this.main.getConfig().getBoolean("antiLeche");

        if (veganos) {
            if (e.getItem().getType() == Material.ROTTEN_FLESH) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COOKED_BEEF) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.BEEF) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.PORKCHOP) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.MUTTON) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COOKED_MUTTON) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.CHICKEN) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COOKED_CHICKEN) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.RABBIT) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COOKED_RABBIT) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COD) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COOKED_COD) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.SALMON) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.COOKED_SALMON) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.TROPICAL_FISH) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.PUFFERFISH) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
            if (e.getItem().getType() == Material.SPIDER_EYE) {

                e.getPlayer().addPotionEffect(new PotionEffect
                        (PotionEffectType.WITHER, dur, power, false, false, false));
            }
        }
        if (antiLeche && e.getItem().getType() == Material.MILK_BUCKET) {
            e.getPlayer().addPotionEffect(new PotionEffect
                    (PotionEffectType.WITHER, dur, power, false, false, false));
        }
    }

}
