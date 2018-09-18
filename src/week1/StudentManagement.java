/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    ArrayList<Student> listS = new ArrayList<>();
    

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup())) {
            System.out.println(s1.getName()+" cung lop voi "+s2.getName());
            return true;}
        else
        {System.out.println(s1.getName()+" khong cung lop voi "+s2.getName());
        return false;
        }
        //return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
       
    }

    void removeStudent(String id) {
        // TODO:
        for (Student student : listS) {
            if (student.getId().equals(id)) {
                listS.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        // TODO go
        Student learner = new Student();
        learner.setName("Bui Dang Thu Tra");
        learner.setId("17021069");
        learner.setGroup("INT22041");
        learner.setEmail("buidangthutra@gmail.com");

        System.out.println(learner.getName());
        learner.getInfo();
        System.out.println(" ");
        Student learner1 = new Student();
        
        learner1.getInfo();
        System.out.println(" ");
        
        Student learner2 = new Student("Nguyen Thi Trang", "17021096", "nguyentrang@");
        
        learner2.getInfo();
        System.out.println(" ");
        
        Student learner3 = new Student(learner2);
        
        learner3.getInfo();
        System.out.println(" ");
        
 //       StudentManagement m = new StudentManagement();
//        m.removeStudent(id);
        learner1.setGroup("INT22041");
        learner2.setGroup("INT22041");
        learner3.setGroup("INT22042");
        
        System.out.println("Kiem tra hai sinhvien cung lop:");
        
        StudentManagement check = new StudentManagement();
        check.sameGroup(learner1,learner2);
        check.sameGroup(learner1,learner3);
        check.sameGroup(learner3,learner2);

    }  
  
}
   
