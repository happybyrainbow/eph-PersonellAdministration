public class MainProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee("Maksym", "Turianskyi", "2007.04.23", 'r', 61, 58.4, "C2", 1500, 0, "Verschwendet 4 Stunden seines Lebens für eine Schach Partie" );
        e1.setDepartment("D12");
        System.out.println("Name: " + e1.getName() +  "\nNachname: " + e1.getSurname()  + "\nGeburtstag: " + e1.getBirthday() + "\nGeschlecht: " + e1.getGender() + "\nAlter: " + e1.getAge() + "\nGewicht: " + e1.getWeight() + "\nAbteilung: " + e1.getDepartment() + "\nGehalt: " + e1.getSalary() + "\nDienstjahre: " + e1.getYearsOfService() + "\nBesonderheiten: " + e1.getSpecialties());

        if(e1.getAge()>60){
            System.out.println("\nGeh in Rente");
        }
        if(e1.getGender() != 'm' && e1.getGender() != 'w' && e1.getGender() != 'd'){
            System.out.println("Bist du ein Einhorn oder what");
        }
    }
}