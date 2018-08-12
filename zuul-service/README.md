##网关应用程序，可以检查权限等

* 注册到eureka中
* 使用zuul路由组件，主要是在application.yml中配置zuul节点
* 访问节点服务地址：http://localhost:9094/api/configConsumer/configConsumer/getAuthorInfo，注意地址中加入的api，就是zuul配置的前缀属性

