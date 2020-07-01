package com.company.collections;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        System.out.println("============== 1. Реализовать метод, который принимает на вход 2 листа и возвращает лист, состоящий только из тех элементов, которые присутствуют в обоих листах.");

        User user1 = new User(20, "Amy");
        User user2 = new User(35, "Alice");
        User user3 = new User(35, "Alice");
        User user4 = new User(30, "Kate");
        User user5 = new User(30, "Kate");

        // List
        List<User> list1 = new ArrayList<>();
        list1.add(user1);
        list1.add(user2);
        list1.add(user3);

        List<User> list2 = new ArrayList<>();
        list2.add(user4);
        list2.add(user5);
        list2.add(user2);

        List<User> newList = User.showIntersections(list1, list2);
        for (User el: newList) {
            System.out.println(el.getName() + ": " + el.getAge());
        }


        System.out.println("============== 2. Задание из 1го пункта, но вместо List нужно использовать Set.");

        // Set
        Set<User> set1 = new HashSet<>();
        set1.add(user1);
        set1.add(user2);
        set1.add(user3);

        Set<User> set2 = new HashSet<>();
        set2.add(user4);
        set2.add(user5);
        set2.add(user2);

        Set<User> newSet = User.showIntersections(set1, set2);
        for (User el: newSet) {
            System.out.println(el.getName() + ": " + el.getAge());
        }

        System.out.println("============== 3. Создайте ArrayList с несколькими элементами (используя дубликаты) и проитерируйтесь по нему, выводя на консоль информацию в виде: <индекс>: <элемент>");

        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);

        ListIterator<User> usersListIterator = usersList.listIterator();

        while (usersListIterator.hasNext()) {
           System.out.println(usersListIterator.nextIndex() + " : " + usersListIterator.next());
        }

        System.out.println("============== 4. Создайте HashSet с несколькими элементами (используя дубликаты) и проитерируйтесь по нему, выводя на консоль информацию в виде: <элемент>");

        Set<User> usersSet = new HashSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);
        usersSet.add(user5);

        for (User user : usersSet) {
            System.out.println(user);
        }

        System.out.println("============== 5. Создайте HashMap с несколькими элементами (используя дубликаты) и проитерируйтесь по нему, выводя на консоль информацию в виде:");

        Map<Integer, String> filesCollection = new HashMap<>();
        filesCollection.put(12345, "fileCSV");
        filesCollection.put(54321, "fileJSON");
        filesCollection.put(12545, "fileTXT");
        filesCollection.put(12345, "fileCSV");
        filesCollection.put(13484, "fileXML");

        Iterator filesIterator = filesCollection.entrySet().iterator();

        System.out.println("============== 5a. итерация по значениям: <значение>");
        while (filesIterator.hasNext()) {
            Map.Entry fileEntry = (Map.Entry) filesIterator.next();
            System.out.println(fileEntry.getValue());
        }

        System.out.println("============== 5c. итерация по парам: <ключ>: <значение>");
        Iterator filesIterator2 = filesCollection.entrySet().iterator();

        while (filesIterator2.hasNext()) {
            Map.Entry fileEntry = (Map.Entry) filesIterator2.next();
            System.out.println(fileEntry.getKey() + " : " + fileEntry.getValue());
        }

        System.out.println("============== 5c. итерация по ключам: <ключ>: <значение>");
        Iterator filesIterator3 = filesCollection.entrySet().iterator();

        while (filesIterator3.hasNext()) {
            Map.Entry fileEntry = (Map.Entry) filesIterator3.next();
            System.out.println(filesCollection.get(fileEntry.getKey()));
        }
    }

}
