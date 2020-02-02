package com.abc.hublearning.web.dto;

import java.util.List;
import java.util.Objects;

public class StudentDto {
    private Long userId;
    private List<Long> coursesIds;

    public List<Long> getCoursesIds() {
        return coursesIds;
    }

    public void setCoursesIds(List<Long> coursesIds) {
        this.coursesIds = coursesIds;
    }

    public Long getIdUser() {
        return userId;
    }

    public void setIdUser(Long userId) {
        this.userId = userId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        return userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "userId=" + userId +
                ", coursesIds=" + coursesIds +
                '}';
    }
}
