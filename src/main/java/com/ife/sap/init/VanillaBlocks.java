package com.ife.sap.init;

import com.ife.sap.SapMod;

import com.ife.sap.block.vanilla.GrassBlock;
import com.ife.sap.block.vanilla.Sand;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    public static final RegistryObject<Block> SAND = REGISTRY.register("sand", () -> new Sand());
    public static final RegistryObject<Block> GRASS_BLOCK = REGISTRY.register("grass block", () -> new GrassBlock());
}
