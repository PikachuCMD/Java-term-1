 class Place {
    String name;
    String address;
    String province;
    Place(String name,String address,String province)
    {
        this.name=name;
        this.address=address;
        this.province=province;
    }
    String getName() {
        return name;
    }
    String getAddress() {
        return address;
    }
    String getProvince() {
        return province;
    }
    @Override
    public String toString() {
       return name+", "+address+", "+province;
    }
 
    boolean equals(Place obj) {
       return obj.getName().equals(name);
   }
}
