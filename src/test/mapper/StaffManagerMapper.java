package test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import test.pojo.StaffManager;
import test.pojo.StaffManagerExample;

public interface StaffManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @SelectProvider(type=StaffManagerSqlProvider.class, method="countByExample")
    int countByExample(StaffManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @DeleteProvider(type=StaffManagerSqlProvider.class, method="deleteByExample")
    int deleteByExample(StaffManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @Delete({
        "delete from staff_manager",
        "where staff_id = #{staffId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @Insert({
        "insert into staff_manager (staff_id, staff_name, ",
        "dept_id)",
        "values (#{staffId,jdbcType=VARCHAR}, #{staffName,jdbcType=VARCHAR}, ",
        "#{deptId,jdbcType=VARCHAR})"
    })
    int insert(StaffManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @InsertProvider(type=StaffManagerSqlProvider.class, method="insertSelective")
    int insertSelective(StaffManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @SelectProvider(type=StaffManagerSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="staff_id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="staff_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_id", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<StaffManager> selectByExample(StaffManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "staff_id, staff_name, dept_id",
        "from staff_manager",
        "where staff_id = #{staffId,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="staff_id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="staff_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_id", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    StaffManager selectByPrimaryKey(String staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @UpdateProvider(type=StaffManagerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StaffManager record, @Param("example") StaffManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @UpdateProvider(type=StaffManagerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StaffManager record, @Param("example") StaffManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @UpdateProvider(type=StaffManagerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StaffManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_manager
     *
     * @mbggenerated
     */
    @Update({
        "update staff_manager",
        "set staff_name = #{staffName,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=VARCHAR}",
        "where staff_id = #{staffId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(StaffManager record);
}