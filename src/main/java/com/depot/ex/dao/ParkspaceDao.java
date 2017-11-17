package com.depot.ex.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.entity.ParkSpace;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年10月7日 下午4:56:15 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface ParkspaceDao extends BaseDao<ParkSpace>{
	
	public void save(ParkSpace parkSpace);
	
	public int findMaxSpace();
	
	public List<ParkSpace> findAllParkspace();
	
	public void changeStatus(@Param("id")int id,@Param("status")int status);
	
}
