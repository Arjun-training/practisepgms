package default1;

class Department {
    Integer deptId;
    String departmentName;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	 Department(Integer deptId,
             String departmentName) {
      this.deptId = deptId;
      this.departmentName = departmentName;
  }
}
