package final_modifier;

public class final_method {
    // creating final method
    final void final_method(){
        System.out.println("Hello mom");
    }
}

class Code extends final_method{
    // final void final_method(){
        //shows compilation error
    // }
}