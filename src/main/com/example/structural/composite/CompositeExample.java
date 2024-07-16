package com.example.structural.composite;

public class CompositeExample {

    public static void main(String[] args) {
        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Images");

        Component file1 = new File("Report.docx");
        Component file2 = new File("Photo.jpg");
        Component file3 = new File("Photo.png");

        folder1.addComponent(file1);
        folder2.addComponent(file2);
        folder2.addComponent(file3);

        Folder mainFolder = new Folder("My Documents");
        mainFolder.addComponent(folder1);
        mainFolder.addComponent(folder2);

        mainFolder.print();
    }
}
