package cn.netcenter.datacenter.service;

public interface ShareService {
	/**
	 * 持久化object
	 * @param object
	 */
    void save(Object object);
    /**
	 * 删除object
	 * @param object
	 */
    void delete(Object object);
    /**
	 * 更新object
	 * @param object
	 */
    void update(Object object);
    /**
	 * 查找
	 * @param object
	 */
    <T> T find(Class<T> classType,Integer id);
}
