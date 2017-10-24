package com.bezama.tutoriel.dao;
import java.util.List;
import com.bezama.tutoriel.bean.Course;
public interface ListesCoursesDAO {
	 List<Course> rechercherCourses();
	 void creerCourse(final Course pCourse);
	 void supprimerCourse(final Course pCourse);
	 void modifierCourse(final Course pCourse);
}

