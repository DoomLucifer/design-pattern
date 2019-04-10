package com.doom.lucifer.prototype;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","xx公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006","yy公司");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男","24");
        c.setWorkExperience("1998-2003","zz公司");

        a.display();
        b.display();
        c.display();
    }
}
