/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;

import java.util.*;
public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyPriorityQueue obj=new MyPriorityQueue();
        System.out.print("To Insert press 1, To Dequeue press 2, to traverse press3, to print number of students press 4:- ");
        int counter = sc.nextInt();
        while (counter!=0){
            switch( counter ){
                case 1:
                    System.out.print("Enter Roll you want to insert:- ");
                    obj.enqueue(sc.nextInt());
                    break;
                case 2:
                    Node result=obj.dequeue();
                    if(result!=null) {
                        System.out.println("The roll is " + result.getRoll() + ". Your roll is also deleted from Queue");
                    }else{
                        System.out.println("The Queue is empty");
                    }
                    break;
                case 3:
                    obj.traversing();
                    break;
                case 4:
                    System.out.println("Number of students "+obj.getSize());
                    break;
                default:
                    System.out.println("Invalid Option! Enter again.");
            }
            System.out.print("To Insert press 1, To Dequeue press 2, To traverse press3, To print number of students press 4, To exit press 0:- ");
            counter=sc.nextInt();
        }
    }
}
