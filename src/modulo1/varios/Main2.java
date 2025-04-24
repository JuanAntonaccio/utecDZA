package modulo1.varios;

public class Main2 {
    public static void main(String[] args) {
        String palabra="roma";
        int i=palabra.length()-1;
        String result="";
        do{
           //result=result+palabra.charAt(i);
           result=palabra.charAt(i)+result;
           i--;
        }while(i>=0);
        System.out.println(result);
    }
}
