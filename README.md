   微服务是一种架构风格，是以开发一组小型服务的方式来作为一个独立的应用系统，每个服务都运行在自己的进程中，服务之间采用轻量级的http通信机制（通常是采用http的restful api）进行通信，这些服务都是围绕具体业务进行构建的，并且可以独立部署到生产环境上。这些服务可以用不同的变成语言编写，并且可以使用不同的数据存储技术。对这些微服务我们只需要使用一个非常轻量级的集中式管理来进行协调。
  

 **1. 1.2单体应用架构**
 

 **- 单体应用架构概念**
 一个应用中包含了应用程序的所有功能（比如：页面，代码，配置），把应用打成一个war或jar包部署到tomcat中，通常成为单体应用架构。
 

 - **单体架构图**
 

 ![](https://img-blog.csdnimg.cn/20200304140140143.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NIRU5HWFVZVUFOMDk=,size_16,color_FFFFFF,t_70)

 - **单体应用架构的优缺点**
    

    - **优点易于开发&测试**：单个应用包含所有功能，不涉及多个应用的互联互调，便于在团队之间开发与测试。 **易于部署**：只需将单个应用打成war或jar包，进行部署到tomcat即可，运维起来比较方便。 **易于整体扩展**：当应用负载压力大时，将这个应用复制几份，分别部署在不同的服务器上，再通过负载均衡即可提高应用的并发能力。
    **- 缺点 复杂性高**：由于是单个应用，所以整个项目文件包含的模块非常多，导致模块的边界模糊，依赖关系不清晰，代码的质量参差不齐，混乱的堆在一起，使得整个项目非常复杂。以至每次修代码，都非常小心，可能添加一个简单的功能，或者修改一个bug都会带来隐藏的缺陷。**技术债务**：随着时间的推移，需求的变更和技术人员的更替，会逐渐形成应用程序的技术债务，并且越积越多。**阻碍技术创新**：对于单体应用来说，技术是在开发之前经过慎重评估后选定，每个团队成员都必须使用相同的开发语言，持久层存储及消息系统。
    

 **3 1.3微服务架构**
 

  **- 微服务架构图**
  ![](https://img-blog.csdnimg.cn/20200304141442739.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NIRU5HWFVZVUFOMDk=,size_16,color_FFFFFF,t_70)
![](https://img-blog.csdnimg.cn/20200304141504864.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NIRU5HWFVZVUFOMDk=,size_16,color_FFFFFF,t_70)

 **- 微服务架构的优缺点**
 
 **- 优点**
 **1.** **易于开发和维护** :一个微服务只会关注一个特定的业务功能，所以业务清晰、代码量较少。开发和 维护单个微服务相对简单。
**2. 单个微服务启动较快**
**3. 局部修改容易部署**:单一应用只要有修改，就得重新部署整个应用。微服务解决了这样的问题。一
般来说，对某个微服务进行修改，只需要重新部署这个服务即可。
**4. 技术栈不受限制**:在微服务架构中，可以结合项目业务及团队的特点，合理的选择技术栈。
 **5. 按需伸缩**:可根据需求，实现细粒度的扩展。
 
 **缺点**
**1. 运维要求高**:更多的服务意味着要投入更多的运维。
**2. 分布式固有的复杂性**:使用微服务构建的是分布式系统。对于一个分布式系统，系统容错、网络延
迟、分布式事务等都会带来巨大的问题。
**3. 接口调整成本高**:微服务之间通过接口进行通信。如果修改某一个微服务的API，可能所有用到这个接口的微服务都需要进行调整。

**微服务架构总结:**
         微服务的核心就是将传统的单一应用，根据业务拆分成一个一个的服务，彻底地去耦合,每一个微服务提 供单个业务功能的服务，一个服务做一件事。
         在 IDEA 工具中使用Maven构建的一个个独立的 Module ，也就是使用Spring Boot 开发的一个个小模块 就是一个个微服务，将专业的事交给专业的模块来做。比如一个大型项目可能有上百个微服务，将这些 微服务集中起来构成一个大的系统，对外暴露服务进行调用与使用。 从技术角度看就是一种小而独立的处理过程，类似进程概念，能够自行单独启动或销毁，拥有自己独立 的数据库。
         

 **4. 1.4 介绍微服务架构技术栈**

   **搭建分布式微服务架构的技术栈**
   ![](https://img-blog.csdnimg.cn/20200304142117309.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NIRU5HWFVZVUFOMDk=,size_16,color_FFFFFF,t_70)
  

## Spring Cloud概要

## 2.1 什么是 Spring Cloud

 - Spring Cloud，基于 Spring Boot 提供了一套微服务解决方案，包括服务注册与发现，配置中心，全链路监 控，服务网关，负载均衡，熔断器等组件，除了基于NetFlix的开源组件做高度抽象封装之外，还有一些选型 中立的开源组件。
 - 官方译文:构建分布式系统不用特别的复杂且避免容易出现的错误。Spring Cloud为最常见的分布式系统模式 提供了一个简单和可访问的编程模型，帮助开发人员构建弹性、可靠和协调的应用程序。SpringCloud构建在 SpringBoot之上，使开发人员很容易开始工作并迅速提高生产力。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200304142337534.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NIRU5HWFVZVUFOMDk=,size_16,color_FFFFFF,t_70)
 **- Spring Boot 快速构建一个个微服务，多个微服务之间如何互通互调等呢?**
 
    - 使用Spring Cloud进行管理协调服务间正常互联互调, 从而实现分布式微服务架构。
    **- 说明:**
    
        **- spring Cloud 使用 RESTful API 实现服务之间通信**
        **- Dubbo 使用 RPC (远程过程调用) 实现服务之间通信**

**2.2 SpringBoot和SpringCloud的关系**

 - Spring Boot 可以离开 Spring Cloud 单独使用开发项目，但是Spring Cloud离不开SpringBoot，属于依赖的 关系。
- Spring Boot 专注于快速方便的开发单个个体微服务，Spring Cloud 关注全局的服务治理框架。
- Spring Cloud 是关注全局的微服务协调整理治理框架，它将 Spring Boot 开发的一个个单体微服务整合并管 理起来，为各个微服务之间提供，配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策 竞选、分布式会话等等集成服务。
