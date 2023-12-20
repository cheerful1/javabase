package c12;

/**
 * @author : wangshanjie
 * @date : 21:20 2023/12/20
 *
 * 什么是继承？
 *
 * 以下代码有什么问题？ 代码臃肿，没有得到重复的利用！
 */
public class Extend01 {
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
        class CreditAccount{
            private String actno;
            private double balance;
            private double credit;


            public CreditAccount() {
            }
            public CreditAccount(String actno, double balance, double credit) {
                this.actno = actno;
                this.balance = balance;
                this.credit = credit;
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

            public double getCredit() {
                return credit;
            }

            public void setCredit(double credit) {
                this.credit = credit;
            }
        }
    }
}

