class Mammals{
    void mam(){
        System.out.println("Inside mammals class");
    }
}

//child class
class Lion extends Mammals{
    void roar(){
        System.out.println("inside lion class");
    }
}
//child
class Human extends Mammals{
    void hum(){
        System.out.println("Inside human");
    }
}

public class Main {
   public static void main(String[] args) {
    Lion obj=new Lion(); //object of child of child class
    obj.hum(); //this will result in error to run we have to create object of Human
    obj.roar();
    obj.mam();
   }    
}
