package objectarrays;


public class Person implements Comparable <Person>{

    private Long ssn,phoneNumber;
    private double height,weight;
    public Long getSsn() {
        return ssn;
    }
    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Person(Long ssn, Long phoneNumber, double height, double weight) {
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Person){
            Person newPerson = (Person) other;
            return this.ssn == newPerson.ssn;
        }
        return false;
    }
    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }



}
