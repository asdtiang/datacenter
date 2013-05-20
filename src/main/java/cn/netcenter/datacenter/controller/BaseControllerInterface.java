package cn.netcenter.datacenter.controller;

/**
 * 申明基本的crud方法
 * @author Administrator
 */
public interface BaseControllerInterface {
	
	/**
	 * 创建
	 * @return
	 */
	public String save() ;
	/**
	 * 更新
	 * @return
	 */
	public String update() ;
	/**
	 * 删除
	 * @return
	 */
	public String delete();
	/**
	 * 展示
	 * @return
	 */
	public String show();
	/**
	 * 分页
	 * @return
	 */
	public String list();
}
