package practicalTaskOne;

public class Department {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void print() {
        System.out.println("~The department name is: " + name);
        System.out.println("~The address is: " + address.city + ", " + address.street + ", " + address.buildingNumber);
    }

    @Override
    public String toString() {
        return "Department: " + name + "\n" + address;
    }

    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int buildingNumber;

        public Address(String city, String street, int buildingNumber) {
            this.city = city;
            this.street = street;
            this.buildingNumber = buildingNumber;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        @Override
        protected Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        public String toString() {
            return "Address: " + buildingNumber + " " + street + ", " + city;
        }
    }
}