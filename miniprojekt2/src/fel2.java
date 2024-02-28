import java.util.Scanner;

public class fel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kerek egy szot");
        String szo = scanner.nextLine();
        String csillagszo="";
        for(int i=0;i<szo.length();i++){
            if(szo.charAt(i)=='a' || szo.charAt(i)=='A'){
                csillagszo+="*";
            }else {
                csillagszo+=szo.charAt(i);
            }
        }
        System.out.println(csillagszo);

        scanner.close();
    }
}
