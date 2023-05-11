/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.library.model;


public class ModelBooks {

    public static void addRow(Object[] novaLinha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String name;
    private String author;
    private String category;
    private String launch;


    public ModelBooks(String name, String author, String category, String launch) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.launch = launch;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the categoria
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the categoria to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the launch
     */
    public String getLaunch() {
        return launch;
    }

    /**
     * @param launch the launch to set
     */
    public void setLaunch(String launch) {
        this.launch = launch;
    }
}