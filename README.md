# 智能聊天机器人 

<div align="center">
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/blob/master/LICENSE">
    <img src="https://img.shields.io/badge/license-MIT-blue" alt="License">
  </a>
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/stargazers">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/star.svg?theme=dark" alt="Stars">
  </a>
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/members">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/fork.svg?theme=dark" alt="Forks">
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img src="https://img.shields.io/badge/spring%20boot-3.2.x-brightgreen" alt="Spring Boot">
  </a>
  
</div>

> 一个智能聊天AI工具，支持问答、历史会话查看等多种功能。采用前后端分离架构，基于SpringBoot AI和Deepseek构建，提供流畅的解答体验的功能体系。

## 功能特性

### 核心功能
    支持了deepseek等多个接口，实现聊天解答的功能。

### 技术亮点
- **前后端分离**: Vue.js + Spring Boot全栈解决方案
- **实时通信**: WebSocket协议确保低延迟游戏体验
- **数据安全**: JWT认证、密码加密和HTTPS传输
- **高并发**: Redis缓存、连接池和消息队列优化
- **可扩展性**: 模块化设计，易于添加新棋类和功能
- **容器化部署**: Docker + Docker Compose一键部署
- **自动化测试**: 完整的单元测试和集成测试覆盖

## 项目预览

### 主界面
![项目首页](preview/img.png)

## 快速开始

### 环境要求
- **Java**: JDK 17+
- **Springboot**: 3.2.6
- **SpringbootAI**: 3.2.6



#### 3. 后端配置和启动
```bash
cd backend

# 修改配置文件
cp src/main/resources/application.yml.example src/main/resources/application.yml
# 编辑 application.yml，配置数据库和Redis连接

# 构建项目
mvn clean package -DskipTests

# 启动应用
java -jar target/gobang-backend-*.jar
```



#### 5. 访问应用
- **前端地址**: http://localhost:3000
- **后端API**: http://localhost:8080
- **API文档**: http://localhost:8080/swagger-ui.html

## 技术架构

### 系统架构图
![系统架构图](docs/images/architecture.png)

### 前端技术栈
- **框架**: Vue.js 3 + TypeScript


### 后端技术栈
- **框架**: Spring Boot 3.2.x


## 贡献指南

我们欢迎所有形式的贡献！请阅读 [贡献指南](docs/CONTRIBUTING.md) 了解详细信息。

### 开发流程
1. Fork 项目
2. 创建特性分支 (`git checkout -b feature/amazing-feature`)
3. 提交更改 (`git commit -m 'Add some amazing feature'`)
4. 推送到分支 (`git push origin feature/amazing-feature`)
5. 创建 Pull Request

### 代码规范
- 遵循项目代码规范
- 编写单元测试
- 更新相关文档
- 通过所有CI检查

### 问题报告
使用Gitee Issues报告问题，请提供：
- 详细的问题描述
- 复现步骤
- 环境信息
- 相关日志

## 路线图


## 项目状态

<div align="center">
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/actions">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/build.svg" alt="构建状态">
  </a>
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/commits/master">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/coverage.svg" alt="覆盖率">
  </a>
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/issues">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/quality.svg" alt="代码质量">
  </a>
</div>

### 最新版本
<div align="center">
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/releases">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/release.svg" alt="Gitee release">
  </a>
</div>

### 活跃贡献者
<div align="center">
  <a href="https://gitee.com/phoenix-cities/intelligent-chatbot/contributors">
    <img src="https://gitee.com/phoenix-cities/intelligent-chatbot/badge/contributors.svg" alt="Gitee contributors">
  </a>
</div>

## 许可证

本项目采用 [MIT许可证](LICENSE) - 查看LICENSE文件了解详情

## 致谢

感谢以下开源项目和贡献者：
- [Vue.js](https://vuejs.org/) - 渐进式JavaScript框架
- [Spring Boot](https://spring.io/projects/spring-boot) - Java应用框架
- [Element Plus](https://element-plus.org/) - Vue 3 UI组件库
- [MyBatis Plus](https://baomidou.com/) - MyBatis增强工具

## 联系我们

- **项目主页**: https://gitee.com/phoenix-cities/intelligent-chatbot
- **问题反馈**: https://gitee.com/phoenix-cities/intelligent-chatbot/issues
- **讨论区**: https://gitee.com/phoenix-cities/intelligent-chatbot/issues/new
- **邮箱**: support@come-xiaqi.com

---

<div align="center">
  <p>如果这个项目对你有帮助，请给我们一个 Star</p>
  <p>Made with love by Come 下棋 Team</p>
</div>