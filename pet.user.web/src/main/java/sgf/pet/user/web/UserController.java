package sgf.pet.user.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import sgf.pet.common.enums.CommonExceptionEnums;
import sgf.pet.user.api.UserService;
import sgf.pet.user.entity.User;

/**
 * 
 * @ClassName: UserController 
 * @Description: TODO
 * @author: sgf
 * @date: 2019年1月23日 下午4:42:31
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ApiOperation("用户注册")
	@ApiResponses({ @ApiResponse(code = 200, message = "操作成功", response = ResponseEntity.class),
			@ApiResponse(code = -300, message = "用户名已经存在", response = ResponseEntity.class) })
	@PostMapping("/register")
	public ResponseEntity<String> register(User user){
		int result = userService.createUser(user);
		if (result == CommonExceptionEnums.EXIST_USER_NAME.getId()) {
			return new ResponseEntity<>("用户名已经存在！", HttpStatus.BAD_REQUEST);
		}
		if (result > 0) {
			return new ResponseEntity<>("注册成功！", HttpStatus.OK);
		}else{
			return new ResponseEntity<>("注册失败！", HttpStatus.BAD_REQUEST);
		}
	}
	
}

