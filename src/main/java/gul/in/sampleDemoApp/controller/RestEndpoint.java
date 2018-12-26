package gul.in.sampleDemoApp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

	@RequestMapping("/course")
	public Course getEndpoint(@RequestParam(value="name", defaultValue="Spring boot", required=false) String name,
							  @RequestParam(value="chapterCount", defaultValue="2", required=false) int chapterCount)
	{
		return new Course(name, chapterCount);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/register/course")
	public String saveCourse(@RequestBody Course course){
		return "your course named "+course.getName()+" with "+course.getChapterCount()+" chapters saved succefully";
	}
	
}
