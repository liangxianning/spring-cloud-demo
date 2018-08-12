package vip.liangxn.eurekaclientconsumer.remote;

public class HystrixClientConfigration implements HystrixClientRemoteInterface {
    @Override
    public String getTeamInfo(String teamName) {
        return "获取" + teamName + "失败。";
    }
}