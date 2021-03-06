package net.geforcemods.securitycraft.util;

import net.geforcemods.securitycraft.blocks.InventoryScannerBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.geforcemods.securitycraft.tileentity.InventoryScannerTileEntity;

public class Utils {

	/**
	 * Removes the last character in the given String. <p>
	 */
	public static String removeLastChar(String line){
		if(line == null || line.isEmpty())
			return "";

		return line.substring(0, line.length() - 1);
	}

	public static String getFormattedCoordinates(BlockPos pos){
		return "X: " + pos.getX() + " Y: " + pos.getY() + " Z: " + pos.getZ();
	}

	public static void setISinTEAppropriately(World world, BlockPos pos, DefaultedList<ItemStack> contents)
	{
		InventoryScannerTileEntity connectedScanner = InventoryScannerBlock.getConnectedInventoryScanner(world, pos);

		if(connectedScanner == null)
			return;

		connectedScanner.setContents(contents);
	}
}
