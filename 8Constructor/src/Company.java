
public class Company {
	
	public static void main (String[] args) {
		
		double highestSalary = 0;

		Employee avySir= new Employee();
		avySir.name = "Avy";
		avySir.age = 15;
		avySir.designation = "CEO";
		avySir.salary = 3421008;
		
		Employee vijay = new Employee();
		vijay.name = "Vijay";
		vijay.age = 42;
		vijay.designation = "CFO";
		vijay.salary = 1542000;
		
		Employee boberman = new Employee();
		boberman.name = "Boberman";
		boberman.age = 15;
		boberman.designation = "manager";
		boberman.salary = 130000;
		
		Employee[] employees = new Employee[3];
		employees[0] = avySir;
		employees[1] = vijay;
		employees[2] = boberman;
		
	}
		public static double greatestSalary(double num) {
			for (int i = 0; i <= 3; i++) {
				if (employees[i] > highestSalary) {
					highestSalary = employees[i];
				}
				
		
			}
		}
	}
