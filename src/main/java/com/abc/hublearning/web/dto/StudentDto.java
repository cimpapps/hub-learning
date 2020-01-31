package com.abc.hublearning.web.dto;

import java.util.List;

public class StudentDto {
    private List<Long> coursesIds;
    private Long idUser;

    public List<Long> getCoursesIds() {
        return coursesIds;
    }

    public void setCoursesIds(List<Long> coursesIds) {
        this.coursesIds = coursesIds;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
