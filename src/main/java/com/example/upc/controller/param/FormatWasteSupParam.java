package com.example.upc.controller.param;

import com.example.upc.dataobject.FormatWaste;

public class FormatWasteSupParam extends FormatWaste {
    String enterpriseName;
    String areaName;
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }
}
