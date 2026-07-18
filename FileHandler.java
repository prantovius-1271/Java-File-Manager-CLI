import java.util.*;
public class FileHandler{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the file handler.");
        System.out.println("Enter your choice");
        System.out.println("1.Create\n2.Write into a file\n3.Extract data from a file\n4.Copy file to another location\n5.Delete the file");
        
        boolean check=true;
        while(check){
            int ch=accept(sc);
            switch(ch){
                case 1: CreateN.create(sc); check=false;
                    break;
                case 2: WriteN.write(sc); check=false;
                    break;
                case 3: ExtractN.extract(sc); check=false;
                    break;
                case 4: TransferN.relocate(sc); check=false;
                    break;
                case 5: DeleteN.delete(sc); check=false;
                    break;
                default: System.out.println("invalid choice");
            }
        }

        sc.close();
    }   
    
    private static int accept(Scanner sc){
        while(true){
            try{
                int ch=sc.nextInt();
                sc.nextLine();
                return ch;
            }
            catch(InputMismatchException e){
                System.out.println("Enter an integer value");
                sc.nextLine();
            }
        }
    }
    
}


