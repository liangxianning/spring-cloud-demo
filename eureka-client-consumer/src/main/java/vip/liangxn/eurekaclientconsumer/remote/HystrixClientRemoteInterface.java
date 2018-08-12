package vip.liangxn.eurekaclientconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client-provider", configuration = HystrixClientConfigration.class)
public interface HystrixClientRemoteInterface {
    @RequestMapping(value = "/getTeamInfo", method = RequestMethod.GET)
    String getTeamInfo(@RequestParam("teamName") String teamName);
}