package com.bezama.tutoriel.forms;

import java.util.List;

import javax.validation.Valid;
import com.bezama.tutoriel.bean.ModificationCourse;

public class ModificationForm {

    @Valid
    private List<ModificationCourse> listeCourses;

    public void setListeCourses(final List<ModificationCourse> pListeCourses) {
        listeCourses = pListeCourses;
    }

    public List<ModificationCourse> getListeCourses() {
        return listeCourses;
    }
}