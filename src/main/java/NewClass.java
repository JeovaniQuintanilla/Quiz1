
public class NewClass implements MyMath{
    


    @Override
    public int getCube(int b) {
        return b*b*b;
    }
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        int b =0;
        System.out.print("The cube of " + nc.getCube(b));
        
        
    }
    
    
    
    
}
