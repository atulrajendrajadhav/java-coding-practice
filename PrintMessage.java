class PrintMessage {
    public static void main(String[] args) {
        messageIs();
        String message = message1();
        System.out.println(message);
       
        
    }
    // method is not retern any value
    public static void messageIs(){
        System.out.println("Hi i am learning a method");
    }
    
    // method is return String 
    public static String message1(){
        String message = "Method is easy";
        return message;
    }
}