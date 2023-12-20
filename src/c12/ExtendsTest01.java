package c12;

/**
 * @author : wangshanjie
 * Q:子类继承父类之后，能使用子类对象调用父类的方法吗？
 * A:可以，本质上，子类继承了父类之后，是将父类继承过来的方法归为自己的方法了。
 * 实际上调用的不是父类的，而是子类自己的。
 * Q:   在实际的开发中满足什么条件可以使用继承？
 * A：   凡事采用“is an ”能描述的，都是可以使用继承（子类包含于父类！）
 */
public class ExtendsTest01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        System.out.println(dog.name);
    }


}
class Animals{
    String name = "xiaohua";
    public void run(){
        System.out.println(name + "在跑");
    }
}

class Dog extends Animals{

}


