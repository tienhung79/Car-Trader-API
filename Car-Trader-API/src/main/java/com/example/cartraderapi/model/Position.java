package com.example.cartraderapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_position")
    private Integer idPosition;

    @Column(name = "name",columnDefinition = "Varchar(30)")
    private String namePosition;


    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Employee> employeeSet;

    public Position() {
    }

    public Position(Integer idPosition, String namePosition, Set<Employee> employeeSet) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.employeeSet = employeeSet;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
