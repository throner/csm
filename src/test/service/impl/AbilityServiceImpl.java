package test.service.impl;

import test.test.entity.Ability;
import test.test.mapper.AbilityMapper;
import test.test.service.IAbilityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 开放能力表 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2017-03-10
 */
@Service
public class AbilityServiceImpl extends ServiceImpl<AbilityMapper, Ability> implements IAbilityService {
	
}
