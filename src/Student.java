public class Student {
    
    
    public static void main(String[] args) {
       Informations i = new Informations();
       
       System.out.println("Enter your Name: ");
       i.setName();
       System.out.println("Enter your Section: ");
       i.setSection();
       System.out.println("Enter your Motto: ");
       i.setMotto();
       System.out.println("\nSTUDENT'S PROFILE!\n");
       i.Info();
        
    }
    
}