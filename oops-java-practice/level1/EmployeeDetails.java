public class EmployeeDetails {

   public static class Employee {
      String Name;
      int id;
      int salary;

      public Employee(String var1, int var2, int var3) {
         this.Name = var1;
         this.id = var2;
         this.salary = var3;
      }

      public void DisplayDetails() {
         System.out.println("Name of Employee is : " + this.Name);
         System.out.println("Id of Employee is : " + this.id);
         System.out.println("Salary of Employee is : " + this.salary);
      }

      public static void main(String[] var0) {
         Employee var1 = new Employee("Ayushi", 1, 999999);
         Employee var2 = new Employee("Ayush", 2, 1500000);
         Employee var3 = new Employee("Ayu", 3, 2000000);
         System.out.println("============ Employee 1 =========");
         var1.DisplayDetails();
         System.out.println("============ Employee 2 =========");
         var2.DisplayDetails();
         System.out.println("============ Employee 3 =========");
         var3.DisplayDetails();
      }
   }
}