package com.bezama.tutoriel.services;
import java.util.List;

import com.bezama.tutoriel.bean.Course;
public interface ServiceListesCourses {
	List<Course> rechercherCourses();
	void creerCourse(final String pLibelle, final Integer pQuantite);
	void supprimerCourse(final Integer pIdCourse);
	void modifierCourses(final List<Course> pListeCourses);
}
