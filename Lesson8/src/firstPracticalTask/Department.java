package firstPracticalTask;

public class Department {
    private String name;
    public Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        System.out.println("Department: " + name);
        return "The address is: " + address.city + ", " + address.street + ", " + address.buildingNumber;
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

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        public void setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
        }

        @Override
        public String toString() {
            return "Address: city= " + city + ", street='" + street + ", buildingNumber=" + buildingNumber;
        }

        @Override
        protected Object clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException exception) {
                exception.printStackTrace();
                return null;
            }
        }
    }
}