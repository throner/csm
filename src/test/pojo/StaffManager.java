package test.pojo;

public class StaffManager {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_manager.staff_id
     *
     * @mbggenerated
     */
    private String staffId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_manager.staff_name
     *
     * @mbggenerated
     */
    private String staffName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_manager.dept_id
     *
     * @mbggenerated
     */
    private String deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    public StaffManager(String staffId, String staffName, String deptId) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    public StaffManager() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff_manager.staff_id
     *
     * @return the value of staff_manager.staff_id
     *
     * @mbggenerated
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff_manager.staff_id
     *
     * @param staffId the value for staff_manager.staff_id
     *
     * @mbggenerated
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff_manager.staff_name
     *
     * @return the value of staff_manager.staff_name
     *
     * @mbggenerated
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff_manager.staff_name
     *
     * @param staffName the value for staff_manager.staff_name
     *
     * @mbggenerated
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff_manager.dept_id
     *
     * @return the value of staff_manager.dept_id
     *
     * @mbggenerated
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff_manager.dept_id
     *
     * @param deptId the value for staff_manager.dept_id
     *
     * @mbggenerated
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }
}