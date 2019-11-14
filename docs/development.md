
### 项目目录结构

```
├── auth                           --授权认证子项目
│   ├── authentication-server        --认证组件服务端 
│   ├── authentication-client        --认证组件客户端 
│   └── authorization-server         --授权组件服务端
├── center               --中心子项目
│   └── bus                --消息中心
├── common               --通用子项目
│   ├── core               --核心类库
│   ├── test               --测试工具类库
│   └── web                --WEB核心类库         
├── gateway              --网关子项目  
│   ├── gateway-web        --基于springcloud gateway的网关
│   └── gateway-admin      --springcloud gateway的网关管理模块
├── sysadmin             --后台子项目
│   ├── db                 --系统管理子项目数据库脚本
│   └── organization       --组织管理应用，包括用户、角色、资源、菜单、组织架构的管理
├── monitor              --监控、日志及服务管理子项目
│   ├── admin              --springboot admin管理
│   ├── hystrix-dashboard  --hystrix监控
│   └── turbine            --turbine监控聚集 
├── webapps              --前台子项目，web项目的基础父工程，定义常用依赖等
├── docs                 --文档及资源文件
├── data                 --server及服务数据存储目录
│   ├── mysql              --mysql数据库文件存储目录 
│   ├── rabbitmq           --rabbitmq数据文件存储目录
│   └── redis              --redis数据文件存储目录
├── docker-compose       --基础服务docker快速启动方案
│   ├── .env                          --docker-compose环境变量配置文件
│   └── docker-compose.yml            --docker compose配置文件 
└── pom.xml 
```
