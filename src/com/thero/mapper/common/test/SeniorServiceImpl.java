package com.thero.mapper.common.test;

import java.io.Serializable;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public abstract class SeniorServiceImpl<T, PK extends Serializable> implements
		SeniorService<T, PK> {
	private static Logger logger = LoggerFactory.getLogger(SeniorServiceImpl.class);

	protected abstract SeniorDao<T, PK> getDao();

	
	/**
	 * example 根据example统计条数
	 * @param CommonExample 根据example来查询个数
	 * @return int 统计条数
	 * @author thero  
	 */
	@Override
	public int countByExample(CommonExample example) {
		return this.getDao().countByExample(example);
	}

	/**
	 * example 根据example查询删除
	 * @param CommonExample 根据example来查询个数
	 * @return int 删除条数
	 * @author thero  
	 */
	@Override
	public int deleteByExample(CommonExample example) {
		return this.getDao().deleteByExample(example);
	}

	/**
	 * example 根据主见删除数据
	 * @param PK 主键
	 * @return int 删除条数
	 * @author thero  
	 */
	@Override
	public int deleteByPrimaryKey(PK pk) {
		return this.getDao().deleteByPrimaryKey(pk);
	}

	/**
	 * example 插入数据，不能判断字段是否为空
	 * @param T 实体类
	 * @return int 删除条数
	 * @author thero  
	 */
	@Override
	public int insert(T record) {
		return this.getDao().insert(record);
	}

	/**
	 * example 选择性插入为空不插入数据
	 * @param T 实体类
	 * @return int 删除数据
	 * @author thero  
	 */
	@Override
	public int insertSelective(T record) {
		return this.getDao().insertSelective(record);
	}

	/**
	 * example 根据Example查询数据
	 * @param CommonExample 根据example来查询个数
	 * @return List<T> 查询结果集
	 * @author thero  
	 */
	@Override
	public List<T> selectByExample(CommonExample example) {
		return this.getDao().selectByExample(example);
	}

	/**
	 * example 根据id查询数据
	 * @param PK 主键
	 * @return T 查询实体类
	 * @author thero  
	 */
	@Override
	public T selectByPrimaryKey(PK pk) {
		return this.getDao().selectByPrimaryKey(pk);
	}

	/**
	 * example 根据example更新数据，选择性插入数据
	 * @param T 实体类
	 * @param CommonExample 查询条件
	 * @return int 更新条数
	 * @author thero  
	 */
	@Override
	public int updateByExampleSelective(T record, CommonExample example) {
		return this.getDao().updateByExampleSelective(record, example);
	}

	/**
	 * example 根据example更新数据
	 * @param T 实体类
	 * @param CommonExample 查询条件
	 * @return int 更新条数
	 * @author thero  
	 */
	@Override
	public int updateByExample(T record, CommonExample example) {
		return this.getDao().updateByExample(record, example);
	}

	/**
	 * example 根据id选择性更新数据
	 * @param T 实体类
	 * @return int 更新条数
	 * @author thero  
	 */
	@Override
	public int updateByPrimaryKeySelective(T record) {
		return this.getDao().updateByPrimaryKeySelective(record);
	}

	/**
	 * example 根据主键更新数据
	 * @param T 实体类
	 * @return int 更新条数
	 * @author thero  
	 */
	@Override
	public int updateByPrimaryKey(T record) {
		return this.getDao().updateByPrimaryKey(record);
	}
}
