package com.abc.hublearning.web.dto;

import java.util.List;
import java.util.Objects;

public class TrainerDto {
    private Long idUser;
    private List<Long> studentsIds;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerDto that = (TrainerDto) o;
        return idUser.equals(that.idUser) &&
                studentsIds.equals(that.studentsIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, studentsIds);
    }
}
