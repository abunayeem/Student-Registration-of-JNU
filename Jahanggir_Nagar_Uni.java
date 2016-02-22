/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jahanggir_nagar_uni;
import java.util.*;
/**
 *
 * @author user
 */
public class Jahanggir_Nagar_Uni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        controller r=new controller();
        //r.showAll();
        Scanner k=new Scanner(System.in);
        String a,b,c,d;
        String e="22213";
        c="12345";
        String rr="";
        System.out.println("enter login id");
        a=k.nextLine();
        System.out.println("enter login passward");
        b=k.nextLine();
        for(int t=0;!"s".equals(rr);){
        
        
        
        if( b.equals(c)){
        System.out.println("to chek information enter reg or enter passward to update");
         d=k.nextLine();
         if(d.equals(e)){
          System.out.println("press r to register new student");
           System.out.println("press x to remove");
            System.out.println("press u to modify");
            String o=k.nextLine();
            if(o.equals("r")){
            
            r.register();
            
            
            
            }
            else if(o.equals("x")){
            System.out.println("please enter reg");
            String asd=k.nextLine();
            r.remove(asd);
            
            }
            else if(o.equals("u")){r.update();}
            else{System.out.println("wrong entry try agen");}
         
         
         }else{
             String pk=k.nextLine();
         r.show(pk);
         
         }
            
            System.out.println("to try agen press any or to stop press s");
        rr=k.nextLine();
            
            
        
        }else {
        
        System.out.println("Wrong password or id");
        System.out.println("to try agen press any or to stop press s");
        rr=k.nextLine();
        
        }}
        
        
        
        
    }
}
