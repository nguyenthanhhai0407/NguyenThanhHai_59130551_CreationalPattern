/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap3Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory factory= ShapeFactory.createInstance();
        
        Shape rectangle= factory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Bàn Nhựa");
        rectangle.setFrame("200cm chiều dài");
        rectangle.setPaper("180×140cm cao và rộng");
        
        Shape triangle= factory.createShape(ShapeType.triangle);
        triangle.setBrush("Bàn Nhôm");
        triangle.setFrame("360 chiều dài");
        triangle.setPaper("340×320cm cao và rộng");
        
        Shape circle= factory.createShape(ShapeType.circle);
        circle.setBrush("Bàn Thép");
        circle.setFrame("260cm chiều dài");
        circle.setPaper("246×218cm cao & rộng");
        
        System.out.println("Loại bàn 1:\n"+rectangle.draw()+"\n");
        System.out.println("Loại bàn 2:\n"+triangle.draw()+"\n");
        System.out.println("Loại bàn 3:\n"+circle.draw()+"\n");
    }
    
}

