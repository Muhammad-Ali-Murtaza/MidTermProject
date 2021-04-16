
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
public class Teacher extends Person{
    private String status;
//    private ArrayList<Person> list = new ArrayList<Person>();
//    static Teacher t;
//    
//    public ArrayList<Person> getList(){
//        return list;
//    }
//    
//    public void addToList(Person obj)
//    {
//        list.add(obj);
//    }
//    
//    public void setList(int index , Person p)
//    {
//        list.set(index, p);
//    }
//    
//    public Person getObject(int index){
//        return list.get(index);
//    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
}
