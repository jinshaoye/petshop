/**   
 * 
 * @Package: sgf.pet.user.vo 
 * @author: sgf   
 * @date: 2019年1月18日 下午3:43:03 
 */
package sgf.pet.user.vo;

import sgf.pet.user.entity.User;

/**
 * 
 * @ClassName: UserVo 
 * @Description: TODO
 * @author: sgf
 * @date: 2019年1月23日 下午4:41:50
 */
public class UserVo extends User {
	/**
	 * pageIndex
	 */
	private Integer pageIndex;

	/**
	 * 页面大小
	 */
	private Integer pageSize;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
