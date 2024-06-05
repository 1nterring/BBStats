package com.uep.wap.dto;

import java.sql.Timestamp;

public class PlayerDTO {
    private String firstName;
    private String lastName;
    private Timestamp dateOfBirth;
    private Float weight;
    private Float height;
    private Float wingspan;
    private Float salary;

        public Float getSalary() {
            return salary;
        }

        public void setSalary(Float salary) {
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Timestamp getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Timestamp dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public Float getWeight() {
            return weight;
        }

        public void setWeight(Float weight) {
            this.weight = weight;
        }

        public Float getHeight() {
            return height;
        }

        public void setHeight(Float height) {
            this.height = height;
        }

        public Float getWingspan() {
            return wingspan;
        }

        public void setWingspan(Float wingspan) {
            this.wingspan = wingspan;
        }



}
