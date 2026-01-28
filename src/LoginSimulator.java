import java.util.*;
class LoginSimulator {
    public static void main(String[] args) {
        int account_index = 0;
        ArrayList<String> usernames = new ArrayList<>(Arrays.asList("hmzs7d721","hsyed0915","abrabutt2000","ysyed","kmustafa","mustafaa"));
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("Indeed","Slenderman","Basketball","Joseph","kmsgrade4","Welcome1"));
        int login_attempts = 4;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Username, or type NEW to create account:");
        String L = s.nextLine();
        if(L.equals("NEW")){
            System.out.print("Create New Username:");
            L = s.nextLine();
            usernames.add(L);
            System.out.print("Create New Password:");
            L = s.nextLine();
            passwords.add(L);
            System.out.println("Account Created");
            System.out.print("Enter Username, or type NEW to create account:");
            L = s.nextLine();
            if(L.equals("NEW")){
            System.out.print("Create New Username:");
            L = s.nextLine();
            usernames.add(L);
            System.out.print("Create New Password:");
            L = s.nextLine();
            passwords.add(L);
            System.out.println("Account Created");
            System.out.print("Enter Username, or type NEW to create account:");
            L = s.nextLine();
            }
        }
        
        boolean usernameIsValid = false;
        for(int i = 0; i < usernames.size(); i++){
            if(usernames.get(i).equalsIgnoreCase(L)){
                account_index = i;
                usernameIsValid = true;
            }
    }
        while(usernameIsValid == false){
            System.out.println("Username not found. Try again.");
            System.out.print("Enter Username, or type NEW to create account:");
            L = s.nextLine();
            if(L.equals("NEW")){
            System.out.print("Create New Username:");
            L = s.nextLine();
            usernames.add(L);
            System.out.print("Create New Password:");
            L = s.nextLine();
            passwords.add(L);
            System.out.println("Account Created");
            System.out.print("Enter Username, or type NEW to create account:");
            L = s.nextLine();
            if(L.equals("NEW")){
            System.out.print("Create New Username:");
            L = s.nextLine();
            usernames.add(L);
            System.out.print("Create New Password:");
            L = s.nextLine();
            passwords.add(L);
            System.out.println("Account Created");
            System.out.print("Enter Username, or type NEW to creat account:");
            L = s.nextLine();
            }
        }
        for(int i = 0; i < usernames.size(); i++){
            if(usernames.get(i).equalsIgnoreCase(L)){
                account_index = i;
                usernameIsValid = true;
                }
            }
        }
        System.out.print("Password:");
        String J = s.nextLine();
        boolean passwordIsValid = false;
            if(passwords.get(account_index).equals(J)){
                passwordIsValid = true;
            }
        while(passwordIsValid == false){
            System.out.println("Incorrect Password!");
            System.out.println(login_attempts + " attempts remaning");
            System.out.print("Password:");
            J = s.nextLine();
            if(passwords.get(account_index).equals(J)){
                passwordIsValid = true;
            }
            login_attempts--;
            if(login_attempts <= 0 && passwordIsValid == false){
                 System.out.println("Too many failed attempts. Try again later");
                 System.exit(0);
            }
           
        }
        System.out.println("Access Granted");
        
    }
}