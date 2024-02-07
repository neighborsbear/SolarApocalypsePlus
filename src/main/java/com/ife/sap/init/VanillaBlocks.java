package com.ife.sap.init;

import com.ife.sap.block.vanilla.icegroup.FlowingWater;
import com.ife.sap.block.vanilla.icegroup.Water;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    //DIRT
    //ICE
    public static final RegistryObject<Block> WATER = REGISTRY.register("water", () -> new Water());
    public static final RegistryObject<Block> FLOWING_WATER = REGISTRY.register("flowing_water", () -> new FlowingWater());
    //LEAVES
    //SAPLING
    //BUSHGROUP
    //UNDERWATER
    ////CORAL
    ////WATERBLOCKS
    //wall

}
