package No01_seven_principle._01_singleResponsibilityPrinciple;
/**
 * 单一职责原则
 *
 * 基本介绍：
 *     对类来说的，即一个类应该只负责一项职责。如A负责两个不同职责：职责1的职责2，
 * 当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2。
 *
 * 注意事项和细节：
 * 1. 降低类的复杂度，一个类只负责一项职责；
 * 2. 提高类的可读性，可维护性；
 * 3. 降低变更引起的风险
 * 4. 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；
 * 只有类中方法数量足够少，才可以在方法级别操持单一职责原则。
 */
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {

    }
}
