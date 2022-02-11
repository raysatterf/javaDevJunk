public class NumberJazz {
    public static void main (String[] args) {
        String something = "42";
        // convert user string input to an integer
        int userNumberPrimitive = Integer.parseInt(something); // declare var with primitive type 'int'; parseInt method returns an int
        // Integer userNumberPrimitive = Integer.valueOf(userText); declare var with 'Integer' class; valueOf method returns Integer

        double someNumber = (double) 1/2; // convert integer into double with a 'type-cast'/'narrow-cast' operation
        System.out.println(someNumber);
    }
}
