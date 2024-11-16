package com.csc;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
    static LinkedList<ChainLink> chain = new LinkedList<>();
    Scanner input = new Scanner(System.in);


    public void append(LinkedList<ChainLink> chain) {
        String color;
        System.out.print("enter your color:\n");
        color = input.next();
        ChainLink customlink = new ChainLink(color);
        chain.add(customlink);
        System.out.print("added " + color + "\n");
    }

    public ChainLink getindex(LinkedList<ChainLink> chain) {
        System.out.print("enter your index:\n");
        int index = input.nextInt();
        while (index > chain.size() || index < chain.size()) {
            System.out.print("Invalid index. Enter your index:\n");
            index = input.nextInt();
        }
        return chain.get(index);
    }
    
    public static void main(String[] args) {
        Linked zelda = new Linked();
        ChainLink linkone = new ChainLink("red");
        ChainLink linktwo = new ChainLink("orange");
        ChainLink linkthree = new ChainLink("Yellow");
        ChainLink linkfour = new ChainLink("green");
        ChainLink linkfive = new ChainLink("blue");
        ChainLink linksix = new ChainLink("purple");
        chain.add(linkone);
        chain.add(linktwo);
        chain.add(linkthree);
        chain.add(linkfour);
        chain.add(linkfive);
        chain.add(linksix);
        System.out.println(chain);
        while (true) {
            zelda.append(Linked.chain);
            System.out.print(zelda.getindex(chain));
        }
    }
}
