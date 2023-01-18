package pro.wings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.wings.dao.TeacherDao;
import pro.wings.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherDao dao;

	@Override
	public void createTeacher(Teacher teacher) {
		dao.createTeacher(teacher);
		
	}

	@Override
	public void deleteTeacher(int id) {
		dao.deleteTeacher(id);
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		dao.updateTeacher(teacher);
		
	}

	@Override
	public List<Teacher> getTeacher() {
		
		return dao.getTeacher();
	}

	@Override
	public Teacher getTeacher(int id) {
		
		return dao.getTeacher(id);
		
	}

	@Override
	public List<Teacher> getAllTeacher(long phone) {
		
		return dao.getAllTeacher(phone);
	}

	


	
	

}
