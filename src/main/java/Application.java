public class Application {
    /**
     * Main method for manually testing your code.
     * Changes made here will not impact your test cases.
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        CarModel carModel = new CarModel("yotoya", "macry", 2007);
        System.out.println("Here's the serialization of the 2007 yotoya macry: ");
        String serialized = lab.serializer(carModel);
        System.out.println(serialized);
        System.out.println("Now attempting deserialization.");
        CarModel deserialized = lab.deserializer(serialized);
        boolean equal = deserialized.equals(carModel);
        if(equal){
            System.out.println("The deserialized car was the same as the serialized car. success!");
        }else{
            System.out.println("The deserialized car was not the same as the serialized car. failure!");
        }
    }
}
