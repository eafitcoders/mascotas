import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
 
public class Decode {
    public static void main(String[] args) {
        if (args.length<1) {
            System.out. println("Formato: Decode imagen");
            System.exit(0);
        }
        String img_in=args[0];
 
        // cargar imagen
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(img_in));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        // obtener mensaje
        for (int i=0; i<(img.getWidth()*img.getHeight())-3; i=i+3){
            char car=' ';
            // primer pixel
            int ycoord=(int)(i/img.getWidth());
            int xcoord=i-(ycoord*img.getWidth());
            int c = img.getRGB(xcoord,ycoord);
            int red = (int)((c & 0x00ff0000) >> 16);
            int green = (int)((c & 0x0000ff00) >> 8);
            int blue = (int)(c & 0x000000ff);
            if (isBitSet((byte)red,0)) {
                car |= 1 << 0;
            } else {
                car &= ~(1 << 0);
            }
            if (isBitSet((byte)green,0)) {
                car |= 1 << 1;
            } else {
                car &= ~(1 << 1);
            }
            if (isBitSet((byte)blue,0)) {
                car |= 1 << 2;
            } else {
                car &= ~(1 << 2);
            }
            // segundo pixel
            ycoord=(int)((i+1)/img.getWidth());
            xcoord=i+1-(ycoord*img.getWidth());
            c = img.getRGB(xcoord,ycoord);
            red = (int)((c & 0x00ff0000) >> 16);
            green = (int)((c & 0x0000ff00) >> 8);
            blue = (int)(c & 0x000000ff);
            if (isBitSet((byte)red,0)) {
                car |= 1 << 3;
            } else {
                car &= ~(1 << 3);
            }
            if (isBitSet((byte)green,0)) {
                car |= 1 << 4;
            } else {
                car &= ~(1 << 4);
            }
            if (isBitSet((byte)blue,0)) {
                car |= 1 << 5;
            } else {
                car &= ~(1 << 5);
            }
   
            // tercer pixel
            ycoord=(int)((i+2)/img.getWidth());
            xcoord=i+2-(ycoord*img.getWidth());
            c = img.getRGB(xcoord,ycoord);
            red = (int)((c & 0x00ff0000) >> 16);
            green = (int)((c & 0x0000ff00) >> 8);
            blue = (int)(c & 0x000000ff);
            if (isBitSet((byte)red,0)) {
                car |= 1 << 6;
            } else {
                car &= ~(1 << 6);
            }
            if (isBitSet((byte)green,0)) {
                car |= 1 << 7;
            } else {
                car &= ~(1 << 7);
            }
   
            if (car=='#') {
                break;
            }
            System.out.print(car);
        }
    }
   
    private static Boolean isBitSet(byte b, int bit) {
        return (b & (1 << bit)) != 0;
    }
}