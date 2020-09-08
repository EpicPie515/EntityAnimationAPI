package net.kjnine.entityanimationapi;

import org.bukkit.plugin.java.JavaPlugin;

public class EntityAnimationPlugin extends JavaPlugin {

	private EntityAnimationAPI api;
	
	private static EntityAnimationPlugin plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		api = new EntityAnimationAPI(this);
	}
	
	public EntityAnimationAPI getAPI() {
		return api;
	}
	
	public static EntityAnimationPlugin getInstance() {
		return plugin;
	}
	
}
