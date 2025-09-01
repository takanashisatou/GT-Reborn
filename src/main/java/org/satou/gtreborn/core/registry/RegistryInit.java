package org.satou.gtreborn.core.registry;

import org.satou.gtreborn.core.registry.MaterialRegistry.MaterialRegistry;
import org.satou.gtreborn.core.registry.OreRegistry.OreRegistry;

public class RegistryInit {
    public static void init() {
        MaterialRegistry.init();
        OreRegistry.init();
    }
}
