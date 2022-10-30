
public class MainProgram {
    public static void main(String[] args) {

        Employee e1 = new Employee("Maksym", "Turianskyi", "2007.04.23", 'm', 60, 58.4, "C2", 1500, 0, "Verschwendet 4 Stunden seines Lebens für eine Schach Partie" );

        if(e1.getAge() > 39 & e1.getAge() < 50) {
            e1.setSalary(3000);
        }

        if(e1.getAge() > 49) {
            e1.setSalary(Math.floor(Math.random()* 1000 + 4000));
        }

        if(e1.getAge() > 59) {
            e1.setSalary(e1.getSalary() + 500);
        }

        System.out.println("Name: " + e1.getName() +  "\nNachname: " + e1.getSurname()  + "\nGeburtstag: " + e1.getBirthday() + "\nGeschlecht: " + e1.getGender() + "\nAlter: " + e1.getAge() + "\nGewicht: " + e1.getWeight() + "\nAbteilung: " + e1.getDepartment() + "\nGehalt: " + e1.getSalary() + "\nDienstjahre: " + e1.getYearsOfService() + "\nBesonderheiten: " + e1.getSpecialties());



        Employee e2 = new Employee("Peter", "Knecht", "2060.04.23", 'm', 50, 70, "C3", 1800, 2, "Wird gemobbt aufgrund seines Nachnamens" );

        if(e2.getAge() > 40 & e2.getAge() < 50) {
            e2.setSalary(3000);
        }

        if(e2.getAge() > 49) {
            e2.setSalary(Math.floor(Math.random()* 1000 + 4000));
        }

        if(e2.getAge() > 59) {
            e1.setSalary(e2.getSalary() + 500);
        }

        System.out.println("\nName: " + e2.getName() +  "\nNachname: " + e2.getSurname()  + "\nGeburtstag: " + e2.getBirthday() + "\nGeschlecht: " + e2.getGender() + "\nAlter: " + e2.getAge() + "\nGewicht: " + e2.getWeight() + "\nAbteilung: " + e2.getDepartment() + "\nGehalt: " + e2.getSalary() + "\nDienstjahre: " + e2.getYearsOfService() + "\nBesonderheiten: " + e2.getSpecialties());

//            if(e1.getAge()>60){
//            System.out.println("\nGeh in Rente");
//        }
//        if(e1.getGender() != 'm' && e1.getGender() != 'w' && e1.getGender() != 'd'){
//            System.out.println("Bist du ein Einhorn oder what");
//        }


    }
}