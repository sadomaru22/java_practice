// package java_practice.15_Package.xyz;
package xyz;

import java_practice.15Package.abc.Students;

public class UseStudents {
   public static void main(String[] args) {
      Students stu = new Students(3, "本田俊介");
      stu.showInfo();
   }
}
