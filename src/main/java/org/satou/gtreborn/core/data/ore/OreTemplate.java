package org.satou.gtreborn.core.data.ore;

import net.minecraft.resources.ResourceLocation;

public class OreTemplate {

    private final String OreName;
    private final ResourceLocation OreBlockTexture;
    private final ResourceLocation RawOreTexture;

    OreTemplate(String OreName, ResourceLocation oreBlockTexture,ResourceLocation rawOreTexture) {
        this.OreName = OreName;
        this.OreBlockTexture = oreBlockTexture;
        this.RawOreTexture = rawOreTexture;
    }

    public String getOreName() { return OreName; }
    public ResourceLocation getOreBlockTexture() { return OreBlockTexture; }
    public ResourceLocation getRawOreTexture() { return RawOreTexture; }
}
