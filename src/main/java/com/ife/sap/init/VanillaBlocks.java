package com.ife.sap.init;

import com.ife.sap.block.vanilla.dirtgroup.*;
import com.ife.sap.block.vanilla.icegroup.*;
import com.ife.sap.block.vanilla.plantgroup.bushgroup.*;
import com.ife.sap.block.vanilla.plantgroup.leavesgroup.*;
import com.ife.sap.block.vanilla.plantgroup.saplinggroup.*;
import com.ife.sap.block.vanilla.plantgroup.underwatergroup.*;
import com.ife.sap.block.vanilla.plantgroup.underwatergroup.coralgroup.*;
import com.ife.sap.block.vanilla.plantgroup.underwatergroup.waterblocks.*;
import com.ife.sap.block.vanilla.plantgroup.wallgroup.CaveVines;
import com.ife.sap.block.vanilla.plantgroup.wallgroup.CaveVinesPlant;
import com.ife.sap.block.vanilla.plantgroup.wallgroup.GlowLichen;
import com.ife.sap.block.vanilla.plantgroup.wallgroup.Vine;
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
    public static final RegistryObject<Block> MANGROVE_SAPLING = REGISTRY.register("mangrove_propagule", () -> new MangrovePropagule());
    public static final RegistryObject<Block> AZALEA = REGISTRY.register("azalea", () -> new Azalea());
    public static final RegistryObject<Block> FLOWERING_AZALEA = REGISTRY.register("flowering_azalea", () -> new FloweringAzalea());
    //BUSHGROUP
    //UNDERWATER
    public static final RegistryObject<Block> SEAGRASS = REGISTRY.register("seagrass", () -> new Seagrass());
    public static final RegistryObject<Block> TALL_SEAGRASS = REGISTRY.register("tall_seagrass", () -> new TallSeagrass());
    public static final RegistryObject<Block> SEA_PICKLE = REGISTRY.register("sea_pickle", () -> new SeaPickle());
    public static final RegistryObject<Block> KELP = REGISTRY.register("kelp", () -> new Kelp());
    public static final RegistryObject<Block> KELP_PLANT = REGISTRY.register("kelp_plant", () -> new KelpPlant());
    public static final RegistryObject<Block> LILY_PAD = REGISTRY.register("lily_pad", () -> new LilyPad());
    ////CORAL
    public static final RegistryObject<Block> DEAD_TUBE_CORAL = REGISTRY.register("dead_tube_coral", () -> new DeadTubeCoral());
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL = REGISTRY.register("dead_brain_coral", () -> new DeadBrainCoral());
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL = REGISTRY.register("dead_bubble_coral", () -> new DeadBubbleCoral());
    public static final RegistryObject<Block> DEAD_FIRE_CORAL = REGISTRY.register("dead_fire_coral", () -> new DeadFireCoral());
    public static final RegistryObject<Block> DEAD_HORN_CORAL = REGISTRY.register("dead_horn_coral", () -> new DeadHornCoral());
    public static final RegistryObject<Block> TUBE_CORAL = REGISTRY.register("tube_coral", () -> new TubeCoral());
    public static final RegistryObject<Block> BRAIN_CORAL = REGISTRY.register("brain_coral", () -> new BrainCoral());
    public static final RegistryObject<Block> BUBBLE_CORAL = REGISTRY.register("bubble_coral", () -> new BubbleCoral());
    public static final RegistryObject<Block> FIRE_CORAL = REGISTRY.register("fire_coral", () -> new FireCoral());
    public static final RegistryObject<Block> HORN_CORAL = REGISTRY.register("horn_coral", () -> new HornCoral());
    public static final RegistryObject<Block> DEAD_TUBE_CORAL_FAN = REGISTRY.register("dead_tube_coral_fan", () -> new DeadTubeCoralFan());
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_FAN = REGISTRY.register("dead_brain_coral_fan", () -> new DeadBrainCoralFan());
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_FAN = REGISTRY.register("dead_bubble_coral_fan", () -> new DeadBubbleCoralFan());
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_FAN = REGISTRY.register("dead_fire_coral_fan", () -> new DeadFireCoralFan());
    public static final RegistryObject<Block> DEAD_HORN_CORAL_FAN = REGISTRY.register("dead_horn_coral_fan", () -> new DeadHornCoralFan());
    public static final RegistryObject<Block> TUBE_CORAL_FAN = REGISTRY.register("tube_coral_fan", () -> new TubeCoralFan());
    public static final RegistryObject<Block> BRAIN_CORAL_FAN = REGISTRY.register("brain_coral_fan", () -> new BrainCoralFan());
    public static final RegistryObject<Block> BUBBLE_CORAL_FAN = REGISTRY.register("bubble_coral_fan", () -> new BubbleCoralFan());
    public static final RegistryObject<Block> FIRE_CORAL_FAN = REGISTRY.register("fire_coral_fan", () -> new FireCoralFan());
    public static final RegistryObject<Block> HORN_CORAL_FAN = REGISTRY.register("horn_coral_fan", () -> new HornCoralFan());
    public static final RegistryObject<Block> DEAD_TUBE_CORAL_WALL_FAN = REGISTRY.register("dead_tube_coral_wall_fan", () -> new DeadTubeCoralWallFan());
    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_WALL_FAN = REGISTRY.register("dead_brain_coral_wall_fan", () -> new DeadBrainCoralWallFan());
    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_WALL_FAN = REGISTRY.register("dead_bubble_coral_wall_fan", () -> new DeadBubbleCoralWallFan());
    public static final RegistryObject<Block> DEAD_FIRE_CORAL_WALL_FAN = REGISTRY.register("dead_fire_coral_wall_fan", () -> new DeadFireCoralWallFan());
    public static final RegistryObject<Block> DEAD_HORN_CORAL_WALL_FAN = REGISTRY.register("dead_horn_coral_wall_fan", () -> new DeadHornCoralWallFan());
    public static final RegistryObject<Block> TUBE_CORAL_WALL_FAN = REGISTRY.register("tube_coral_wall_fan", () -> new TubeCoralWallFan());
    public static final RegistryObject<Block> BRAIN_CORAL_WALL_FAN = REGISTRY.register("brain_coral_wall_fan", () -> new BrainCoralWallFan());
    public static final RegistryObject<Block> BUBBLE_CORAL_WALL_FAN = REGISTRY.register("bubble_coral_wall_fan", () -> new BubbleCoralWallFan());
    public static final RegistryObject<Block> FIRE_CORAL_WALL_FAN = REGISTRY.register("fire_coral_wall_fan", () -> new FireCoralWallFan());
    public static final RegistryObject<Block> HORN_CORAL_WALL_FAN = REGISTRY.register("horn_coral_wall_fan", () -> new HornCoralWallFan());
    ////WATERBLOCKS
    public static final RegistryObject<Block> DRIED_KELP_BLOCK = REGISTRY.register("dried_kelp_block", () -> new DriedKelpBlock());
    public static final RegistryObject<Block> SPONGE = REGISTRY.register("sponge", () -> new Sponge());
    public static final RegistryObject<Block> WET_SPONGE = REGISTRY.register("wet_sponge", () -> new WetSponge());
    //wall
    public static final RegistryObject<Block> VINE = REGISTRY.register("vine", () -> new Vine());
    public static final RegistryObject<Block> GLOW_LICHEN = REGISTRY.register("glow_lichen", () -> new GlowLichen());
    public static final RegistryObject<Block> CAVE_VINES = REGISTRY.register("cave_vines", () -> new CaveVines());
    public static final RegistryObject<Block> CAVE_VINES_PLANT = REGISTRY.register("cave_vines_plant", () -> new CaveVinesPlant());

}
