package org.school.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private static final long serialVersionUID = -7049957706738879274L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    int rollNumber;

}
