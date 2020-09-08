package net.kjnine.entityanimationapi;

public class EntityAnimationAPI {

	public static EntityAnimationAPI getAPI() {
		return EntityAnimationPlugin.getInstance().getAPI();
	}
	
	private EntityAnimationPlugin plugin;

	public EntityAnimationAPI(EntityAnimationPlugin plugin) {
		this.plugin = plugin;
	}
	
	
	
}
