package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

class HGuideline extends Guideline {
    public HGuideline(String name) {
        super(name);
        this.type = new Helper.HelperType((String) typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
    }

    public HGuideline(String name, String config) {
        super(name);
        this.config = config;
        this.type = new Helper.HelperType((String) typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }
}
