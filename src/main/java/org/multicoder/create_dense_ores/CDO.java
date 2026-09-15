package org.multicoder.create_dense_ores;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@SuppressWarnings("all")
@Mod(CDO.MODID)
public class CDO {
    public static final String MODID = "create_dense_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CDO(IEventBus modEventBus, ModContainer modContainer) {

    }
}
