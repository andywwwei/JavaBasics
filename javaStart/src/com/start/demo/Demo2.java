package com.start.demo;

//理解对象和类
public class Demo2 {
    //Demo2先理解为dog
    String breed;
    int age;
    String clolr;
    void barking(){}
    void hungry(){}
    void sleeping(){}

    /*java对象和类：多态、继承、封装、抽象、类、对象、实例、方法、重载
     * java中的对象：软件对象的状态就是属性，行为通过方法提现；对象的相互调用也是通过方法来完成的。
     * java中的类：局部变量、成员变量、类变量
     * 构造方法：没有显式定义构造方法，默认有一个。一个类可以有多个构造方法，构造方法必须与类名相同；
     * */
    public Demo2(){}//构造方法



}

/*创建对象
 * 1、声明一个对象，包括对象名称和对象类型。
 * 2、实例化，通过new关键字创建一个新对象。
 * 3、初始化，使用new关键字创建对象，会调用构造方法初始化对象。
 * */
class Puppy{
    public Puppy(String name){//构造方法会初始化一个对象
        System.out.println("小狗名字是:"+name);
    }
    public static void main(String[] args) {
        Puppy puppy = new Puppy("tom");//new关键字创建一个对象
        System.out.println(puppy);
    }
}

/*源文件声明规则
 * 在一个源文件中定义多个类，还有import和package语句时，特别注意这些规则
 * 1、一个源文件里面只能包含一个public类
 * 2、一个源文件可以有多个非public类
 * 3、源文件名称应该public类名称一致，
 * 4、如果一个类定义在某个包中，首行应该是包路径package放在首行
 * 5、源文件中存在import，应放在package和类定义之间，如果没有package在放在首行
 * 6、import和package对源文件中的定义所有类都有效。
 * */

/*java包
 * 包是用来对java类进行分类package，类越多，package就越有用
 *
 * import
 * import是用来提供一个合理的路径，使编译器可以找到这个类，容易定位到源代码或者类。
 *
 *
 * */



