package bank;

class Account {
    public String name;
    protected String email; // toh email jo info hai isse sirf doosre package mein sub classes hi access kar paa rhi hongi aur current package mein koi bhi access kar sakta hai
    private String password;

    // Getters and Setters 
    // getter
    public String getPassword(){
        return this.password; 
    }
    // setter
    public void setPassword(  String pass ){
        this.password = pass;
    }

}

// bank class account class ki private cheezo ko access nahi kar sakta

class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apna@college.edu";
        // account1.password = "password123"; // private access karega, error dikhega idhar
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

        System.out.println(account1.name);
    }
}
