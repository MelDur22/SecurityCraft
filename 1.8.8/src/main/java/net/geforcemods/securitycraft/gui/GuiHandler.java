package net.geforcemods.securitycraft.gui;

import net.geforcemods.securitycraft.api.CustomizableSCTE;
import net.geforcemods.securitycraft.containers.BriefcaseInventory;
import net.geforcemods.securitycraft.containers.ContainerBriefcase;
import net.geforcemods.securitycraft.containers.ContainerCustomizeBlock;
import net.geforcemods.securitycraft.containers.ContainerGeneric;
import net.geforcemods.securitycraft.containers.ContainerInventoryScanner;
import net.geforcemods.securitycraft.containers.ContainerKeypadFurnace;
import net.geforcemods.securitycraft.items.ItemCameraMonitor;
import net.geforcemods.securitycraft.main.mod_SecurityCraft;
import net.geforcemods.securitycraft.tileentity.TileEntityIMS;
import net.geforcemods.securitycraft.tileentity.TileEntityInventoryScanner;
import net.geforcemods.securitycraft.tileentity.TileEntityKeycardReader;
import net.geforcemods.securitycraft.tileentity.TileEntityKeypadFurnace;
import net.geforcemods.securitycraft.tileentity.TileEntityLogger;
import net.geforcemods.securitycraft.util.BlockUtils;
import net.geforcemods.securitycraft.util.PlayerUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int SETUP_KEYCARD_READER_ID = 1;
	public static final int MRAT_MENU_ID = 2;
	public static final int MRAT_ACTIVATE_ID = 3;
	public static final int MRAT_DEACTIVATE_ID = 4;
	public static final int MRAT_DETONATE_ID = 5;
	public static final int INVENTORY_SCANNER_GUI_ID = 6;
	public static final int USERNAME_LOGGER_GUI_ID = 7;
	public static final int KEYPAD_FURNACE_GUI_ID = 8;
	public static final int SETUP_PASSWORD_ID = 9;
	public static final int INSERT_PASSWORD_ID = 10;
	public static final int IMS_GUI_ID = 11;
	public static final int CAMERA_MONITOR_GUI_ID = 12;
	public static final int BRIEFCASE_CODE_SETUP_GUI_ID = 13;
	public static final int BRIEFCASE_INSERT_CODE_GUI_ID = 14;
	public static final int BRIEFCASE_GUI_ID = 15;
	public static final int KEY_CHANGER_GUI_ID = 16;
	public static final int CUSTOMIZE_BLOCK = 100;
	public static final int IRC_INFORMATION = 101;

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getTileEntity(BlockUtils.toPos(x, y, z));

		switch(ID)
		{
			case SETUP_KEYCARD_READER_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case MRAT_MENU_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case MRAT_ACTIVATE_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case MRAT_DEACTIVATE_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case MRAT_DETONATE_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case INVENTORY_SCANNER_GUI_ID:
				return new ContainerInventoryScanner(player.inventory, (TileEntityInventoryScanner) tile_entity);
			case USERNAME_LOGGER_GUI_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case KEYPAD_FURNACE_GUI_ID:
				return new ContainerKeypadFurnace(player.inventory, (TileEntityKeypadFurnace) tile_entity);
			case SETUP_PASSWORD_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case INSERT_PASSWORD_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case IMS_GUI_ID:
				return new ContainerGeneric(player.inventory, tile_entity);
			case CAMERA_MONITOR_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.cameraMonitor))
					return null;
				return new ContainerGeneric(player.inventory, tile_entity);
			case BRIEFCASE_CODE_SETUP_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.briefcase))
					return null;
				return null;
			case BRIEFCASE_INSERT_CODE_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.briefcase))
					return null;
				return null;
			case BRIEFCASE_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.briefcase))
					return null;
				return new ContainerBriefcase(player, player.inventory, new BriefcaseInventory(player.getCurrentEquippedItem()));
			case KEY_CHANGER_GUI_ID:
				if(tile_entity == null || !PlayerUtils.isHoldingItem(player, mod_SecurityCraft.universalKeyChanger)) 
					return null;
				return new ContainerGeneric(player.inventory, tile_entity);
			case CUSTOMIZE_BLOCK:
				return new ContainerCustomizeBlock(player.inventory, (CustomizableSCTE) tile_entity);
			case IRC_INFORMATION:
				return new ContainerGeneric(null, null);
			default:
				return null;
		}
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getTileEntity(BlockUtils.toPos(x, y, z));

		switch(ID)
		{	
			case SETUP_KEYCARD_READER_ID:
				return new GuiKeycardSetup(player.inventory, (TileEntityKeycardReader) tile_entity);
			case MRAT_MENU_ID:
				return new GuiMRAT(player.inventory);
			case MRAT_ACTIVATE_ID:
				return new GuiMRATActivate(player.inventory, player.getCurrentEquippedItem());
			case MRAT_DEACTIVATE_ID:
				return new GuiMRATDeactivate(player.inventory, player.getCurrentEquippedItem());
			case MRAT_DETONATE_ID:
				return new GuiMRATDetonate(player.inventory, player.getCurrentEquippedItem());
			case INVENTORY_SCANNER_GUI_ID:
				return new GuiInventoryScanner(player.inventory, (TileEntityInventoryScanner) tile_entity, player);
			case USERNAME_LOGGER_GUI_ID:
				return new GuiLogger(player.inventory, (TileEntityLogger) tile_entity);
			case KEYPAD_FURNACE_GUI_ID:
				return new GuiKeypadFurnaceInventory(player.inventory, (TileEntityKeypadFurnace) tile_entity);
			case SETUP_PASSWORD_ID:
				return new GuiSetPassword(player.inventory, tile_entity, BlockUtils.getBlock(world, x, y, z));
			case INSERT_PASSWORD_ID:
				return new GuiCheckPassword(player.inventory, tile_entity, BlockUtils.getBlock(world, x, y, z));
			case IMS_GUI_ID:
				return new GuiIMS(player.inventory, (TileEntityIMS) tile_entity);
			case CAMERA_MONITOR_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.cameraMonitor))
					return null;
				return new GuiCameraMonitor(player.inventory, (ItemCameraMonitor) player.getCurrentEquippedItem().getItem(), player.getCurrentEquippedItem().getTagCompound());
			case BRIEFCASE_CODE_SETUP_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.briefcase))
					return null;
				return new GuiBriefcaseSetup(player.inventory, null);
			case BRIEFCASE_INSERT_CODE_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.briefcase))
					return null;
				return new GuiBriefcase(player.inventory, null);
			case BRIEFCASE_GUI_ID:
				if(!PlayerUtils.isHoldingItem(player, mod_SecurityCraft.briefcase))
					return null;
				return new GuiBriefcaseInventory(player, player.inventory);
			case KEY_CHANGER_GUI_ID:
				if(tile_entity == null || !PlayerUtils.isHoldingItem(player, mod_SecurityCraft.universalKeyChanger)) 
					return null;
				return new GuiKeyChanger(player.inventory, tile_entity);
			case CUSTOMIZE_BLOCK:
				return new GuiCustomizeBlock(player.inventory, (CustomizableSCTE) tile_entity);
			case IRC_INFORMATION:
				return new GuiIRCInfo();
			default:
				return null;
		}
	}
}
