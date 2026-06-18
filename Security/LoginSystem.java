class LoginSystem {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please provide username and password.");
        }else{
            String username = args[0];
             String password = args[1];
             String correctUsername="admin";
             String correctPassword="89090";
            if(username.equals(correctUsername)&&password.equals(correctPassword)){
                System.out.println("Login Successful!!");
                System.out.println("Welcome, "+username);
            }else{
                System.out.println("Login Failed!!");
                System.out.println("Invalid username or password.");
            }
        }
    }
}
