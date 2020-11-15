package com.lectures.lecture08;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class teacherInfo {
    public static Object set;
    private String name;
    private int age;
    private String address;
    private String work;
    private List<String> courses;



    public class ContactInfo {
        public String postCode;
        private String emailAddress;
        private int phoneNumber;

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    public teacherInfo(String name, int age, String address, String work){
        this.name = name;
        this.age = age;
        this.address = address;
        this.work = work;

    }
}
