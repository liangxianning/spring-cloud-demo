package vip.liangxn.eurekaclientconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.liangxn.eurekaclientconsumer.remote.HystrixClientRemoteInterface;
import vip.liangxn.eurekaclientconsumer.remote.RemoteInterface;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    private RemoteInterface remoteInterface;
    @Autowired
    private HystrixClientRemoteInterface hystrixClientRemoteInterface;

    /**
     * 容错方法在接口实现类中吗，推荐这种
     *
     * @param teamName
     * @return
     */
    @GetMapping(value = "/teamInfo")
    public String getTeamInfo(String teamName) {
        return hystrixClientRemoteInterface.getTeamInfo(teamName);
    }

    /**
     * 错方法在本类中实现， 使用HystrixCommand命令
     * @param companyName
     * @return
     */
    @HystrixCommand(fallbackMethod = "getCompanyInfoFallback")
    @GetMapping(value = "/companyInfo")
    public String getCompanyInfo(String companyName) {
        return remoteInterface.getCompanyInfoByProvider(companyName);
    }

    /**
     * 主要注意的是： 容错的方法， 参数要与请求的一致。
     * 容错返回的方法
     *
     * @return
     */
    public String getCompanyInfoFallback(String companyName) {
        return "this is fallBack, company name is " + companyName;
    }
}