package basic.firstProgram;

public class methods {


    void twoTable(){

            for(int i=0;i <= 10;i++){
                System.out.println(2*i);
            }
    }

    // method overloading
    static int add(int a,int b){
        return a + b;
    }

    static int add(int a,int b, int c){
        return a + b + c;
    }
    
    public static void main(String[] args){

        methods m = new methods();
        // m.twoTable();
        int sum = add(1,10);

        System.out.println("ans : " + sum);
    }
}
