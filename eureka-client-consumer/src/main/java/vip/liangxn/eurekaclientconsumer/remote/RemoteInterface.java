package vip.liangxn.eurekaclientconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("eureka-client-provider")
public interface RemoteInterface {
    /**
     * 获取公司信息
     *
     * @param companyName
     * @return
     */
    @GetMapping(value = "/getCompanyInfoByProvider")
    String getCompanyInfoByProvider(@RequestParam("companyName") String companyName);
}

