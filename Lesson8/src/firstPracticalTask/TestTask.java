package firstPracticalTask;

public class TestTask {
    public static void main(String[] args) {
        Department.Address departmentAddress= new Department.Address("Lviv","Sadova",2);
        Department department1=new Department("Softserve",departmentAddress);
        Department department2=new Department(department1.getName(), (Department.Address)
                department1.getAddress().clone());


        System.out.println(department1);
        System.out.println(department2);

        System.out.println("---------------------------------");
        department2.getAddress().setCity("Ivano-Frankivsk");
        department2.getAddress().setStreet("Ukrainskoi Peremohy");
        department2.getAddress().setBuildingNumber(23);

        System.out.println(department2);
        System.out.println(department1);
    }
}
