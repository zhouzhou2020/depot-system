package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.dto.CouponData;
import com.depot.ex.admin.entity.Coupon;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2018��1��2�� ����8:22:12 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */

public interface CouponDao extends BaseDao<Coupon>{

	List<CouponData> findAllCoupon(@Param("page")int page, @Param("size")int size, @Param("name")String name);

	int findAllDepotcardCount(@Param("name")String name);

	Coupon findCouponById(int id);

	void deleteCoupon(@Param("id")Integer id);

	List<CouponData> findAllCouponByCardNum(@Param("cardnum")String cardnum,@Param("name")String name);

	void updateCardnum(@Param("cardnum")String cardnum, @Param("cardnumNew")String cardnumNew);

	void addCoupon(Coupon coupon);

}