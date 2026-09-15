package org.multicoder.create_dense_ores.core;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.create_dense_ores.CDO;

@SuppressWarnings("unused")
public class CDOBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CDO.MODID);

    public static final DeferredBlock<?> DENSE_ZINC_ORE = register("dense_zinc_ore");
    public static final DeferredBlock<?> DEEPSLATE_DENSE_ZINC_ORE = register("deepslate_dense_zinc_ore");
    public static DeferredBlock<?> DENSE_LITHIUM_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_LITHIUM_ORE;
    public static DeferredBlock<?> DENSE_LEAD_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_LEAD_ORE;
    public static DeferredBlock<?> DENSE_NICKEL_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_NICKEL_ORE;
    public static DeferredBlock<?> DENSE_THORIUM_ORE;
    public static DeferredBlock<?> DEEPSLATE_DENSE_THORIUM_ORE;


    public static DeferredBlock<?> register(String name){
        DeferredBlock<?> returnValue = BLOCKS.registerSimpleBlock(name);
        CDOItems.ITEMS.registerSimpleBlockItem(returnValue);
        return returnValue;
    }



    public static void addTFMGBlocks(){
        CDO.LOGGER.info("Create: The Factory Must Grow Found, Adding Dense Ores");
        DENSE_LEAD_ORE = register("dense_lead_ore");
        DENSE_LITHIUM_ORE =  register("dense_lithium_ore");
        DENSE_NICKEL_ORE = register("dense_nickel_ore");
        DEEPSLATE_DENSE_LEAD_ORE = register("deepslate_dense_lead_ore");
        DEEPSLATE_DENSE_LITHIUM_ORE = register("deepslate_dense_lithium_ore");
        DEEPSLATE_DENSE_NICKEL_ORE = register("deepslate_dense_nickel_ore");
    }

    public static void addNewAgeBlocks(){
        CDO.LOGGER.info("Create: New Age, Adding Dense Ores");
        DENSE_THORIUM_ORE = register("dense_thorium_ore");
        DEEPSLATE_DENSE_THORIUM_ORE =  register("deepslate_dense_thorium_ore");
    }
}
