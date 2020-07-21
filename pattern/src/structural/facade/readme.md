## Facade 外观模式

- 外观类
- 子系统类

![uml类图](java/uml.png)

使用场景：
- 将多个子系统封装，并对外提供Facade。
- 对Client隐藏实现细节。

优点：
- 简化调用过程，提高安全性
- 减少依赖，松耦合
- 符合迪米特法则（最小知识原则）

缺点：
- 不符合开闭原则