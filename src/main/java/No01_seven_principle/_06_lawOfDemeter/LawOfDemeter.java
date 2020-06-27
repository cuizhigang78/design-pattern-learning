package No01_seven_principle._06_lawOfDemeter;

/**
 * 迪米特法则
 *
 * 基本介绍
 * 1. 一个对象应该对其他对象保持最少的了解
 * 2. 类与类的关系越密切，耦合度越大
 * 3. 迪米特法则（Demeter Principle）又叫最少知道法则，即一个类对自己依赖的类知道的越少
 * 越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的
 * public方法，不对外泄露任何信息。
 * 4. 迪米特法则还有个更简单的定义：只与直接的朋友通信。
 * 5. 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说
 * 这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现在
 * 成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。
 * 也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。
 *
 * 注意事项和细节
 * 1. 迪米特法则的核心是降低类之间的耦合
 * 2. 但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只要求降低类间（对象间）的耦合
 * 关系，并不是要求完全没有依赖关系。
 */
public class LawOfDemeter {
}
