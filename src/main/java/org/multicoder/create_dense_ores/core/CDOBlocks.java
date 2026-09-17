package org.multicoder.create_dense_ores.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.create_dense_ores.CDO;

@SuppressWarnings("unused")
public class CDOBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CDO.MODID);

    public static final DeferredBlock<?> DENSE_ZINC_ORE = register("dense_zinc_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).requiresCorrectToolForDrops());
    public static final DeferredBlock<?> DEEPSLATE_DENSE_ZINC_ORE = register("deepslate_dense_zinc_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops());
    public static DeferredBlock<?> DENSE_LITHIUM_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_LITHIUM_ORE;
    public static DeferredBlock<?> DENSE_LEAD_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_LEAD_ORE;
    public static DeferredBlock<?> DENSE_NICKEL_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_NICKEL_ORE;
    public static DeferredBlock<?> DENSE_THORIUM_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_THORIUM_ORE;


    public static DeferredBlock<?> register(String name,BlockBehaviour.Properties properties) {
        DeferredBlock<?> returnValue = BLOCKS.registerBlock(name,Block::new, properties);
        CDOItems.ITEMS.registerSimpleBlockItem(returnValue);
        return returnValue;
    }

    public static void loadTFMG() {
        DENSE_LITHIUM_ORE = register("dense_lithium_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().sound(SoundType.STONE));
        DEEPSLATE_DENSE_LITHIUM_ORE = register("deepslate_dense_lithium_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops().sound(SoundType.STONE));
        DENSE_LEAD_ORE = register("dense_lead_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().sound(SoundType.STONE));
        DEEPSLATE_DENSE_LEAD_ORE = register("deepslate_dense_lead_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops().sound(SoundType.STONE));
        DENSE_NICKEL_ORE = register("dense_nickel_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().sound(SoundType.STONE));
        DEEPSLATE_DENSE_NICKEL_ORE = register("deepslate_dense_nickel_ore",BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops().sound(SoundType.STONE));

    }

    public static void loadNewAge() {
        DENSE_THORIUM_ORE = register("dense_thorium_ore",BlockBehaviour.Properties.of().strength(3.5F).requiresCorrectToolForDrops());
        DEEPSLATE_DENSE_THORIUM_ORE = register("deepslate_dense_thorium_ore",BlockBehaviour.Properties.of().strength(3.5F).requiresCorrectToolForDrops());
    }
}
