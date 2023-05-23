public class Employea {

    String name ;
    int salary;
    int workHours;
    int hireYear;

    Employea(String name , int salary , int workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours=workHours;
        this.hireYear = hireYear;
    }

    // Tax maaşa uygulanacak vergiyi hesaplicak
    public double tax(){
            double tax =0.0;
        if (this.salary <= 1000){
            tax = this.salary;

        } else if (this.salary > 1000) {
            tax = this.salary - 0.3*this.salary;
        }
        return tax;

    }


    public double bonus(){
        double bonus=0.0;
        if(workHours - 40 <= 0){
            bonus = this.salary;
        }else{
            int a = (workHours - 40) *30;
            bonus = a + this.salary;
        }

        return bonus;

    }

    public double raiseSalary(){
        double raiseSalary = 0.0;
        if((2022 - this.hireYear)<10){
            raiseSalary= 0.05*this.salary + this.salary;
        }else if(((2022 - this.hireYear) >=10 ) && ((2022 - this.hireYear)<20)){

            raiseSalary= 0.1*this.salary + this.salary;
        }else{
            raiseSalary=0.15*this.salary + this.salary;
        }

        return  raiseSalary;

    }

    public double totalSalary(){

         double totalSalary = 0;

         totalSalary = tax() + bonus() + raiseSalary();

        return totalSalary;
    }

    // çalılanlara ait bilgiler ekrana bastırılıcak.
    void stringPrinte(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + totalSalary());
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
    }
}
