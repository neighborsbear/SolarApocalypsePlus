package com.ife.sap.init;

import com.ife.sap.block.vanilla.CoarseDirt;
import com.ife.sap.block.vanilla.Dirt;
import com.ife.sap.block.vanilla.GrassBlock;
import com.ife.sap.block.vanilla.Sand;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    public static final RegistryObject<Block> SAND = REGISTRY.register("sand", () -> new Sand());
    public static final RegistryObject<Block> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new GrassBlock());
    public static final RegistryObject<Block> DIRT = REGISTRY.register("dirt", () -> new Dirt());
    public static final RegistryObject<Block> COARSE_DIRT = REGISTRY.register("coarse_dirt", () -> new CoarseDirt());
}
