package org.multicoder.create_dense_ores;

import com.mojang.logging.LogUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.multicoder.create_dense_ores.core.CDOBlocks;
import org.multicoder.create_dense_ores.core.CDOItems;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
@Mod(CDO.MODID)
public class CDO {
    public static final String MODID = "create_dense_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CDO(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Create Dense Ores Initialising");
        modEventBus.addListener(this::Construct);
        CDOBlocks.BLOCKS.register(modEventBus);
        CDOItems.ITEMS.register(modEventBus);
        LOGGER.info("Create Dense Ores Initialised");
    }

    public void Construct(FMLConstructModEvent event){
        if(Utility.isModLoaded("tfmg")){
            CDOBlocks.addTFMGBlocks();
        }
        if(Utility.isModLoaded("create_new_age")){
            CDOBlocks.addNewAgeBlocks();
        }
    }


    public void generateData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();


    }

}
