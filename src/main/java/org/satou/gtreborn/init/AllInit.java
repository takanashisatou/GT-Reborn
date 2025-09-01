package org.satou.gtreborn.init;

import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import org.satou.gtreborn.config.Config;
import org.satou.gtreborn.core.registry.RegistryInit;
import org.satou.gtreborn.gtreborn;

import static org.satou.gtreborn.gtreborn.ModContainer;

public class AllInit {
    public static void init() {
        NeoForge.EVENT_BUS.register(gtreborn.GTRebornInstance);
        ModContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        RegistryInit.init();
    }
}
