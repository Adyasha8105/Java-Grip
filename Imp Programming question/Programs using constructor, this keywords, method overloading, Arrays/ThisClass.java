import java.io.*;
import java.util.*;
class Student{
    int rollno;
    String name, course;
    float fee;
    Student(int rollno, String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
  
  Student(int rollno, String name, String course,float fee){
      this(rollno,name,course);  
      this.fee = fee;
  }
  void display(){
      System.out.println(rollno+" "+name+" "+course+" "+fee);
  }
  }
  
  class ThisClass{
      public static void main(String args[]){
          Student s1 = new Student(16,"sandesha","java");
          Student s2 = new Student(80,"adeep","java");
          s1.display();
          s2.display();
      }
  }