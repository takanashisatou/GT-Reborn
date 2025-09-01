package org.satou.gtreborn.core.data.material;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class GTRebornMaterial {

    public GTRebornMaterial() {
        //Do Nothing
    }
    public static GTRebornMaterial CreateGTRebornMaterial(){
        return new GTRebornMaterial();
    }
    public String MaterialName;
    public GTRebornMaterialProperty MaterialProperty;
}
