package ru.netologyOOP;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
//        для поля имя
        post.name = "Иван";
//        для поля паспорт
        post.passport = "444 № 44444444";
//        для поля отчество
        post.patronymic = "Иванович";
//        для поля телефон
        post.phone = "+7 (999)-999-99-99";
//        для поля фамилия
        post.surname = "Иванов";
//        для поля согласие на рассылки
        post.subscription = String.valueOf(true);
//        для поля дата рождения
        post.birthday = new FormDate();
        post.birthday.day = "13";
        post.birthday.month = "6";
        post.birthday.year = "1999";
    }
}
