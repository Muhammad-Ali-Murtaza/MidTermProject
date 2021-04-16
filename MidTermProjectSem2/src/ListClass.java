
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Ali Murtaza
 */
public class ListClass {
    ListClass s = null;
    private  ArrayList<Person> t = new ArrayList<Person>();
    private ArrayList<Person> std = new ArrayList<Person>();
    private ArrayList<Course> c = new ArrayList<Course>();
    static ListClass a = null;
    private ListClass() {
        
    }
    
    public static ListClass getInstance()
    {
        if (a == null) {
            return a = new ListClass();
        }
        else{
            return a;
        } 
    }
    
    public ArrayList getTeacherList(){
        return t;
    }
    
    public ArrayList getStudentList(){
        return std;
    }
    
    public ArrayList getCourseList(){
        return c;
    }
    
    public void addTeacher(Person obj)
    {
        t.add(obj);
    }
    
    public void addStudent(Person obj)
    {
        std.add(obj);
    }
    
    public void addCourse(Course obj)
    {
        c.add(obj);
    }
    
    public void setTeacher(int index , Person obj)
    {
        t.set(index, obj);
    }
    
    public void setStudent(int index , Person obj)
    {
        std.set(index, obj);
    }
    
    public void setCourse(int index , Course obj)
    {
        c.set(index, obj);
    }
}
