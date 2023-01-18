package pro.wings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pro.wings.exception.InsufficientDetailsException;
import pro.wings.exception.TeacherNotPresentException;
import pro.wings.model.Teacher;
import pro.wings.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	TeacherService teacherService;

	@PostMapping("/teacher")
	public @ResponseBody String createTeacher(@RequestBody Teacher teacher) throws InsufficientDetailsException {
		
			teacherService.createTeacher(teacher);
			return "Teacher created";
		
		
	}

	@DeleteMapping("/teacher/{id}")
	public @ResponseBody String deleteTeacher(@PathVariable("id") int id) {
		teacherService.deleteTeacher(id);
		return "Successfully deleted";
	}

	@PutMapping("/teacher")
	public @ResponseBody String updateTeacher(@RequestBody Teacher teacher) {
		teacherService.updateTeacher(teacher);
		return "Updated Successfully";
	}

	@GetMapping("/teacher")
	public @ResponseBody List<Teacher> getTeacher() {
		return teacherService.getTeacher();
	}

	@GetMapping("/teacher/{id}")
	public @ResponseBody Teacher getTeacher(@PathVariable("id") int id) throws TeacherNotPresentException {

		Teacher teacher=teacherService.getTeacher(id);
		if(null!=teacher)
		
			return teacher;
		else
			throw new TeacherNotPresentException("Teacher not present with id :"+id);
	}

	@GetMapping("/teacher1")
	public @ResponseBody List<Teacher> getAllTeacher(@RequestParam long phone) {
		
		List<Teacher>t=teacherService.getAllTeacher(phone);
		return t;
	}
	
}
