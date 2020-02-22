package net.projectx.menecia;

import net.projectx.menecia.mobs.MobManager;
import net.projectx.menecia.player.PlayerManager;
import net.projectx.menecia.mobs.healthbar.MobHealthBarManager;
import net.projectx.menecia.resources.utilities.Log;

public class Manager {

    private PlayerManager playerManager;
    private MobHealthBarManager mobHealthBarManager;

    Manager(Menecia plugin) {
        MobManager.register();
        playerManager = new PlayerManager();
        mobHealthBarManager = new MobHealthBarManager(plugin);
        Log.sendSuccess("DataManager has created");
    }


    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    public MobHealthBarManager getMobHealthBarManager() {
        return mobHealthBarManager;
    }

}