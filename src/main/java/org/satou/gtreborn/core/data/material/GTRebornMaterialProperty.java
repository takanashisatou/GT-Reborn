package org.satou.gtreborn.core.data.material;

import com.jcraft.jorbis.Block;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.world.item.Item;

@Getter
public class GTRebornMaterialProperty {
    public boolean HasIngot;
    public boolean HasPlate;
    public boolean HasGear;
    public boolean HasDurability;
    public long BaseMaterialDurability;
    public boolean hasStick;
    public boolean HasBolt;
    public boolean HasScrew;
    public boolean HasFoil;
    public boolean hasFluid;
    public boolean hasDust;
    public boolean hasOre;
    public Item PlateItem;
    public Item GearItem;
    public Item StickItem;
    public Item BoltItem;
    public Item ScrewItem;
    public Item FoilItem;
    public Item DustItem;
    public Item RawOreItem;
    public Block OreBlock;
    public GTRebornMaterialProperty() {

    }
    public static GTRebornMaterialProperty CreateMaterialProperty(){
        GTRebornMaterialProperty prop = new GTRebornMaterialProperty();
        return prop;
    }
}
