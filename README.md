
# 设计模式六大规则

## 单一职责原则
描述的意思是每个类都只负责单一的功能，切不可太多，并且一个类应当尽量的把一个功能做到极致。

## 里氏替换原则
这个原则表达的意思是一个子类应该可以替换掉父类并且可以正常工作。

## 接口隔离原则
也称接口最小化原则，强调的是一个接口拥有的行为应该尽可能的小。

## 依赖倒置原则
这个原则描述的是高层模块不该依赖于低层模块，二者都应该依赖于抽象，抽象不应该依赖于细节，细节应该依赖于抽象。

## 迪米特原则
也称最小知道原则，即一个类应该尽量不要知道其他类太多的东西，不要和陌生的类有太多接触。

## 开-闭原则
对修改关闭，对扩展开放。








# 创建型设计模式
## 简单工厂模式（Simple Factory）

简单工厂模式又叫做静态工厂方法模式是由一个工厂对象决定创建出哪一种产品类的实例。

- **设计原则**：遵循单一职责、违背开闭原则
- **常用场景**：需要在一堆产品中选择其中一个产品
- **选择关键点**：一种产品是否可根据某个参数决定它的种类
- **相关设计模式**工厂方法模式：工厂方法模式是简单工厂模式的进一步抽象化，在这两者之间做选择，主要看将工厂进一步抽象化是否有必要，通常情况下，如果工厂的作用仅仅是用来制造产品，则没必要使用工厂方法模式。

## 工厂方法模式（Factory Method）

工厂方法模式的用意是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中。

- **设计原则**：遵循单一职责、依赖倒置、开闭原则
- **常用场景**：一种场景是希望工厂与产品的种类对客户端保持透明，给客户端提供一致的操作，另外一种是不同的工厂和产品可以提供客户端不同的服务或功能
- **选择关键点**：工厂类和产品类是否是同生同灭的关系
- **相关设计模式**抽象工厂模式：工厂方法模式与抽象工厂模式最大的区别在于，在工厂方法模式中，工厂创造的是一个产品，而在抽象工厂模式中，工厂创造的是一个产品族。

##抽象工厂模式（Abstract Factory）

抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

- **设计原则**：遵循单一职责、依赖倒置、开闭原则
- **常用场景**：需要一个接口可以提供一个产品族，且不必知道产品的具体种类
- **选择关键点**：产品族是否需要一起提供，且是否有一致的接口
- **相关设计模式**建造者模式：两者都是建造一批对象或者说产品，不同的是两者的目的和实现手段，在建造者模式中，是为了复用对象的构建过程而定义了一个指挥者，而在抽象工厂模式中，是为了提供一个这批对象的创建接口而定义了抽象工厂接口。




## 建造者模式（Builder）

建造者模式将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

- **设计原则**：遵循单一职责、开闭原则
- **常用场景**：需要构建一批构建过程相同但表示不同的产品，而构建过程非常复杂
- **选择关键点**：各个产品的构建过程是否相同



## 原型模式（Prototype）

原型模式用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

- **设计原则**：无
- **常用场景**：需要在运行时动态的创建指定实例种类的对象，或是需要复用其状态
- **选择关键点**：创建出来的对象是否可以立即投入使用











# **结构型设计模式**



## 代理模式（Proxy）

代理模式是对象的结构模式。代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。

- **设计原则**：体现功能复用
- **常用场景**：需要修改或屏蔽某一个或若干个类的部分功能，复用另外一部分功能，可使用静态代理，若是需要拦截一批类中的某些方法，在方法的前后插入一些一致的操作，假设这些类有一致的接口，可使用JDK的动态代理，否则可使用cglib
- **选择关键点**：静态代理选择的关键点是是否要复用被代理的部分功能，动态代理选择的关键点在于能否在将被代理的这一批类当中，找出相同的切入点
- **相关设计模式**适配器模式：对于适配器模式当中的定制适配器，它与静态代理有着相似的部分，二者都有复用功能的作用，不同的是，静态代理会修改一部分原有的功能，而适配器往往是全部复用，而且在复用的同时，适配器还会将复用的类适配一个接口



## 适配器模式（Adapter）

适配器模式将一个类的接口转换成客户希望的另外一个接口。

- **设计原则**：遵循开闭原则、体现功能复用
- **常用场景**：需要使用一个类的功能，但是该类的接口不符合使用场合要求的接口，可使用定制适配器，又或者是有一个接口定义的行为过多，则可以定义一个缺省适配器，让子类选择性的覆盖适配器的方法
- **选择关键点**：定制适配器的选择关键点在于是否有更加优良的替代方案，缺省适配器的选择关键点在于接口中的方法是否可以不全部提供，且都有缺省方案
- **相关设计模式**装饰器模式：对于适配器模式中的定制适配器与装饰器模式，二者都是使用组合加继承的手段，不同的是，适配器模式的目的在于适配接口，装饰器模式的目的在于动态的添加功能，且可以叠加。



## 装饰模式（Decorator）

装饰模式又名包装(Wrapper)模式。装饰模式以对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案。

- **设计原则**：遵循迪米特、单一职责、开闭原则，破坏里氏替换，体现功能复用
- **常用场景**：一个类需要动态的添加功能，且这些功能可以相互叠加
- **选择关键点**：添加的功能是否需要动态组装




## 桥接模式（Bridge）

桥接模式将抽象部分与它的实现部分分离，使它们都可以独立地变化

- **设计原则**：遵循单一职责、迪米特、开闭原则，体现功能复用
- **常用场景**：一个对象有多个维度的变化，需要将这些维度抽离出来，让其独立变化
- **选择关键点**：是否可以将对象拆分成多个不相关的维度



## 组合模式（Composite）

组合模式将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

- **设计原则**：遵循依赖倒置、开闭原则，破坏接口隔离
- **常用场景**：当有一个结构可以组合成树形结构，且需要向客户端提供一致的操作接口，使得客户端操作忽略简单元素与复杂元素
- **选择关键点**：对外提供一致操作接口的结构是否可转化为树形结构



## 享元模式（FlyWeight）

享元模式运用共享技术有效地支持大量细粒度的对象

- **设计原则**：无
- **常用场景**：一些状态相同的对象被大量的重复使用
- **选择关键点**：被共享的对象是否可以将外部状态提取出来



## 外观模式（Facade）

外观模式为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

- **设计原则**：遵循迪米特
- **常用场景**：一个子系统需要对外提供服务
- **选择关键点**：子系统对外提供服务是否需要依赖很多的类
- **相关设计模式**中介者模式：二者都是为了处理复杂的耦合关系，不同的是外观模式处理的是类之间复杂的依赖关系，中介者模式处理的是对象之间复杂的交互关系








# 行为设计模式



## 观察者模式（Observer）

观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能给自动更新自己。

- **设计原则**：遵循迪米特、开闭原则
- **常用场景**：需要将观察者与被观察者解耦或者是观察者的种类不确定
- **选择关键点**：观察者与被观察者是否是多对一的关系







## 模板方法模式（Template Method）

准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。

- **设计原则**：破坏里氏替换，体现功能复用
- **常用场景**：一批子类的功能有可提取的公共算法骨架
- **选择关键点**：算法骨架是否牢固





## 命令模式（Command）

命令模式将一个请求封装为一个对象，从而使你可用不同的请求对客户端进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。

- **设计原则**：遵循迪米特、开闭原则
- **常用场景**：行为的请求者与行为的处理者耦合度过高
- **选择关键点**：请求者是否不需要关心命令的执行只知道接受者
- **相关设计模式**职责链模式：容易将二者关联在一起的原因是，二者都是为了处理请求或者命令而存在的，而且二者都是为了将请求者与响应者解耦，不同的是命令模式中，客户端需要知道一个命令的接受者，在创建命令的时候就把接受者与命令绑定在一起发送给调用者，而职责链模式中，客户端并不关心最终处理请求的对象是谁，客户端只是封装一个请求对象，随后交给职责链的头部而已，也正因为这样，二者的实现方式，有着很大的区别




## 状态模式（State）

状态模式当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

- **设计原则**：遵循单一职责、依赖倒置、开闭原则
- **常用场景**：一个对象在多个状态下行为不同，且这些状态可互相转换
- **选择关键点**：这些状态是否经常在运行时需要在不同的动态之间相互转换
- **相关设计模式**策略模式：二者的实现方式非常相似，策略接口与状态接口，具体的策略与具体的状态以及二者都拥有的上下文，如果看它们的类图，会发现几乎一模一样，而二者不同的地方就在于，状态模式经常会在处理请求的过程中更改上下文的状态，而策略模式只是按照不同的算法处理算法逻辑，而且从实际场景来讲，顾名思义，状态模式改变的是状态，策略模式改变的是策略





## 职责链模式（ChainOfResponsibility）

职责链模式使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递改请求，直到有一个对象处理它为止。

- **设计原则**：遵循迪米特

- **常用场景**：一个请求的处理需要多个对象当中的一个或几个协作处理

- **选择关键点**：对于每一次请求是否每个处理的对象都需要一次处理机会

  ​



## 解释器模式（Interpreter）

解释器模式给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

- **设计原则**：遵循单一职责
- **常用场景**：有一种语言被频繁的使用
- **选择关键点**：被频繁使用的语言是否可用文法表示






## 中介者模式（Mediator）

中介者模式用一个中介对象来封装一系列的对象交互。中介者使个对象不需要显式地相互引用，从而使其耦合松散。而且可以独立地改变它们之间的交互。

- **设计原则**：遵循迪米特，破坏单一职责
- **常用场景**：一个系列的对象交互关系十分复杂
- **选择关键点**：复杂的交互关系是否有共性可被中介者承担



## 访问者模式（Visitor）

访问者模式表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

- **设计原则**：遵循倾斜的开闭原则

- **常用场景**：作用于一个数据结构之上的操作经常变化

- **选择关键点**：数据结构是否稳定以及操作是否经常变化

  ​



## 策略模式（Strategy）

策略模式属于对象的行为模式。其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响到客户端的情况下发生变化。

- **设计原则**：遵循单一职责、依赖倒置、迪米特、开闭原则
- **常用场景**：算法或者策略需要经常替换
- **选择关键点**：客户端是否依赖于某一个或若干个具体的策略



## 备忘录模式（Memento）

备忘录模式在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保持这个状态。这样以后就可将该对象恢复到原先保存的状态

- **设计原则**：遵循迪米特、开闭原则
- **常用场景**：需要在对象的外部保存该对象的内部状态
- **选择关键点**：是否可以在必要的时候捕捉到对象的内部状态



## 迭代器模式（Iterator）

迭代器模式提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。

- **设计原则**：遵循迪米特
- **常用场景**：需要迭代访问一个聚合对象中的各个元素，且不暴露该聚合对象内部的表示
- **选择关键点**：客户端是否关心遍历的次序
- **相关设计模式**访问者模式：二者都是迭代的访问一个聚合对象中的各个元素，不同的是，访问者模式中，扩展开放的部分在作用于对象的操作上，而迭代器模式中，扩展开放的部分在聚合对象的种类上，而且二者的实现方式也有着很大的区别。












