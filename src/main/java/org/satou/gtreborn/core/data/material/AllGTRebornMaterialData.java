package org.satou.gtreborn.core.data.material;


import java.util.HashMap;
import java.util.Map;

public class AllGTRebornMaterialData {
    private static AllGTRebornMaterialData AllGTRebornMaterialDataInstance = null;
    public static void init() {
        if (AllGTRebornMaterialData.AllGTRebornMaterialDataInstance == null) {
            AllGTRebornMaterialData.AllGTRebornMaterialDataInstance = new AllGTRebornMaterialData();
        }
    }
    public AllGTRebornMaterialData(){
    }

    public static AllGTRebornMaterialData getAllGTRebornMaterialDataInstance() {
        if(AllGTRebornMaterialData.AllGTRebornMaterialDataInstance == null){
            AllGTRebornMaterialDataInstance = new AllGTRebornMaterialData();
        }
        return AllGTRebornMaterialDataInstance;
    }

    public Map<String,GTRebornMaterial> AllMaterials = new HashMap<String,GTRebornMaterial>();

}
