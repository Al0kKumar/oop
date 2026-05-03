package basic.firstProgram;

public class methods {


    void twoTable(){

            for(int i=0;i <= 10;i++){
                System.out.println(2*i);
            }
    }
    
    public static void main(String[] args){

        methods m = new methods();
        m.twoTable();
        System.out.println("Methods ");
    }
}
