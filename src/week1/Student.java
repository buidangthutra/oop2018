/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author Admin
 */
public class Student {
     // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String aId) {
        id = aId;
    }
     public String getId() {
        return id;
    }
    
     public void setGroup(String aGroup) {
         group = aGroup;
     }
     public String getGroup() {
         return group;
     }
     
     public void setEmail(String aEmail) {
         email = aEmail;
     }
     public String getEmail() {
         return email;
     }

    /**
     * Constructor 1
     */
    public Student() {
        // TODO:
        setName("Student");
        setId("000");
        setGroup("Int22041");
        setEmail("uet@vnu.edu.vn");
        
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.email = em;
        this.id = sid;
        setGroup("INT22041");
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
        
    }

    void getInfo() {
        // TODO:
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
      //  return null; // xóa dòng này sau khi cài đặt
    }
}
