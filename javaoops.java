import java.util.*;

import javax.swing.plaf.synth.SynthToolTipUI;



class student{
    String name;
    int age;
    String enrollment;
    

    // Default contructor----parameterized one
   student(String name,int age,String enroll){
       this.age=age;
       this.name=name;
       this.enrollment=enroll;
       count++;
       System.out.println(count);
   } 
   
//    basic method/function
    public void printValue(){
             System.out.println(this.name+" "+this.age+" "+this.enrollment);
             count++;  
             System.out.println(count);                
    }


    // static member---> means it is common for all objects of this classs
  static int count=0;
             

   



}

class javaoops{


public static void main(String[] args){

    // creating object
student s1=new student("praveen", 20, "0201IT191050");

s1.printValue();
student s2=new student("gautam",21,"0201it191051");
s1.printValue();



}


}


