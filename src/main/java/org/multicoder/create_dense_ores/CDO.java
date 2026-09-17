package org.multicoder.create_dense_ores;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.multicoder.create_dense_ores.core.CDOBlocks;
import org.multicoder.create_dense_ores.core.CDOItems;
import org.slf4j.Logger;

@Mod(CDO.MODID)
public class CDO {
    public static final String MODID = "create_dense_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CDO(IEventBus modEventBus, ModContainer ignored) {
        LOGGER.info("Create Dense Ores Initialising");
        CDOBlocks.BLOCKS.register(modEventBus);
        CDOItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::AppendCreativeTab);
        modEventBus.addListener(this::Construct);
        LOGGER.info("Create Dense Ores Initialised");
    }

    public void Construct(FMLConstructModEvent event){
        if(Utility.isModLoaded("tfmg")){
            LOGGER.info("Create: The Factory Must Grow Found, Adding Dense Ores");
            CDOBlocks.loadTFMG();
        }
        if(Utility.isModLoaded("create_new_age")){
            LOGGER.info("Create: New Age Found, Adding Dense Ores");
            CDOBlocks.loadNewAge();
        }
    }


    public void AppendCreativeTab(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(CDOBlocks.DEEPSLATE_DENSE_ZINC_ORE.get());
            event.accept(CDOBlocks.DENSE_ZINC_ORE.get());
            if(Utility.isModLoaded("tfmg")){
                event.accept(CDOBlocks.DEEPSLATE_DENSE_LEAD_ORE.get());
                event.accept(CDOBlocks.DENSE_LEAD_ORE.get());
                event.accept(CDOBlocks.DEEPSLATE_DENSE_LITHIUM_ORE.get());
                event.accept(CDOBlocks.DENSE_LITHIUM_ORE.get());
                event.accept(CDOBlocks.DEEPSLATE_DENSE_NICKEL_ORE.get());
                event.accept(CDOBlocks.DENSE_NICKEL_ORE.get());
            }
            if(Utility.isModLoaded("create_new_age")){
                event.accept(CDOBlocks.DEEPSLATE_DENSE_THORIUM_ORE.get());
                event.accept(CDOBlocks.DENSE_THORIUM_ORE.get());
            }
        }
    }
}
