package vip.liangxn.eurekaclientprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyProviderController {  
    @GetMapping(value = "/getCompanyInfoByProvider")
    public String getCompanyInfoByProvider(@RequestParam("companyName") String companyName){
        // 这里是要和数据库交互， 这里为了操作简单直接返回一个数据。  
        return "provider 查询" + companyName + "公司信息";  
    }  
     
    @GetMapping(value = "/getTeamInfo")
    public String getTeamInfo(@RequestParam("teamName") String teamName){  
        // 返回团队信息。  
        return "provider 查询" + teamName + "团队信息";  
    }  
}