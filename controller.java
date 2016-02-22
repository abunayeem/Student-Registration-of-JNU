/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jahanggir_nagar_uni;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
/**
 *
 * @author user
 */
public class controller {
    Scanner k=new Scanner(System.in);
    Scanner k2,k3;
    
    
    Student head;
    controller(){
    try{
    k2=new Scanner(new File("jdata.txt"));
    k3=new Scanner(new File("ndata.txt"));
    }catch(Exception e){
    System.out.println("no file");
    
    }
    head=new Student(null);
   if(k2.hasNext()){
   
   head.name=k3.nextLine();
       
    head.hall=k2.next();
    
   head.reg=k2.next();
   
    head.roll=k2.next();
    
   
   
   }
    
    while(k2.hasNext()){
     
      
   
      Student dh=new Student(head);
       dh.name=k3.nextLine();
       
    dh.hall=k2.next();
    
   dh.reg=k2.next();
   
   dh.roll=k2.next();
    
  
  head=dh;
   
    
    
   
    
    }k2.close();
     
     
     
     
     
     k3.close();
    
    }
    public void export(){
    try{
   FileWriter m1=new FileWriter("jdata.txt");
   FileWriter n1=new FileWriter("ndata.txt");
   PrintWriter m=new PrintWriter(m1);
   PrintWriter n=new PrintWriter(n1);
    
    
    for(Student t=head;t!=null;t=t.next){
    String a1,a2,a3,a4;
    a1=t.name;
    a2=t.hall;
    a3=t.reg;
    a4=t.roll;
    
    
    m.println(a2+" "+a3+" "+a4);
      
      n.println(a1);
     
    }m.close(); n.close();}catch(Exception e){
     System.out.println("no file");
    
    }
    }
    
    public void register(){
    Student z=new Student(null);
     System.out.println("enter 6 caracter reg");
     String h=k.nextLine();
    while(exist(h)){
        System.out.println("alreaddy used");
        System.out.println("enter another 6 caracter reg");
     h=k.nextLine();
    
    
    }
    z.reg=h;
    System.out.println("name");
    h=k.nextLine();
    z.name=h;
    System.out.println("roll");
      h=k.nextLine();
      z.roll=h;
      System.out.println("hall");
        h=k.nextLine();
        z.hall=h;
        
    z.next=head;
    head=z;
    export();
    
    
    };
    public void update(){
    System.out.println("please enter reg");
    String gg=k.nextLine();
     if(exist(gg)){
         
         Student z1=at(gg);
         
     
    System.out.println("name");
    gg=k.nextLine();
    z1.name=gg;
    System.out.println("roll");
      gg=k.nextLine();
      z1.roll=gg;
      System.out.println("hall");
        gg=k.nextLine();
       
        
        z1.hall=gg;
        
        
    
    export();
     
     
     
     
     }
    
    
    
    };
    public void remove(String j){
    
    
    if(exist(j)){
        if(j.equals(head.reg)){
        head.hall=null;
        head.name=null;
        head.roll=null;
        head.reg=null;
        head=head.next;
        
        }else{
        
    for(Student t=head,tt=head.next;tt!=null;t=t.next,tt=tt.next){
    if(j.equals(tt.reg)){
    tt.hall=null;
        tt.name=null;
        tt.roll=null;
        tt.reg=null;
        t.next=tt.next;
        tt.next=null;
    
    }
    
    
    }}
    export();
    }
    
    };
    public void show(String reg){
    Student g=at(reg);
    System.out.println("Reg = "+g.reg);
      System.out.println("Name = "+g.name);
      System.out.println("Holl = "+g.hall);
      System.out.println("Role = "+g.roll);
    
    
    }
    public void showAll(){
    
    
    for(Student t=head;t!=null;t=t.next){
  System.out.println("Reg = "+t.reg);
      System.out.println("Name = "+t.name);
      System.out.println("Holl = "+t.hall);
      System.out.println("Role = "+t.roll);
  
      
    
    
    }}
    
    public Student at(String reg){
    Student x;
    for(Student t=head;t!=null;t=t.next){
    if(reg.equals(t.reg)){
   
    Student jj=t;
    return jj;
    }
    
    }
    
    System.out.println("Wrong reg found controller/at");
    System.out.println("enter new reg");
    reg=k.nextLine();
    x=at(reg);
    return x;
    
    }
    public boolean exist(String reg){
    for(Student t=head;t!=null;t=t.next){
    if(reg.equals(t.reg)){
        return true;
        
    }}
        return false;
    
    }
    
    
}
