package com.owen.javapro;

public class Solution {

    class Entry {
        String name;
        int phone;
    }

	public static void main(String[] args) {
        Map<Entry> phoneBook = new HashMap<>();
        
        Scanner in = new Scanner(Sytem.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            Entry entry = new Entry();
            entry.name = in.nextLine();
            entry.phone = in.nextInt();            
            phoneBook.put(entry);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(phoneBook.get(s) == null ? "Not found" : phoneBook.name + "=" + phoneBook.phone);
        }
    }

}