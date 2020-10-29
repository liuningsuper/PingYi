package com.example.upc.controller;

import com.example.upc.common.CommonReturnType;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.dataobject.SysMaterialData;
import com.example.upc.service.MaterialDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/materialdata")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")

public class MaterialDataController {
    @Autowired
    private MaterialDataService materialDataService;

    @RequestMapping("/getPage")
    @ResponseBody
    public CommonReturnType getPage(PageQuery pageQuery){
        return CommonReturnType.create(materialDataService.getPage(pageQuery));

    }
    @RequestMapping("/insert")
    @ResponseBody
    public CommonReturnType insert(SysMaterialData sysMaterialData){
        materialDataService.insert(sysMaterialData);
        return CommonReturnType.create(null);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public CommonReturnType delete(int mdId) {
        materialDataService.delete(mdId);
        return CommonReturnType.create(null);
    }
    @RequestMapping("/update")
    @ResponseBody
    public CommonReturnType update(SysMaterialData sysMaterialData){
        materialDataService.update(sysMaterialData);
        return CommonReturnType.create(null);
    }
}
