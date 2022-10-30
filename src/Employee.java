public class Employee {
    private String name;
    private String surname;
    private String birthday;
    private char gender;
    private int age;
    private double weight;
    private String department;
    private double salary;
    private int yearsOfService;
    private String specialties;


    public Employee(String name, String surname, String birthday, char gender, int age, double weight, String department, double salary, int yearsOfService, String specialties){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.department = department;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        this.specialties = specialties;

    }

    public String getName(){

        return name;

    }

    public String getSurname(){

        return surname;

    }

    public String getBirthday(){

        return birthday;

    }

    public char getGender(){

        return gender;

    }

    public int getAge(){

        return age;

    }

    public double getWeight(){

        return weight;

    }

    public double getSalary(){

        return salary;

    }

    public int getYearsOfService(){

        return yearsOfService;

    }

    public String getSpecialties(){

        return specialties;

    }

    public String getDepartment(){

        return department;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setAge(int age){

        this.age = age;

    }

    public void setGender(char gender){

        this.gender = gender;

    }

    public void setWeight(double weight){

        this.weight = weight;

    }

    public void setSalary(double salary){

        this.salary = salary;

    }
    public void setDepartment(String department){

        this.department = department;

    }

}