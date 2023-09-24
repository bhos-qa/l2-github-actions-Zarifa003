package org.example;

public class StringClass {
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public int findLen(String str) {
        return str.length();
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
