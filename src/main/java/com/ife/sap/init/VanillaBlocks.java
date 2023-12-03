package com.ife.sap.init;

import com.ife.sap.block.vanilla.dirtgroup.*;
import com.ife.sap.block.vanilla.icegroup.*;
import com.ife.sap.block.vanilla.plantgroup.bushgroup.*;
import com.ife.sap.block.vanilla.plantgroup.leavesgroup.*;
import com.ife.sap.block.vanilla.plantgroup.saplinggroup.*;
import com.ife.sap.block.vanilla.plantgroup.underwatergroup.*;
import com.ife.sap.block.vanilla.plantgroup.underwatergroup.coralgroup.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.grower.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    //DIRT
    public static final RegistryObject<Block> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new GrassBlock());
    public static final RegistryObject<Block> PODZOL = REGISTRY.register("podzol", () -> new Podzol());
    public static final RegistryObject<Block> MYCELIUM = REGISTRY.register("mycelium", () -> new Mycelium());
    public static final RegistryObject<Block> ROOTED_DIRT = REGISTRY.register("rooted_dirt", () -> new RootedDirt());
    public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new Mud());
    public static final RegistryObject<Block> DIRT = REGISTRY.register("dirt", () -> new Dirt());
    public static final RegistryObject<Block> DIRT_PATH = REGISTRY.register("dirt_path", () -> new DirtPath());
    public static final RegistryObject<Block> FARMLAND = REGISTRY.register("farmland", () -> new Farmland());
    public static final RegistryObject<Block> COARSE_DIRT = REGISTRY.register("coarse_dirt", () -> new CoarseDirt());
    public static final RegistryObject<Block> SAND = REGISTRY.register("sand", () -> new Sand());
    public static final RegistryObject<Block> RED_SAND = REGISTRY.register("red_sand", () -> new RedSand());
    //ICE
    public static final RegistryObject<Block> ICE = REGISTRY.register("ice", () -> new Ice());
    public static final RegistryObject<Block> FROSTED_ICE = REGISTRY.register("frosted_ice", () -> new FrostedIce());
    public static final RegistryObject<Block> PACKED_ICE = REGISTRY.register("packed_ice", () -> new PackedIce());
    public static final RegistryObject<Block> BLUE_ICE = REGISTRY.register("blue_ice", () -> new BlueIce());
    public static final RegistryObject<Block> SNOW = REGISTRY.register("snow", () -> new Snow());
    public static final RegistryObject<Block> SNOW_BLOCK = REGISTRY.register("snow_block", () -> new SnowBlock());
    public static final RegistryObject<Block> POWDER_SNOW = REGISTRY.register("powder_snow", () -> new PowderSnow());
    //public static final Block WATER = register("water", () -> new Water(Fluids.WATER, BlockBehaviour.Properties.of().mapColor(MapColor.WATER).replaceable().noCollission().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY)));
    public static final RegistryObject<Block> WATER = REGISTRY.register("water", () -> new Water());
    public static final RegistryObject<Block> FLOWING_WATER = REGISTRY.register("flowing_water", () -> new FlowingWater());
    public static final RegistryObject<Block> BUBBLE_COLUMN = REGISTRY.register("bubble_column", () -> new BubbleColumn());
    //LEAVES
    public static final RegistryObject<Block> ACACIA_LEAVES = REGISTRY.register("acacia_leaves", () -> new AcaciaLeaves());
    public static final RegistryObject<Block> AZALEA_LEAVES = REGISTRY.register("azalea_leaves", () -> new AzaleaLeaves());
    public static final RegistryObject<Block> BIRCH_LEAVES = REGISTRY.register("birch_leaves", () -> new BirchLeaves());
    public static final RegistryObject<Block> CHERRY_LEAVES = REGISTRY.register("cherry_leaves", () -> new CherryLeaves());
    public static final RegistryObject<Block> DARK_OAK_LEAVES = REGISTRY.register("dark_oak_leaves", () -> new DarkOakLeaves());
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES = REGISTRY.register("flowering_azalea_leaves", () -> new FloweringAzaleaLeaves());
    public static final RegistryObject<Block> JUNGLE_LEAVES = REGISTRY.register("jungle_leaves", () -> new JungleLeaves());
    public static final RegistryObject<Block> MANGROVE_LEAVES = REGISTRY.register("mangrove_leaves", () -> new MangroveLeaves());
    public static final RegistryObject<Block> OAK_LEAVES = REGISTRY.register("oak_leaves", () -> new OakLeaves());
    public static final RegistryObject<Block> SPRUCE_LEAVES = REGISTRY.register("spruce_leaves", () -> new SpruceLeaves());
    //SAPLING
    public static final RegistryObject<Block> ACACIA_SAPLING = REGISTRY.register("acacia_sapling", () -> new AcaciaSapling(new AcaciaTreeGrower()));
    public static final RegistryObject<Block> BIRCH_SAPLING = REGISTRY.register("birch_sapling", () -> new BirchSapling(new BirchTreeGrower()));
    public static final RegistryObject<Block> CHERRY_SAPLING = REGISTRY.register("cherry_sapling", () -> new CherrySapling(new CherryTreeGrower()));
    public static final RegistryObject<Block> DARK_OAK_SAPLING = REGISTRY.register("dark_oak_sapling", () -> new DarkOakSapling(new DarkOakTreeGrower()));
    public static final RegistryObject<Block> JUNGLE_SAPLING = REGISTRY.register("jungle_sapling", () -> new JungleSapling(new JungleTreeGrower()));
    public static final RegistryObject<Block> MANGROVE_SAPLING = REGISTRY.register("mangrove_propagule", () -> new MangrovePropagule());
    public static final RegistryObject<Block> OAK_SAPLING = REGISTRY.register("oak_sapling", () -> new OakSapling(new OakTreeGrower()));
    public static final RegistryObject<Block> SPRUCE_SAPLING = REGISTRY.register("spruce_sapling", () -> new SpruceSapling(new SpruceTreeGrower()));
    public static final RegistryObject<Block> AZALEA = REGISTRY.register("azalea", () -> new Azalea());
    public static final RegistryObject<Block> FLOWERING_AZALEA = REGISTRY.register("flowering_azalea", () -> new FloweringAzalea());
    public static final RegistryObject<Block> BAMBOO_SAPLING = REGISTRY.register("bamboo_sapling", () -> new BambooSapling());
    //BUSHGROUP
    public static final RegistryObject<Block> DEAD_BUSH = REGISTRY.register("dead_bush", () -> new DeadBush());
    public static final RegistryObject<Block> BROWN_MUSHROOM = REGISTRY.register("brown_mushroom", () -> new BrownMushroom());
    public static final RegistryObject<Block> RED_MUSHROOM = REGISTRY.register("red_mushroom", () -> new RedMushroom());
    public static final RegistryObject<Block> Grass = REGISTRY.register("grass", () -> new Grass());
    public static final RegistryObject<Block> TALL_Grass = REGISTRY.register("tall_grass", () -> new TallGrass());
    public static final RegistryObject<Block> FERN = REGISTRY.register("fern", () -> new Fern());
    public static final RegistryObject<Block> LARGE_FERN = REGISTRY.register("large_fern", () -> new LargeFern());
    public static final RegistryObject<Block> SUGAR_CANE = REGISTRY.register("sugar_cane", () -> new SugarCane());
    //UNDERWATER
    public static final RegistryObject<Block> SEAGRASS = REGISTRY.register("seagrass", () -> new Seagrass());
    public static final RegistryObject<Block> TALL_SEAGRASS = REGISTRY.register("tall_seagrass", () -> new TallSeagrass());
    public static final RegistryObject<Block> SEA_PICKLE = REGISTRY.register("sea_pickle", () -> new SeaPickle());
    public static final RegistryObject<Block> KELP = REGISTRY.register("kelp", () -> new Kelp());
    public static final RegistryObject<Block> KELP_PLANT = REGISTRY.register("kelp_plant", () -> new KelpPlant());
    //CORAL
    public static final RegistryObject<Block> BRAIN_CORAL = REGISTRY.register("brain_coral", () -> new BrainCoral());
    public static final RegistryObject<Block> BUBBLE_CORAL = REGISTRY.register("bubble_coral", () -> new BubbleCoral());
    public static final RegistryObject<Block> FIRE_CORAL = REGISTRY.register("fire_coral", () -> new FireCoral());
    public static final RegistryObject<Block> HORN_CORAL = REGISTRY.register("horn_coral", () -> new HornCoral());
    public static final RegistryObject<Block> TUBE_CORAL = REGISTRY.register("tube_coral", () -> new TubeCoral());
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL = REGISTRY.register("dead_brain_coral", () -> new DeadBrainCoral());
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL = REGISTRY.register("dead_bubble_coral", () -> new DeadBubbleCoral());
    public static final RegistryObject<Block> DEAD_FIRE_CORAL = REGISTRY.register("dead_fire_coral", () -> new DeadFireCoral());
    public static final RegistryObject<Block> DEAD_HORN_CORAL = REGISTRY.register("dead_horn_coral", () -> new DeadHornCoral());
    public static final RegistryObject<Block> DEAD_TUBE_CORAL = REGISTRY.register("dead_tube_coral", () -> new DeadTubeCoral());
    public static final RegistryObject<Block> BRAIN_CORAL_FAN = REGISTRY.register("brain_coral_fan", () -> new BrainCoralFan());
    public static final RegistryObject<Block> BUBBLE_CORAL_FAN = REGISTRY.register("bubble_coral_fan", () -> new BubbleCoralFan());
    public static final RegistryObject<Block> FIRE_CORAL_FAN = REGISTRY.register("fire_coral_fan", () -> new FireCoralFan());
    public static final RegistryObject<Block> HORN_CORAL_FAN = REGISTRY.register("horn_coral_fan", () -> new HornCoralFan());
    public static final RegistryObject<Block> TUBE_CORAL_FAN = REGISTRY.register("tube_coral_fan", () -> new TubeCoralFan());
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_FAN = REGISTRY.register("dead_brain_coral_fan", () -> new DeadBrainCoralFan());
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_FAN = REGISTRY.register("dead_bubble_coral_fan", () -> new DeadBubbleCoralFan());
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_FAN = REGISTRY.register("dead_fire_coral_fan", () -> new DeadFireCoralFan());
    public static final RegistryObject<Block> DEAD_HORN_CORAL_FAN = REGISTRY.register("dead_horn_coral_fan", () -> new DeadHornCoralFan());
    public static final RegistryObject<Block> DEAD_TUBE_CORAL_FAN = REGISTRY.register("dead_tube_coral_fan", () -> new DeadTubeCoralFan());
    public static final RegistryObject<Block> BRAIN_CORAL_WALL_FAN = REGISTRY.register("brain_coral_wall_fan", () -> new BrainCoralWallFan());
    public static final RegistryObject<Block> BUBBLE_CORAL_WALL_FAN = REGISTRY.register("bubble_coral_wall_fan", () -> new BubbleCoralWallFan());
    public static final RegistryObject<Block> FIRE_CORAL_WALL_FAN = REGISTRY.register("fire_coral_wall_fan", () -> new FireCoralWallFan());
    public static final RegistryObject<Block> HORN_CORAL_WALL_FAN = REGISTRY.register("horn_coral_wall_fan", () -> new HornCoralWallFan());
    public static final RegistryObject<Block> TUBE_CORAL_WALL_FAN = REGISTRY.register("tube_coral_wall_fan", () -> new TubeCoralWallFan());
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_WALL_FAN = REGISTRY.register("dead_brain_coral_wall_fan", () -> new DeadBrainCoralWallFan());
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_WALL_FAN = REGISTRY.register("dead_bubble_coral_wall_fan", () -> new DeadBubbleCoralWallFan());
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_WALL_FAN = REGISTRY.register("dead_fire_coral_wall_fan", () -> new DeadFireCoralWallFan());
    public static final RegistryObject<Block> DEAD_HORN_CORAL_WALL_FAN = REGISTRY.register("dead_horn_coral_wall_fan", () -> new DeadHornCoralWallFan());
    public static final RegistryObject<Block> DEAD_TUBE_CORAL_WALL_FAN = REGISTRY.register("dead_tube_coral_wall_fan", () -> new DeadTubeCoralWallFan());
}
