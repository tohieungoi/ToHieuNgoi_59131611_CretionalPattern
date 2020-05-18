/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author tohie
 */
public class ShapeFactory {
    //Singleton
    private static ShapeFactory instance;
    private ShapeFactory(){
        
    }
    public static ShapeFactory createIsntance(){
        if(instance==null) 
           instance = new ShapeFactory();
        return instance;
    }
    //
    // kiem tra singleton
    public int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    //
    protected Shape CreateShape(ShapeType type)
    {
        switch(type)
        {
            case Rectangle : return new Rectangle();
            case Circle : return new Circle();
            case Triangle : return new Triangle();
        }
        return null;
    }
}
