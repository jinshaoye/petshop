package sgf.pet.user.dao;



import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import sgf.pet.user.entity.User;

/**
 * 
 * @ClassName: UserMapper 
 * @Description: TODO
 * @author: sgf
 * @date: 2019年1月23日 下午4:41:12
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
