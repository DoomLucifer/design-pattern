package com.doom.lucifer.prototype;

import lombok.Data;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
@Data
public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }

    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate,String company){
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display(){
        System.out.println(this.toString());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.work);
        resume.setName(this.name);
        resume.setAge(this.age);
        resume.setSex(this.sex);
        return resume;
    }
}
