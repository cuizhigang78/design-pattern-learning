package No01_seven_principle._05_openClosedPrinciple;

/**
 * 方式一的优缺点
 * 1. 优点是比较好理解，简单易操作
 * 2. 缺点是违反了设计模式的ocp原则，即对（提供方）扩展开放，对（使用方）修改关闭。也就是说
 * 当我们给类增加新功能时，尽量不修改代码，或者尽可能少修改代码。而是做增加的操作。
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}

// 用于绘图
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    // 绘制矩形
    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    // 绘制圆形
    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    // 绘制三角形
    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }
}

// 图形类，基类
class Shape {
    int m_type;
}

// 矩形
class Rectangle extends Shape {
   public Rectangle() {
       m_type = 1;
   }
}

// 圆形
class Circle extends Shape {
    public Circle() {
        m_type = 2;
    }
}

// 三角形
class Triangle extends Shape {
    public Triangle() {
        m_type = 3;
    }
}