package com.wangwei.service;

/**
 * Hello world!
 *
 */
public class App {

    public void test01(){
        int a=2;
        int b=1;
        for(int c=0;c<5;c++){
            System.out.println("第" + (c+1) + "循环开始：" + "a=" + a + "\t" + "b=" + b);
            if((++a)>2 && (++b>2)){
                System.out.println("循环体内：a=" + a);
                a++;
                System.out.println("循环体内：a++ =" + a);
            }
            System.out.println("第" + (c+1) + "循环完成：" + "a=" + a + "\t" + "b=" + b);
        }
        System.out.println("最后a=" + a + "\t" + "b=" + b);
    }

    public void changeStr(String str){
        str = "welcome";
    }

    public static void main(String[] args) {
        App app = new App();
//        app.test01();

        String str = "hello";
        app.changeStr(str);
        System.out.println(str);

    }

}
