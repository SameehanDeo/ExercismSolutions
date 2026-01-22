class Greeter {

    public static void main(String args[]){
        Greeter greetUser = new Greeter();
        String res = greetUser.getGreeting();
        System.out.println(res);
    }

    String getGreeting() {
        return "Hello, World!";
    }
}
