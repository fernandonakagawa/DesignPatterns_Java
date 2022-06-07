/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydemo;

public class ImagemProxy implements Image {

    private ImagemReal realImage;
    private String fileName;

    public ImagemProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new ImagemReal(fileName);
        }
        realImage.display();
    }
}
