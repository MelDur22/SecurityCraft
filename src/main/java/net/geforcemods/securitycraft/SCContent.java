package net.geforcemods.securitycraft;

import net.geforcemods.securitycraft.api.OwnableTileEntity;
import net.geforcemods.securitycraft.api.SecurityCraftTileEntity;
import net.geforcemods.securitycraft.containers.*;
import net.geforcemods.securitycraft.entity.*;
import net.geforcemods.securitycraft.items.ModuleItem;
import net.geforcemods.securitycraft.tileentity.*;
import net.geforcemods.securitycraft.util.HasManualPage;
import net.geforcemods.securitycraft.util.OwnableTE;
import net.geforcemods.securitycraft.util.RegisterItemBlock;
import net.geforcemods.securitycraft.util.RegisterItemBlock.SCItemGroup;
import net.geforcemods.securitycraft.util.Reinforced;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandlerType;

public class SCContent { // TODO: Everything


    //fluids
    public static FlowableFluid FLOWING_FAKE_WATER;
    public static FlowableFluid FAKE_WATER;
    public static FlowableFluid FLOWING_FAKE_LAVA;
    public static FlowableFluid FAKE_LAVA;

    //blocks
    @HasManualPage @RegisterItemBlock public static Block ALARM;
    @HasManualPage(designedBy="Henzoid") @RegisterItemBlock public static Block BLOCK_POCKET_MANAGER;
    @HasManualPage @RegisterItemBlock(SCItemGroup.DECORATION) public static Block BLOCK_POCKET_WALL;
    @HasManualPage @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block BOUNCING_BETTY;
    @HasManualPage @RegisterItemBlock public static Block CAGE_TRAP;
    @HasManualPage @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block CLAYMORE;
    @HasManualPage @OwnableTE @RegisterItemBlock public static Block FRAME;
    @HasManualPage @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block IMS;
    @HasManualPage @RegisterItemBlock public static Block INVENTORY_SCANNER;
    public static Block INVENTORY_SCANNER_FIELD;
    @HasManualPage @RegisterItemBlock(SCItemGroup.DECORATION) public static Block IRON_FENCE;
    @HasManualPage @RegisterItemBlock public static Block KEYCARD_READER;
    @HasManualPage @RegisterItemBlock public static Block KEYPAD;
    @HasManualPage public static Block KEYPAD_CHEST;
    @HasManualPage @RegisterItemBlock public static Block KEYPAD_FURNACE;
    @HasManualPage @RegisterItemBlock public static Block LASER_BLOCK;
    public static Block LASER_FIELD;
    @HasManualPage @RegisterItemBlock public static Block MOTION_ACTIVATED_LIGHT;
    @HasManualPage @OwnableTE @RegisterItemBlock public static Block PANIC_BUTTON;
    @HasManualPage @RegisterItemBlock public static Block PORTABLE_RADAR;
    @HasManualPage @OwnableTE @RegisterItemBlock public static Block PROJECTOR;
    @HasManualPage @RegisterItemBlock public static Block PROTECTO;
    @OwnableTE public static Block REINFORCED_DOOR;
    @HasManualPage @RegisterItemBlock public static Block RETINAL_SCANNER;
    public static Block SCANNER_DOOR;
    public static Block SECRET_OAK_SIGN;
    public static Block SECRET_OAK_WALL_SIGN;
    public static Block SECRET_SPRUCE_SIGN;
    public static Block SECRET_SPRUCE_WALL_SIGN;
    public static Block SECRET_BIRCH_SIGN;
    public static Block SECRET_BIRCH_WALL_SIGN;
    public static Block SECRET_JUNGLE_SIGN;
    public static Block SECRET_JUNGLE_WALL_SIGN;
    public static Block SECRET_ACACIA_SIGN;
    public static Block SECRET_ACACIA_WALL_SIGN;
    public static Block SECRET_DARK_OAK_SIGN;
    public static Block SECRET_DARK_OAK_WALL_SIGN;
    public static Block SECRET_CRIMSON_SIGN;
    public static Block SECRET_CRIMSON_WALL_SIGN;
    public static Block SECRET_WARPED_SIGN;
    public static Block SECRET_WARPED_WALL_SIGN;
    @HasManualPage @RegisterItemBlock public static Block SECURITY_CAMERA;
    @OwnableTE @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block TRACK_MINE;
    @HasManualPage @OwnableTE @RegisterItemBlock(SCItemGroup.TECHNICAL) public static Block TROPHY_SYSTEM;
    @HasManualPage @RegisterItemBlock public static Block USERNAME_LOGGER;
    @HasManualPage @OwnableTE @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block MINE;
    public static Block FAKE_WATER_BLOCK;
    public static Block FAKE_LAVA_BLOCK;

    //block mines
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block STONE_MINE;
    @HasManualPage @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block DIRT_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block COBBLESTONE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block SAND_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block GRAVEL_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block GOLD_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block IRON_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block COAL_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block NETHER_GOLD_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block LAPIS_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block DIAMOND_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block REDSTONE_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block EMERALD_ORE_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block QUARTZ_ORE_MINE;
    public static Block ACIENT_DEBRIS_MINE;
    @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block GILDED_BLACKSTONE_MINE;
    @HasManualPage @OwnableTE @RegisterItemBlock(SCItemGroup.EXPLOSIVES) public static Block FURNACE_MINE;

    //reinforced blocks (ordered by vanilla building blocks creative tab order)
    //ordered by vanilla decoration blocks creative tab order
    @OwnableTE @Reinforced(hasTint = false) public static Block REINFORCED_IRON_BARS;
    //ordered by vanilla redstone tab order
    @HasManualPage @Reinforced public static Block REINFORCED_LEVER;
    @HasManualPage @Reinforced public static Block REINFORCED_STONE_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_OAK_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_SPRUCE_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_BIRCH_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_JUNGLE_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_ACACIA_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_DARK_OAK_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_CRIMSON_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_WARPED_PRESSURE_PLATE;
    @Reinforced public static Block REINFORCED_POLISHED_BLACKSTONE_PRESSURE_PLATE;
    @HasManualPage @Reinforced public static Block REINFORCED_STONE_BUTTON;
    @Reinforced public static Block REINFORCED_OAK_BUTTON;
    @Reinforced public static Block REINFORCED_SPRUCE_BUTTON;
    @Reinforced public static Block REINFORCED_BIRCH_BUTTON;
    @Reinforced public static Block REINFORCED_JUNGLE_BUTTON;
    @Reinforced public static Block REINFORCED_ACACIA_BUTTON;
    @Reinforced public static Block REINFORCED_DARK_OAK_BUTTON;
    @Reinforced public static Block REINFORCED_CRIMSON_BUTTON;
    @Reinforced public static Block REINFORCED_WARPED_BUTTON;
    @Reinforced public static Block REINFORCED_POLISHED_BLACKSTONE_BUTTON;
    @HasManualPage @Reinforced public static Block REINFORCED_HOPPER;

    //misc
    @Reinforced(tint=0x0E7063) public static Block REINFORCED_CHISELED_CRYSTAL_QUARTZ;
    @Reinforced(tint=0x0E7063) public static Block REINFORCED_CRYSTAL_QUARTZ;
    @Reinforced(tint=0x0E7063) public static Block REINFORCED_CRYSTAL_QUARTZ_PILLAR;
    @OwnableTE public static Block HORIZONTAL_REINFORCED_IRON_BARS;

    //items
    @HasManualPage public static Item ADMIN_TOOL;
    public static Item ACIENT_DEBRIS_MINE_ITEM;
    @HasManualPage public static Item BRIEFCASE;
    @HasManualPage public static Item CAMERA_MONITOR;
    @HasManualPage public static Item CODEBREAKER;
    @HasManualPage public static Item FAKE_LAVA_BUCKET;
    @HasManualPage public static Item FAKE_WATER_BUCKET;
    @HasManualPage public static Item KEYCARD_LVL_1;
    @HasManualPage public static Item KEYCARD_LVL_2;
    @HasManualPage public static Item KEYCARD_LVL_3;
    @HasManualPage public static Item KEYCARD_LVL_4;
    @HasManualPage public static Item KEYCARD_LVL_5;
    @HasManualPage public static Item KEY_PANEL;
    public static Item KEYPAD_CHEST_ITEM;
    @HasManualPage public static Item LIMITED_USE_KEYCARD;
    @HasManualPage public static Item REINFORCED_DOOR_ITEM;
    @HasManualPage public static Item REMOTE_ACCESS_MINE;
    @HasManualPage public static Item REMOTE_ACCESS_SENTRY;
    @HasManualPage public static Item SCANNER_DOOR_ITEM;
    @HasManualPage public static Item SC_MANUAL;
    @HasManualPage public static Item SECRET_OAK_SIGN_ITEM;
    public static Item SECRET_SPRUCE_SIGN_ITEM;
    public static Item SECRET_BIRCH_SIGN_ITEM;
    public static Item SECRET_JUNGLE_SIGN_ITEM;
    public static Item SECRET_ACACIA_SIGN_ITEM;
    public static Item SECRET_DARK_OAK_SIGN_ITEM;
    public static Item SECRET_CRIMSON_SIGN_ITEM;
    public static Item SECRET_WARPED_SIGN_ITEM;
    @HasManualPage(designedBy="Henzoid") public static Item SENTRY;
    @HasManualPage public static Item TASER;
    public static Item TASER_POWERED;
    @HasManualPage public static Item UNIVERSAL_BLOCK_MODIFIER;
    @HasManualPage public static Item UNIVERSAL_BLOCK_REINFORCER_LVL_1;
    @HasManualPage public static Item UNIVERSAL_BLOCK_REINFORCER_LVL_2;
    @HasManualPage public static Item UNIVERSAL_BLOCK_REINFORCER_LVL_3;
    @HasManualPage public static Item UNIVERSAL_BLOCK_REMOVER;
    @HasManualPage public static Item UNIVERSAL_KEY_CHANGER;
    @HasManualPage public static Item UNIVERSAL_OWNER_CHANGER;
    @HasManualPage public static Item WIRE_CUTTERS;

    //modules
    @HasManualPage public static ModuleItem BLACKLIST_MODULE;
    @HasManualPage public static ModuleItem DISGUISE_MODULE;
    @HasManualPage public static ModuleItem HARMING_MODULE;
    @HasManualPage public static ModuleItem REDSTONE_MODULE;
    @HasManualPage public static ModuleItem SMART_MODULE;
    @HasManualPage public static ModuleItem STORAGE_MODULE;
    @HasManualPage public static ModuleItem WHITELIST_MODULE;

    //tile entity types
    public static BlockEntityType<OwnableTileEntity> teTypeOwnable;
    public static BlockEntityType<SecurityCraftTileEntity> teTypeAbstract;
    public static BlockEntityType<KeypadTileEntity> teTypeKeypad;
    public static BlockEntityType<LaserBlockTileEntity> teTypeLaserBlock;
    public static BlockEntityType<CageTrapTileEntity> teTypeCageTrap;
    public static BlockEntityType<KeycardReaderTileEntity> teTypeKeycardReader;
    public static BlockEntityType<InventoryScannerTileEntity> teTypeInventoryScanner;
    public static BlockEntityType<PortableRadarTileEntity> teTypePortableRadar;
    public static BlockEntityType<SecurityCameraTileEntity> teTypeSecurityCamera;
    public static BlockEntityType<UsernameLoggerTileEntity> teTypeUsernameLogger;
    public static BlockEntityType<RetinalScannerTileEntity> teTypeRetinalScanner;
    public static BlockEntityType<KeypadChestTileEntity> teTypeKeypadChest;
    public static BlockEntityType<AlarmTileEntity> teTypeAlarm;
    public static BlockEntityType<ClaymoreTileEntity> teTypeClaymore;
    public static BlockEntityType<KeypadFurnaceTileEntity> teTypeKeypadFurnace;
    public static BlockEntityType<IMSTileEntity> teTypeIms;
    public static BlockEntityType<ProtectoTileEntity> teTypeProtecto;
    public static BlockEntityType<ScannerDoorTileEntity> teTypeScannerDoor;
    public static BlockEntityType<SecretSignTileEntity> teTypeSecretSign;
    public static BlockEntityType<MotionActivatedLightTileEntity> teTypeMotionLight;
    public static BlockEntityType<TrackMineTileEntity> teTypeTrackMine;
    public static BlockEntityType<TrophySystemTileEntity> teTypeTrophySystem;
    public static BlockEntityType<BlockPocketManagerTileEntity> teTypeBlockPocketManager;
    public static BlockEntityType<BlockPocketTileEntity> teTypeBlockPocket;
    public static BlockEntityType<WhitelistOnlyTileEntity> teTypeWhitelistOnly;
    public static BlockEntityType<ReinforcedHopperTileEntity> teTypeReinforcedHopper;
    public static BlockEntityType<ProjectorTileEntity> teTypeProjector;

    //entity types
    public static EntityType<BouncingBettyEntity> eTypeBouncingBetty;
    public static EntityType<IMSBombEntity> eTypeImsBomb;
    public static EntityType<SecurityCameraEntity> eTypeSecurityCamera;
    public static EntityType<SentryEntity> eTypeSentry;
    public static EntityType<BulletEntity> eTypeBullet;

    //container types
    public static ScreenHandlerType<BlockReinforcerContainer> cTypeBlockReinforcer;
    public static ScreenHandlerType<GenericContainer> cTypeBriefcase;
    public static ScreenHandlerType<BriefcaseContainer> cTypeBriefcaseInventory;
    public static ScreenHandlerType<GenericContainer> cTypeBriefcaseSetup;
    public static ScreenHandlerType<CustomizeBlockContainer> cTypeCustomizeBlock;
    public static ScreenHandlerType<InventoryScannerContainer> cTypeInventoryScanner;
    public static ScreenHandlerType<KeypadFurnaceContainer> cTypeKeypadFurnace;
    public static ScreenHandlerType<ProjectorContainer> cTypeProjector;
    public static ScreenHandlerType<GenericTEContainer> cTypeCheckPassword;
    public static ScreenHandlerType<GenericTEContainer> cTypeSetPassword;
    public static ScreenHandlerType<GenericTEContainer> cTypeUsernameLogger;
    public static ScreenHandlerType<GenericTEContainer> cTypeIMS;
    public static ScreenHandlerType<GenericTEContainer> cTypeKeycardSetup;
    public static ScreenHandlerType<GenericTEContainer> cTypeKeyChanger;
    public static ScreenHandlerType<GenericTEContainer> cTypeBlockPocketManager;
}
