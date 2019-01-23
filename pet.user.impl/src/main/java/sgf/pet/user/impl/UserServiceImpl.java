package sgf.pet.user.impl;

import sgf.pet.common.enums.CommonExceptionEnums;
import sgf.pet.user.api.UserService;
import sgf.pet.user.dao.UserMapper;
import sgf.pet.user.entity.User;
import sgf.pet.user.vo.UserVo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


/**
 * 
 * @ClassName: UserServiceImpl 
 * @Description: 用户接口实现类
 * @author: sgf
 * @date: 2019年1月23日 下午4:41:21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int createUser(User user) {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("USER_NAME", user.getUserName());
		User isExistUser = userMapper.selectOne(queryWrapper);
		if (null == isExistUser) {
			return userMapper.insert(user);
		}
		return CommonExceptionEnums.EXIST_USER_NAME.getId();
	}

	@Override
	public int countUserByCondition(UserVo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findUserByCondition(UserVo user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserStatus(UserVo user) {
		return 0;
	}

}
