package com.start.demo;

/**
 * java 基本数据类型:六种数字类型（四个整数型，两个浮点型），一种字符类型，一种布尔型
 * 变量就是申请内存来存储值，即当创建变量时，需要在内存中申请空间，内存管理系统根据变量的类型为变量分配存储空间，得到的空间只能存储该类型数据。
 * java的两大数据类型
 * 1、内置数据类型
 * 2、引用数据类型
 */
public class Demo3 {

    /*
    * 内置数据类型
    byte:数据类型8位，有符号，二进制补码表示整数；
            值范围：min -128（-2^7）
            max 127(2^7-1)
            default 0
            byte 类型用在大型数组中节约空间，主要代替整数，因为byte变量占用的空间只有int类型的四分之一；
            eg：byte a = 100; byte b = -50

     short:数据类型16位，有符号，二进制补码表示的整数
            min -32768(-2^15)
            max 32767(2^15-1)
            default 0
            short 数据类型也可以像byte那样节省空间，一个short变量是int型变量所占空间的二分之一


     int:int数据类型是32位，有符号二进制补码表示整数；
            min:-2147483648(-2^31)
            max:21474836647(-2^31-1)
            default 0
            一般的整型数据类型默认为int


      long：long数据类型是64位，有符号二进制补码表示整数（注意long型数据表示哦，结尾带L）
            min：-9,223,372,036,854,775,808（-2^63）
            max：9,223,372,036,854,775,807（2^63 -1）
            default 0L
            这种类型主要使用在需要比较大整数的系统上；
            “L”理论上不区分大小写，但是为了与数字1混淆，建议还是采用大写L


       float：float数据类型是单精度、32位、符合IEEE 754标准的浮点数
             float在存储大型浮点数组的时候可以节省内存空间；
             默认值.0.0f
             浮点数不能用来表示精确的值，如货币；
             eg：float f1 = 234.5f

       double:double数据类型是双精度、64位、符合IEEE 754标准的浮点数；
              浮点数的默认类型为double类型；
              double类型同样不能表示精确的值，如货币；
              默认值是0.0d;
              eg：double d1 = 123.4


        boolean:表示一位类型的信息
                只有两个取值true/false
                这种类型作为一种标记记录true/false情况
                default  false
                eg ： boolean one = false;

        char:char类型是一个单一16位Unicode字符；
                min:\u0000(即为0)
                max:\uffff(即为65535)
                char数据类型可以存储任何字符
                eg:char letter = 'A';
                *

        不必强记

        *
    * */



}
