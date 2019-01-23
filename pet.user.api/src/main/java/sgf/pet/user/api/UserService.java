package sgf.pet.user.api;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import sgf.pet.user.entity.User;
import sgf.pet.user.vo.UserVo;

/**
 * 
 * @ClassName: UserService 
 * @Description: 用户接口
 * @author: sgf
 * @date: 2019年1月23日 下午4:37:47
 */
public interface UserService extends IService<User> {
	/**
	 * 
	 * @Description: 添加用户 
	 * @param user
	 * @return int
	 * @author sgf
	 */
	int createUser(User user);
	
	/**
	 * 
	 * @Description: 查询用户数量
	 * @param user
	 * @return int
	 * @author sgf
	 */
	int countUserByCondition(UserVo user);
	
	/**
	 * 
	 * @Description: 查询所有用户
	 * @param user
	 * @return List<User>
	 * @author sgf
	 */
	List<User> findUserByCondition(UserVo user);
	
	/**
	 * 
	 * @Description: 根据id查询用户信息 
	 * @param id
	 * @return User
	 * @author sgf
	 */
	User findUserById(Integer id);
	
	/**
	 * 
	 * @Description: 根据用户名查询用户信息 
	 * @param username
	 * @return User
	 * @author sgf
	 */
	User findUserByUserName(String userName);
	
	/**
	 * 
	 * @Description: 修改用户信息
	 * @param user int
	 * @author sgf
	 */
	int updateUser(User user);
	
	/**
	 * 
	 * @Description: 修改用户状态
	 * @param user int
	 * @author sgf
	 */
	int updateUserStatus(UserVo user);
}
