package practicals.p8.task1;

class Department implements Cloneable {
    private String name;
    private Address address;

    public Department ( String name, Address address ) {
        this.name = name;
        this.address = address;
    }

    public Department () {

    }

    public void setAddress ( Address address ) {
        this.address = address;
    }

    public Department setName ( String name ) {
        this.name = name;
        return null;
    }

    public String getName () {
        return name;
    }

    public Address getAddress () {
        return address;
    }


    @Override
    public String toString () {
        return "Department: " + name + "\n" + address.toString( );
    }

    @Override
    public Object clone () {
        try {
            Department cloned = (Department) super.clone( );
            cloned.address = (Address) address.clone( );
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address ( String city, String street, int building ) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity ( String city ) {
            this.city = city;
        }

        public void setStreet ( String street ) {
            this.street = street;
        }

        public void setBuilding ( int building ) {
            this.building = building;
        }

        public String getCity () {
            return city;
        }

        public String getStreet () {
            return street;
        }

        public int getBuilding () {
            return building;
        }

        @Override
        public String toString () {
            return "Address: " + city + ", " + street + " Street, Building " + building;
        }

        @Override
        public Object clone () {
            try {
                return super.clone( );
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }
}