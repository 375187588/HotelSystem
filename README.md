# HotelSystem
This is 黄钰朝’s hotel_system

## 目前项目进度：
#### 3月30日刚刚完成CAT工作室的项目，加上QG训练营有任务，目前处于需求分析，建立数据模型和业务流程初步设计阶段
#### 准备先好好总结一下CAT项目的经验，并且把一些遇到的问题理解清楚再动手写这个项目

## 目前遇到的疑惑：
### 1.用户和管理员需不需要分表？
#### 目前我想采取的方案是一张user表，只存储用户名，密码，用户类型，提供给注册登陆模块使用，另外分别使用customer表和hotel_admin表分别保存用户和管理员的数据，再引入user_id做外键，原因是将来如果功能扩展，用户和管理员的数据将会有更多不同，分表便于管理，避免数据冗余，详细信息表和user表分离，也便于注册登陆模块的其他模块解耦
### 2.酒店的星级和评分有什么区别？
#### 酒店的星级直接由评分决定？还是星级是超级管理员设置的，评分是用户评价统计的结果？
### 3.对于数据库的字段，用户类型，房间类型，酒店类型，这种信息，使用0，1这种数字代表，和直接使用varchar存储具体类型，孰优孰劣？
#### 目前我觉得直接使用字符串描述类型，更加方便，避免前端显示数据时需要再次进行转换
### 4.异常应该如何处理？service层的异常还应该往controller层抛吗？有些并不影响业务需求的异常，比如图片加载不到的异常，是否允许只打印堆栈信息？感觉有些异常确实没有产生严重的影响，又没有很好的解决方案，也没有很大的必要向用户输出提示，就不知道该怎么处理了
