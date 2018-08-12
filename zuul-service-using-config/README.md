## 使用了配置中心服务的网关应用程序，可以检查权限等

* 注册到eureka中
* 使用zuul路由组件，主要是在application.yml中配置zuul节点
* 使用config配置组件，主要是bootstrap.yml文件配置
* 使用security做简单安全配置
* 使用actuator组件，监控应用程序各方面参数情况，如:
    * 查看所有环境变量 http://localhost:9095/actuator/env
    * 查看各健康指标 http://localhost:9095/actuator/health
* 访问节点服务地址：http://localhost:9095/api/configConsumer/configConsumer/getAuthorInfo，注意地址中加入的api，就是zuul配置的前缀属性

