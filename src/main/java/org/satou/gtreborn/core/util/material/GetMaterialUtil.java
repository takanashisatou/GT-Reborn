package org.satou.gtreborn.core.util.material;

import org.satou.gtreborn.core.data.material.AllGTRebornMaterialData;
import org.satou.gtreborn.core.data.material.GTRebornMaterial;

public class GetMaterialUtil {
    public static GTRebornMaterial getMaterial(String materialName) {
        return AllGTRebornMaterialData.getAllGTRebornMaterialDataInstance().AllMaterials.get(materialName);
    }
}
