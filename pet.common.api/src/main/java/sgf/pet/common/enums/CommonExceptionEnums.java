package sgf.pet.common.enums;

/** 
 * @ClassName: CommonExcetion 
 * @Description: TODO
 * @author: sgf
 * @date: 2019年1月23日 下午5:36:27  
 */
public enum CommonExceptionEnums {
	EXIST_USER_NAME(-300, "用户名已经存在");
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private CommonExceptionEnums(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
