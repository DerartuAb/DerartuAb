package com.waa.labtwo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Exception extends Logger{
    private String exceptionType;
}
