package com.ife.sap.init;

import com.ife.sap.block.vanilla.dirtgroup.*;
import com.ife.sap.block.vanilla.plantgroup.leavesgroup.*;
import net.minecraft.world.level.block.Block;
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
}
