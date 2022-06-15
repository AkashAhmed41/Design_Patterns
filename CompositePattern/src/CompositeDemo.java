public class CompositeDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Rahim", "CEO", 50000);
        Employee headSales = new Employee("Rafid","Head of Sales", 30000);
        Employee salesman1 = new Employee("Raisul", "Salesman", 20000);
        Employee salesman2 = new Employee("Akash", "Salesman", 20000);
        Employee headMarketing = new Employee("Nihal", "Head of Marketing", 35000);
        Employee kamla1 = new Employee("Abid", "Marketing", 15000);
        Employee kamla2 = new Employee("Navid", "Marketing", 15000);

        ceo.add(headMarketing);
        ceo.add(headSales);

        headSales.add(salesman1);
        headSales.add(salesman2);

        headMarketing.add(kamla1);
        headMarketing.add(kamla2);

        System.out.println(ceo);
        for(Employee headEmployee: ceo.getEmployeeList()){
            System.out.println(headEmployee.toString());
            for(Employee employee: headEmployee.getEmployeeList())
                System.out.println(employee.toString());
        }
    }
}
