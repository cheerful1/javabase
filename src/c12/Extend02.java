package c12;

/**
 * @author : wangshanjie
 *
 * 第二个类继承第一个类，并且在子类中添加新的成员变量和方法
 * 但是构造方法不能继承
 * 继承的好处：
 * 基本作用：解决了代码复用的问题。
 * 重要作用：有了继承，就有了后面的方法的复用和多态
 *
 * 注意：
 * 1、java只能单继承，不能多继承 class A extends B，C{}是错误的。
 * 如果有三个类
 * class B extends A{}
 * class C extends B{}
 * 这样就相当于多继承了。 C直接继承了B，C间接继承了A
 * 2、java不支持循环的继承
 * 3、java中规定，子类继承父类，除了构造方法不呢继承之外，剩下的都可以继承，但是私有的属性无法在子类中访问
 *      也就是private修饰的属性，子类中是无法访问的。但是可以通过间接的方法来访问！
 *         下面的例子中，在子类中写一个方法，比如
 *         public void show(){
 *             system.out.println(actno);//这是不允许的
 *             system.out.println(this.getActno());//这是可以的！
 *         }
 *  4、object是所有类的超类，所有类都继承自Object类。
 *  5、继承的耦合度比较高，因为子类会继承父类的所有属性和方法，父类修改，子类受到牵连。
 *
 */
public class Extend02 {
    /**
     * 类Account
     */
    class Account{
        //属性
        private  String actno;
        private  double balance;

        public Account() {
        }

        public Account(String actno, double balance) {
            this.actno = actno;
            this.balance = balance;
        }

        public String getActno() {
            return actno;
        }

        public void setActno(String actno) {
            this.actno = actno;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }


        /**
         * 信用卡类
         */
        class CreditAccount extends Account{

            private double credit;

            public CreditAccount() {
            }


            public double getCredit() {
                return credit;
            }

            public void setCredit(double credit) {
                this.credit = credit;
            }
        }
    }
}
