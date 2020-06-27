package No01_seven_principle._03_dependenceInversionPrinciple;

/**
 * 基本介绍
 *
 * 1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 2. 抽象不应该依赖细节，细节应该依赖抽象
 * 3. 依赖倒转（倒置）的中心思想是面向接口编程
 * 4. 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。
 * 以抽象为基础搭建的架构比以细节为基础搭建的架构要稳定的多。在java中，抽象指的
 * 是接口或抽象类，细节就是具体的实现类。
 * 5. 使用接口或抽象类的目的是制定好规范，而涉及任何具体的操作，把展现细节的任务
 * 交给他们的实现类去完成。
 *
 * 注意事项和细节
 * 1. 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好。
 * 2. 变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，
 * 就存在一个缓冲层，利于程序扩展和优化
 * 3. 继承时遵循里氏替换原则
 */
public class DependenceInversionPrinciple {
}
