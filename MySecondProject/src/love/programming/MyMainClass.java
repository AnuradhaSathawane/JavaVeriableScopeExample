package love.programming;

public class MyMainClass {
    public static void main(String[] args) {
        Person personObject1 = new Person();
        Person personObject2 = new Person();
        Person personObject3 = new Person();
        Person personObject4 = new Person();
 personObject1.setFirstName("Anuradha");
        personObject2.setFirstName("Anuradha1");
        personObject3.setFirstName("Anuradha2");
        personObject4.setFirstName("Anuradha3");
        personObject1.setLastName("sathwani");
        personObject2.setLastName("sathwani1");
        personObject3.setLastName("sathwani2");
        personObject4.setLastName("sathwani3");
        System.out.println(personObject1.getFirstName()+personObject1.getLastName());

    }
}
