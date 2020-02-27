package exception;

import java.util.Scanner;

/*
4.自定义异常
有Person类（怎么还是Person...），属性：姓名、年龄、性别。
编写两个自定义异常类，模拟当设置年龄时（如setAge（）方法）如果年龄不合法（如-1岁，200岁）抛出年龄异常。
当性别不合法时（如“不男不女”，“外星人”）时抛出性别异常。
 */
public class Text {
    public static void main(String[] args) {
        System.out.println("请输入Person的信息(姓名、年龄、性别)：");
         {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            int age = sc.nextInt();
            String sex = sc.next();
            int flag = 0;

            try {
                    if(age > 100) {
                        throw new Exception01("年龄过大");
                    }
                    else if(age < 0) {
                        throw new Exception01("年龄过小");
                    }
                    if (sex.equals("男") || sex.equals("女")) {
                        flag = 1;
                    }

                    if(flag == 0) {
                        throw new Exception02("性别异常");
                    }
                } catch (Exception e) {
                e.printStackTrace();
                }
            }
        }
    }
