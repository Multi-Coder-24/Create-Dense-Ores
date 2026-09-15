package org.multicoder.create_dense_ores;

import net.neoforged.fml.ModList;

public class Utility {
    public static boolean isModLoaded(String modId){
        return ModList.get().isLoaded(modId);
    }
}
