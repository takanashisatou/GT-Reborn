package org.satou.gtreborn.core.util.material;

import org.satou.gtreborn.core.data.material.AllGTRebornMaterialData;
import org.satou.gtreborn.core.data.material.GTRebornMaterial;
import org.satou.gtreborn.core.data.material.GTRebornMaterialProperty;

public class AddMaterialUtil {
    public static void registerMaterial(String name, GTRebornMaterialProperty gtRebornMaterialProperty){
        GTRebornMaterial rebornMaterial = GTRebornMaterial.CreateGTRebornMaterial();
        rebornMaterial.MaterialName = name;
        rebornMaterial.MaterialProperty = gtRebornMaterialProperty;
        AllGTRebornMaterialData.getAllGTRebornMaterialDataInstance().AllMaterials.put(name,rebornMaterial);
    }
}
