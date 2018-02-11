package com.depot.ex.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depot.ex.admin.dao.EmailDao;
import com.depot.ex.admin.dto.EmailData;
import com.depot.ex.admin.entity.Email;
import com.depot.ex.admin.service.EmailService;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2018��1��2�� ����8:21:29 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
@Service()
public class EmailServiceImpl implements EmailService{

	@Autowired
	private EmailDao emailDao;
	public void addEmail(Email email) {
		emailDao.addEmial(email);
	}
	public Email findById(int id) {
		return emailDao.findById(id);
	}
	public void updateManReadById(int id) {
		emailDao.updateManReadById(id);
	}
	public List<EmailData> findByUserId(int page,int size,int id,int role,String content) {
		return emailDao.findByUserId(page,size,id,role,content);
	}
	public int findAllEmailCountByUser(int uid,int role) {
		return emailDao.findAllEmailCountByUser(uid,role);
	}
	public void updateEmail(Email email) {
		emailDao.updateEmail(email);
	}

}