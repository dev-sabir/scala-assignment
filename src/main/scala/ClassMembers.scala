class Employee {

  //Why we're not able to do this??
  //private var salary:Int
    private var salary:Int=0;
   protected val empName="David"
   protected val empDepartment="Sales"

  def setSalary(sal:Int): Unit ={
    salary = sal
  }

  def getSalary(): Int={
    salary
  }
}

class EmpData extends Employee{

  def empData(): String ={
    s"Employee Name: ${empName} \nEmployee Department: ${empDepartment}"
  }
}

object EmpDetails {

  def main(args: Array[String]): Unit ={

    val hr = new Employee()
    hr.setSalary(100000)

    println(hr.getSalary())

    val data = new EmpData
    println(data.empData())
  }



}
