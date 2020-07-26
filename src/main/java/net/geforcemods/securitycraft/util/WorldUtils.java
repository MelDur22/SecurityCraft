package net.geforcemods.securitycraft.util;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceContext.BlockMode;
import net.minecraft.util.math.RayTraceContext.FluidMode;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

public class WorldUtils{

	/**
	 * Correctly schedules a task for execution on the main thread depending on if the
	 * provided world is client- or serverside
	 */
	public static void addScheduledTask(IWorld w, Runnable r)
	{
		if(w.isRemote()) //clientside
			Minecraft.getInstance().execute(r);
		else //serverside
			ServerLifecycleHooks.getCurrentServer().execute(r);
	}

	/**
	 * Performs a ray trace against all blocks (except liquids) from the starting X, Y, and Z
	 * to the end point, and returns true if a block is within that path.
	 *
	 * Args: Starting X, Y, Z, ending X, Y, Z.
	 */
	public static boolean isPathObstructed(Entity entity, World world, double x1, double y1, double z1, double x2, double y2, double z2) {
		return world.rayTraceBlocks(new RayTraceContext(new Vector3d(x1, y1, z1), new Vector3d(x2, y2, z2), BlockMode.OUTLINE, FluidMode.NONE, entity)) != null;
	}

	public static void spawnLightning(World world, Vector3d pos, boolean effectOnly)
	{
		world.addEntity(createLightning(world, pos, effectOnly));
	}

	public static LightningBoltEntity createLightning(World world, Vector3d pos, boolean effectOnly)
	{
		LightningBoltEntity lightning = EntityType.LIGHTNING_BOLT.create(world);

		lightning.moveForced(pos);
		lightning.setEffectOnly(effectOnly);
		return lightning;
	}
}