package com.bezama.tutoriel.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bezama.tutoriel.bean.Course;
import com.bezama.tutoriel.forms.CreationForm;
import com.bezama.tutoriel.services.ServiceListesCourses;

@Controller
public class CreerListeCoursesController {
	@Autowired
    private ServiceListesCourses service;
	@RequestMapping(value="/afficherCreationListeCourses", method = RequestMethod.GET)
    public String afficher(final ModelMap pModel) {
        final List<Course> lListeCourses = service.rechercherCourses();
        pModel.addAttribute("listeCourses", lListeCourses);
        if (pModel.get("creation") == null) {
            pModel.addAttribute("creation", new CreationForm());
        }
        return "creation";
    }

    @RequestMapping(value="/creerCreationListeCourses", method = RequestMethod.POST)
    public String creer(@Valid @ModelAttribute(value="creation") final CreationForm pCreation, 
            final BindingResult pBindingResult, final ModelMap pModel) {

        if (!pBindingResult.hasErrors()) {
            final Integer lIntQuantite = Integer.valueOf(pCreation.getQuantite());
            service.creerCourse(pCreation.getLibelle(), lIntQuantite);
        }
        return afficher(pModel);
    }

}
