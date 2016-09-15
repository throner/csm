package test.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Service;
import test.mapper.StaffManagerMapper;
import test.mapper.StaffManagerSqlProvider;
import test.pojo.StaffManager;
import test.pojo.StaffManagerExample;

import javax.annotation.Resource;

/**
 * Created by chenjiansheng on 2016-4-26.
 */
@Service
public class StaffService {
    @Resource(name="sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;
    public boolean addStaff(String userId) {
        boolean bResult = false;
        try{
            StaffManagerSqlProvider staffManagerSqlProvider = new StaffManagerSqlProvider();
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StaffManagerMapper staffManagerMapper = sqlSession.getMapper(StaffManagerMapper.class);
            //staffManagerExample用于封装where,order条件
            //and
            StaffManagerExample staffManagerExample = new StaffManagerExample();
            StaffManagerExample.Criteria criteria = staffManagerExample.createCriteria();
            criteria.andStaffNameLike("李%");
            //or
            StaffManagerExample.Criteria criteria1 = staffManagerExample.createCriteria();
            criteria1.andStaffNameLike("张%");
            staffManagerExample.or(criteria1);

            int iCount = staffManagerMapper.countByExample(staffManagerExample);
            System.out.print("iCount:"+iCount);


            StaffManager staffManager = new StaffManager();
            staffManager.setStaffId("6666");
            staffManager.setStaffName("李四");
            staffManagerMapper.insert(staffManager);

            sqlSession.commit();
        }catch(Exception ex){
            ex.printStackTrace();;
        }

        bResult = true;
        return bResult;
    }
}
