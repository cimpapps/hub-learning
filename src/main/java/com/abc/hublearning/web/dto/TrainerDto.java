package com.abc.hublearning.web.dto;

import java.util.List;

public class TrainerDto {
    private List<Long> studentsIds;

    private Long idUser;

    public List<Long> getStudentsIds() {
        return studentsIds;
    }

    public void setStudentsIds(List<Long> studentsIds) {
        this.studentsIds = studentsIds;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
