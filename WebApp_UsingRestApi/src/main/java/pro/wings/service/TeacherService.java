package pro.wings.service;

import java.util.List;

import pro.wings.model.Teacher;

public interface TeacherService {

	public void createTeacher(Teacher teacher);

	public void deleteTeacher(int id);

	public void updateTeacher(Teacher teacher);

	public List<Teacher> getTeacher();

	public Teacher getTeacher(int id);

	public List<Teacher> getAllTeacher(long phone);

	

	

}
