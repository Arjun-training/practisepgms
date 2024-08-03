package default1;

class Employee1 {
    Integer empId;
    String empName;
    Long salary;
    String email;
    Department department;
    
    Employee1(Integer empId,
            String empName,
            Long salary,
            String email,
            Department department) {
       this.empId = empId;
       this.empName = empName;
       this.salary = salary;
       this.email = email;
       this.department = department;
   }
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
