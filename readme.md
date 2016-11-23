


项目 结构说明

parkshop.pmcourse.app   # springboot 的启动类
parkshop.pmcourse.conf   # spring mvc 配置类，拦截器在这里注册
parkshop.pmcourse.controller # spring mvc 控制类
parkshop.pmcourse.domain #bean
parkshop.pmcourse.interceptor  #拦截器类
parkshop.pmcourse.mapping # mybatis dao类
parkshop.pmcourse.service.inter #接口

application.yml 配置 dev 使用 application-dev.yml,如果改成 prod 则使用 application-prod.yml

所有的 xx.vm是 veloctiy模板，需要在application*.yml 中配置才能访问。
